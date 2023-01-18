-- auto-generated definition
create table students
(
    id      serial
        primary key,
    name    varchar(45)  not null,
    surname varchar(100) not null,
    course  integer      not null
);

select *
FROM students

