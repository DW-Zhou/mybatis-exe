-- 建表语句
create table user(
                     id bigint(10) not null auto_increment  comment '主键',
                     user_name varchar(20) default null comment '名字',
                     address varchar(20) default null comment '地址',
                     color varchar(20) default null comment '颜色',
                     country varchar(20) default null comment '城市',
                     primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;