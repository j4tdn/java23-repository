	DROP FUNCTION IF EXISTS f_random;

DELIMITER $$

CREATE FUNCTION f_random(maxInclusive INT)
RETURNS INT
BEGIN
    RETURN floor(rand() * maxInclusive + 1);
END $$
-- Error Code: 1418. This function has none of DETERMINISTIC, NO SQL, or READS SQL DATA in its declaration and binary logging is enabled (you *might* want to use the less safe log_bin_trust_function_creators variable)
