CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE accounts
  SET balance = balance + (balance * 0.01)
  WHERE account_type = 'Savings';
END;
/

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  dept_id IN NUMBER,
  bonus_percent IN NUMBER
) IS
BEGIN
  UPDATE employees
  SET salary = salary + (salary * bonus_percent / 100)
  WHERE department_id = dept_id;
END;
/

CREATE OR REPLACE PROCEDURE TransferFunds(
  from_account_id IN NUMBER,
  to_account_id IN NUMBER,
  amount IN NUMBER
) IS
  from_balance NUMBER;
BEGIN
  SELECT balance INTO from_balance FROM accounts WHERE account_id = from_account_id FOR UPDATE;

  IF from_balance < amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance');
  END IF;

  UPDATE accounts
  SET balance = balance - amount
  WHERE account_id = from_account_id;

  UPDATE accounts
  SET balance = balance + amount
  WHERE account_id = to_account_id;
END;
/
