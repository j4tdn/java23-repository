-- Khi thực thi 1 câu lệnh update thì dữ liệu đso sẽ ngay lập tức ăn vào csdl đang thao tác

-- Set lại: auto commit = false 
-- Khi thực thi 1 câu lênh update thì dữ liệu sẽ được lưu vào bộ nhớ tạm 
-- Thực thi commit --> dữ liệu mới ăn vào csdl 
-- thực thi rollback --> dữ liệu sẽ quay trở về trong trạng thái chưa đuocwj thực thi 

SET autocommit = 0;

INSERT INTO T04_ITEM_GROUP(C04_ITEM_GROUP_NAME) values("Grx");

DELETE FROM t04_item_group where c04_item_group_name = "Grx";

SELECT * from t04_item_group order by c04_item_group_id;

rollback;

commit;