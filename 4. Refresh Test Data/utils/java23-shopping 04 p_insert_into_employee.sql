-- Hỗ trợ xử lý hàm trong sql

-- function: hàm có return dữ liệu
--         : tính toán, cần reuse kết quả

-- procedure: hàm return void
--          : insert/update/detelete
--          : select

-- sử dụng khi có đoạn code logic trùng lặp nhau, thay vì copy đi lại nhiều lần
-- tạo hàm hàm xử lý sau đó gọi hàm ngắn gọn
-- hỗ trợ vòng lặp, điều kiện tương tự lập trình --> xử lý các bài toán phức tạp hơn

DROP PROCEDURE IF EXISTS p_insert_into_employee;

DELIMITER $$

CREATE PROCEDURE p_insert_into_employee()
BEGIN
    -- Khai báo biến
	DECLARE max INT DEFAULT 13;
    DECLARE running INT DEFAULT 1;

    WHILE running <= max DO
		
        INSERT INTO T08_EMPLOYEE(
			C08_EMPLOYEE_ID,
            C08_EMPLOYEE_NAME,
            C08_EMPLOYEE_PHONE,
            C08_EMPLOYEE_EMAIL,
            C08_EMPLOYEE_GENDER,
            C08_EMPLOYEE_DOB,
            C08_USERNAME,
            C08_PASSWORD,
            C08_ACCOUNT_STATUS,
            C08_ROLE_ID
        )
        VALUES(
			running,
            concat('Nhân viên ', running),
            concat(running, '333'),
            concat('nv1', running, '@gmail.com'),
			f_cast_to_bit(elt(f_random(2), 0, 1)),
            DATE_SUB(DATE_SUB(current_timestamp(), INTERVAL running YEAR), INTERVAL running DAY),
            concat('nv', running, if(running MOD 2 != 0,  'def', 'auto')),
            '$2a$12$w0bs0MW/O3nTyMhuv0r1jOjq2gOaxLxkZgms7u/khHRmtCh3S/Hpu',
            1,
            2 -- update manually
		);
		SET running = running + 1;
    END WHILE;
END $$