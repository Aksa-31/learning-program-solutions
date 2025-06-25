DECLARE
   CURSOR loan_cursor IS
      SELECT loan_id, customer_id, due_date
      FROM loans
      WHERE due_date <= SYSDATE + 30;

   loan_rec loan_cursor%ROWTYPE;
BEGIN
   OPEN loan_cursor;
   LOOP
      FETCH loan_cursor INTO loan_rec;
      EXIT WHEN loan_cursor%NOTFOUND;

      DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan_rec.loan_id ||
                           ' for Customer ID ' || loan_rec.customer_id ||
                           ' is due on ' || TO_CHAR(loan_rec.due_date, 'DD-MON-YYYY'));

   END LOOP;
   CLOSE loan_cursor;
END;
/