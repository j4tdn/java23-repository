DROP PROCEDURE IF EXISTS p_insert_into_customer;
 
 DELIMITER $$
 
 CREATE PROCEDURE p_insert_into_customer()
 BEGIN
     -- Khai báo biến
 	DECLARE max INT DEFAULT 10;
     DECLARE running INT DEFAULT 1;
 
     WHILE running <= max DO
 		
         INSERT INTO T07_CUSTOMER(
 			C07_CUSTOMER_ID,
            C07_CUSTOMER_NAME,
            C07_CUSTOMER_PHONE,
            C07_CUSTOMER_EMAIL,
            C07_CUSTOMER_GENDER,
            C07_CUSTOMER_DOB,
            C07_CUSTOMER_ADDRESS,
            C07_ACCOUNT_ID
 
         )
         VALUES(
 			running,
             concat('Khách Hàng', running),
             '123456789',
             concat('kh', running, '@gmail.com'),
             elt(f_random(2), 0, 1),
            f_cast_to_bit(elt(f_random(2), 0, 1)),
             DATE_SUB(DATE_SUB(current_timestamp(), INTERVAL running YEAR), INTERVAL running DAY),
             concat('nv', running, if(running MOD 2 != 0,  'def', 'auto')),
             '$2a$12$w0bs0MW/O3nTyMhuv0r1jOjq2gOaxLxkZgms7u/khHRmtCh3S/Hpu',
             1
             
 		);
 		SET running = running + 1;
     END WHILE;
 END $$
 
 