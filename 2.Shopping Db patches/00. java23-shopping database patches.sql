-- {\rtf1\ansi\ansicpg1252\cocoartf2759
-- \cocoatextscaling0\cocoaplatform0{\fonttbl}
-- {\colortbl;\red255\green255\blue255;}
-- {\*\expandedcolortbl;;}
-- \paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
-- }

create DATABASE java23_shopping char set utf8mb4;

-- step by step to create database patches 
-- java23-shopping dbp 01.sql 
-- TO4-ITEM_GROUP 

-- java23-shopping dbp 02.sql 
-- TO1_ITEM, TO2_SIZE, TO3_ITEM_DETAIL, TO5_GALLERY

-- java23-shopping dbp 03.sql 
-- TO9_ACCOUNT, T10_ROLE 

-- java23-shopping dbp 04.sql 
-- T14_TITLE, T08_EMPLOYEE, TO7_CUSTOMER 

-- java23-shopping dbp 05.sql 
-- T13_PAYMENT_METHOD, TO6_ORDER, T15_BILL, T16_ORDER_DETAIL 

-- java23-shopping dbp 06.sql 
-- T11_ORDER_STATUS, T12_ORDER_DETAIL

-- java23-shopping dbp 07.sql 
-- T17_ITEM_RECEIVED_NOTE, T18_ITEM_RECEIVED_NOTE_DETAIL, T19_PROVIDER

