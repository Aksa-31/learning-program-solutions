DECLARE
   CURSOR cust_cursor IS
      SELECT customer_id, age, loan_interest_rate
      FROM customers;

   cust_rec cust_cursor%ROWTYPE;
BEGIN
   OPEN cust_cursor;
   LOOP
      FETCH cust_cursor INTO cust_rec;
      EXIT WHEN cust_cursor%NOTFOUND;

      IF cust_rec.age > 60 THEN
         UPDATE customers
         SET loan_interest_rate = loan_interest_rate - 1
         WHERE customer_id = cust_rec.customer_id;
      END IF;

   END LOOP;
   CLOSE cust_cursor;

   DBMS_OUTPUT.PUT_LINE('Interest rates for customers above 60.');
END;
/