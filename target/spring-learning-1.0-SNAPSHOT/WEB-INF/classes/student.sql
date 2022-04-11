-- auto-generated definition
create table student
(
    sid          varchar(64)  not null comment '编码id'
        primary key,
    name         varchar(64)  null comment '中文名字',
    english_name varchar(64)  null comment '英文名字',
    address      varchar(128) null comment '家庭住址',
    phone_number varchar(11)  null comment '手机号码',
    birthday     date         null comment '生日'
)
    comment '简单学生信息表';