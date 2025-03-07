-- java23-shopping dbp 01.sql 
-- TO4_ITEM_GROUP
use java23_shopping;
create table TO4_ITEM_GROUP(
       CO4_ITEM_GROUP_ID int auto_increment primary key,
       CO4_ITEM_GROUP_NAME varchar(255) not null,
       constraint UNQ_CO2_ITEM_GROUP_NAME unique(CO4_ITEM_GROUP_NAME)
      );
      
      
       
