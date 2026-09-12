
DROP PROCEDURE mergeItemGroup;

DELIMITER $$
CREATE PROCEDURE mergeItemGroup(p_group_id INT, p_group_name VARCHAR(255))
BEGIN
	DECLARE countById INT DEFAULT (SELECT count(*) FROM t04_item_group WHERE C04_ITEM_GROUP_ID = p_group_id);
	DECLARE countByName INT DEFAULT (SELECT count(*) FROM t04_item_group WHERE C04_ITEM_GROUP_NAME = p_group_name);
	
    IF (countById = 0) THEN
        IF (countByName = 0) THEN
			INSERT INTO t04_item_group(C04_ITEM_GROUP_ID, C04_ITEM_GROUP_NAME)
			VALUES(p_group_id, p_group_name);
		END IF;
    ELSE
		UPDATE t04_item_group
           SET C04_ITEM_GROUP_NAME = p_group_name
         WHERE C04_ITEM_GROUP_ID = p_group_id;
	END IF;
END $$



