DROP FUNCTION IF EXISTS f_random;
 
 DELIMITER $$
 
 -- random a number from 1(inclusive) to maxInclusive
 
 CREATE FUNCTION f_random(maxInclusive INT)
 RETURNS INT
 BEGIN
     RETURN floor(rand() * maxInclusive + 1);
 END $$