-- COMMIT ROLLBACK --> UPDATE/DELETE/INSERT

-- Mặc định: auto commit = true --> khi thực thi một câu lệnh update thì dữ liệu đó sẽ ngay lặp tức ăn vào CSDL đang thao tác
-- Có thể Set lại: auto commit = false
-- --> Sau khi thực thi 1 câu lệnh update thì dữ liệu sẽ được lưu vào bộ nhớ tạm
-- + thực hiện commit --> dữ liệu mới ăn vào CSDL
-- + thực hiện rollback --> dữ liệu sẽ quay trở về trạng thái như chưa thực thi

SET autocommit = 0;

INSERT INTO T04_ITEM_GROUP (C04_ITEM_GROUP_NAME) VALUES ('Grx');

DELETE FROM T04_ITEM_GROUP WHERE C04_ITEM_GROUP_NAME = 'Grx';

SELECT * FROM T04_ITEM_GROUP ORDER BY C04_ITEM_GROUP_ID;

ROLLBACK;

COMMIT;

