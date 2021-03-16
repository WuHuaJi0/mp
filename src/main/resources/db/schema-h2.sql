create table user(
    id bigint(20) not null comment 'id',
    name varchar(30) null default null comment 'name',
    age int null default null comment 'age',
    email varchar(50) null default null comment 'email',
    primary key (id)
);
