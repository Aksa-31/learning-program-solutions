CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
   CURSOR savings_cursor IS
      SELECT account_id, balance
      FROM accounts
      WHERE account_type = 'Savings';

   acc_rec savings_cursor%ROWTYPE;
BEGIN
   OPEN savings_cursor;
   LOOP
      FETCH savings_cursor INTO acc_rec;
      EXIT WHEN savings_cursor%NOTFOUND;

      UPDATE accounts
      SET balance = acc_rec.balance + (acc_rec.balance * 0.01)
      WHERE account_id = acc_rec.account_id;

   END LOOP;
   CLOSE savings_cursor;

   DBMS_OUTPUT.PUT_LINE('Monthly interest applied to all savings accounts.');
END;
/
