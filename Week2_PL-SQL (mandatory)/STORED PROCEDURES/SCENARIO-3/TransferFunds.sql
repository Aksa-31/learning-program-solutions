CREATE OR REPLACE PROCEDURE TransferFunds (
   from_acct IN NUMBER,
   to_acct IN NUMBER,
   amount IN NUMBER
) IS
   from_balance NUMBER;
BEGIN
   SELECT balance INTO from_balance
   FROM accounts
   WHERE account_id = from_acct;

   IF from_balance >= amount THEN
      UPDATE accounts
      SET balance = balance - amount
      WHERE account_id = from_acct;

      UPDATE accounts
      SET balance = balance + amount
      WHERE account_id = to_acct;

      DBMS_OUTPUT.PUT_LINE('Transfer of ' || amount || ' completed.');
   ELSE
      DBMS_OUTPUT.PUT_LINE('Insufficient balance.');
   END IF;
END;
/
