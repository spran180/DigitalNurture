-- Scenario 1: Apply 1% interest discount for customers above 60

BEGIN
  FOR cust IN (SELECT customer_id FROM customers WHERE age > 60) LOOP
    UPDATE loans
    SET interest_rate = interest_rate - 1
    WHERE customer_id = cust.customer_id;
  END LOOP;
END;
/

-- Scenario 2: Promote customers with balance over $10,000 to VIP
BEGIN
  FOR cust IN (SELECT customer_id FROM customers WHERE balance > 10000) LOOP
    UPDATE customers
    SET IsVIP = 'TRUE'
    WHERE customer_id = cust.customer_id;
  END LOOP;
END;
/

-- Scenario 3: Send reminders for loans due in the next 30 days
BEGIN
  FOR loan_rec IN (
    SELECT customer_id, due_date
    FROM loans
    WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Customer ' || loan_rec.customer_id || ' has a loan due on ' || TO_CHAR(loan_rec.due_date, 'DD-MON-YYYY'));
  END LOOP;
END;
/
