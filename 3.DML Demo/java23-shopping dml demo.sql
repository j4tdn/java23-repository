-- COMMIT ROLLBACK --> UPDATE/DELETE/INSERT --> update

-- Mặc định: auto commit = true 
-- --> khi thực thi 1 câu lệnh update thì dữ liệu đó sẽ ngay lập tức ăn vào CSDL đang thao tác


-- Set lại : auto commit = false
-- --> khi thực thi 1 câu lệnh update thì dữ liệu sẽ được lưu vào bộ nhớ tạm
-- + thực hiện commit --> dữ liệu mới ăn vào CSDL
-- + thực hiện rollback --> dữ liệu sẽ quay trở về trạng thái như chưa thực thi

SET autocommit = 0; 

INSERT INTO t04_item_group(C04_ITEM_GROUP_NAME) VALUES("Grx");

DELETE FROM t04_item_group WHERE C04_ITEM_GROUP_NAME = 'Grx';

SELECT * FROM t04_item_group ORDER BY C04_ITEM_GROUP_ID;

ROLLBACK;

COMMIT;