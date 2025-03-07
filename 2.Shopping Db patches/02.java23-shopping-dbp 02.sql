-- java23-shopping dbp 02.sql 
-- TO1_ITEM, TO2_SIZE, TO3_ITEM_DETAIL, TO5_GALLERY

create table TO1_ITEM (
   C01_ITEM_ID int auto_increment,
   CO1_ITEM_NAME varchar(255) NOT NULL,
   CO1_ITEM_GROUP_ID int NOT NULL,
   primary key (C01_ITEM_ID),
   constraint FK_TO1_TO4 foreign key (CO1_ITEM_GROUP_ID) references TO4_ITEM_GROUP(CO4_ITEM_GROUP_ID),
   constraint UNQ_CO1_ITEM_NAME unique(CO1_ITEM_NAME)
);

create table TO2_SIZE(
   CO2_SIZE_ID int auto_increment,
   CO2_SIZE_NAME varchar(5) NOT NULL,
   CO2_GENDER bit(1)NOT NULL,
   CO2_SIZE_DESC text NOT NULL,
   primary key (CO2_SIZE_ID),
   constraint UNQ_CO2_SIZE_NAME_GENDER unique(CO2_SIZE_NAME,CO2_GENDER),
   constraint CO2_SIZE_NAME_CHECK check (CO2_SIZE_NAME in ('S','M','L','XL','XXL','XXXL'))
   );
   
   create table TO3_ITEM_DETAIL (
      CO3_ITEM_DETAIL_ID int auto_increment,
      CO3_ITEM_ID int NOT NULL, 
      CO3_SIZE_ID int NOT NULL,
      CO3_COLOR varchar(50) NOT NULL,
      CO3_SALES_PRICE float, -- hàng mơí mua chưa xác định giá bán 
      CO3_AMOUNT int NOT NULL default(0),
      primary key (CO3_ITEM_DETAIL_ID),
      constraint FK_TO3_TO1 foreign key (CO3_ITEM_ID) references TO1_ITEM(CO1_ITEM_ID),
      constraint FK_TO3_TO2 foreign key (CO3_SIZE_ID) references TO2_SIZE(CO2_SIZE_ID),
      constraint UNQ_CO2_ITEM_SIZE_COLOR unique(CO3_ITEM_ID, CO3_SIZE_ID, CO3_COLOR)
   );
   
   create table TO5_GALLERY(
     CO5_ITEM_ID int,
	 CO5_COLOR varchar(50),
     CO5_IMAGE varchar(255) NOT NULL,
     primary key (CO5_ITEM_ID, CO5_COLOR),
     constraint UNQ_CO5_IMAGE unique(CO5_IMAGE)
     );
     
     alter table TO5_GALLERY
     add constraint FK_TO5_TO1 foreign key (CO5_ITEM_ID) references TO1_ITEM(CO1_ITEM_ID);