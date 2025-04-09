SET FOREIGN_KEY_CHECKS = 0; -- disable fk

TRUNCATE TABLE t01_item;
TRUNCATE TABLE t02_size;
TRUNCATE TABLE t03_item_detail;
TRUNCATE TABLE t04_item_group;
TRUNCATE TABLE t05_gallery;
TRUNCATE TABLE t06_order;
TRUNCATE TABLE t07_customer;
TRUNCATE TABLE t08_employee;
TRUNCATE TABLE t10_role;
TRUNCATE TABLE t11_order_status;
TRUNCATE TABLE t12_order_status_detail;
TRUNCATE TABLE t13_payment_method;
-- TRUNCATE TABLE t14_title;
TRUNCATE TABLE t15_bill;
TRUNCATE TABLE t16_order_detail;
TRUNCATE TABLE t17_item_received_note;
TRUNCATE TABLE t18_item_received_note_detail;
TRUNCATE TABLE t19_provider;
-- TRUNCATE TABLE t20_item_group_backup;

SET FOREIGN_KEY_CHECKS = 1; -- enable fk