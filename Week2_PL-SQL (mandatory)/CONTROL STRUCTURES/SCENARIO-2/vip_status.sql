DECLARE
   CURSOR cust_cursor IS
      SELECT customer_id, balance
      FROM customers;

   cust_rec cust_cursor%ROWTYPE;
BEGIN
   OPEN cust_cursor;
   LOOP
      FETCH cust_cursor INTO cust_rec;
      EXIT WHEN cust_cursor%NOTFOUND;

      IF cust_rec.balance > 10000 THEN
         UPDATE customers
         SET is_vip = 'TRUE'
         WHERE customer_id = cust_rec.customer_id;
      END IF;

   END LOOP;
   CLOSE cust_cursor;

   DBMS_OUTPUT.PUT_LINE('VIP status updated.');
END;
/