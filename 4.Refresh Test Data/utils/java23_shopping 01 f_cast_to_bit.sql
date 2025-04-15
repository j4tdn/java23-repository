DROP FUNCTION IF EXISTS f_cast_to_bit;

DELIMITER $$

CREATE FUNCTION f_cast_to_bit (val INT) RETURNS BIT(1)
BEGIN
    RETURN val;
END

-- Error Code: 1418. This function has none of DETERMINISTIC, NO SQL, or READS SQL DATA in its declaration and binary logging is enabled (you *might* want to use the less safe log_bin_trust_function_creators variable)	0.015 sec
