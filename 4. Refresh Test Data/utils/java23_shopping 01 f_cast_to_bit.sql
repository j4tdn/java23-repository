DROP FUNCTION IF EXISTS f_cast_to_bit;

DELIMITER $$

CREATE FUNCTION f_cast_to_bit (val INT) RETURNS BIT(1)
BEGIN
    RETURN val;
END

-- SET GLOBAL log_bin_trust_function_creators = 1;
