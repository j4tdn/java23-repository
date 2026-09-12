-- Hỗ trợ xử lý hàm trong sql

-- function: hàm có return dữ liệu
--         : tính toán, cần reuse kết quả

-- procedure: hàm return void
--          : insert/update/detelete
--          : select

-- sử dụng khi có đoạn code logic trùng lặp nhau, thay vì copy đi lại nhiều lần
-- tạo hàm hàm xử lý sau đó gọi hàm ngắn gọn
-- hỗ trợ vòng lặp, điều kiện tương tự lập trình --> xử lý các bài toán phức tạp hơn

DROP PROCEDURE IF EXISTS p_insert_into_size;

DELIMITER $$

CREATE PROCEDURE p_insert_into_size()
BEGIN
    -- Khai báo biến
	DECLARE max_size_id INT DEFAULT 10;
    DECLARE running INT DEFAULT 1;
    DECLARE is_female BIT(1);
    DECLARE size_name VARCHAR(50);
    
    WHILE running <= max_size_id DO
		SET is_female = running <= 5;
        SET size_name = elt(if(is_female, running, running - 5), 'S', 'M', 'L', 'XL', 'XXL');
        INSERT INTO T02_SIZE(C02_SIZE_ID,C02_SIZE_NAME,C02_GENDER,C02_SIZE_DESC)
        VALUES(
			running, 
            size_name, 
            if(is_female, 0, 1),
            concat("Size '", size_name, "' cho ", + if(is_female, 'Nữ', 'Nam')) 
		);
		SET running = running + 1;
    END WHILE;
END $$
