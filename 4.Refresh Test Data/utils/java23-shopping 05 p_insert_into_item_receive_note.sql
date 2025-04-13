DROP PROCEDURE IF EXISTS p_insert_into_item_received_note;

DELIMITER $$

CREATE PROCEDURE p_insert_into_item_received_note()
BEGIN
    -- Khai báo biến
	DECLARE max INT DEFAULT 10;
    DECLARE running INT DEFAULT 1;

    WHILE running <= max DO
		
        INSERT INTO T17_ITEM_RECEIVED_NOTE(
			C17_IRN_ID,
            C17_IRN_TIME,
            C17_EMPLOYEE_ID
        )
        VALUES(
			running,
            DATE_SUB(current_timestamp(), INTERVAL running DAY),
            elt(floor(rand()*3 + 1), 6,8,9)
		);
		SET running = running + 1;
    END WHILE;
END $$