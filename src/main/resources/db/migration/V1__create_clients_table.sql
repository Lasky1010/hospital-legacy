create database if not exists hospital_legacy;
create table if not exists clients
(
    guid              binary(16) not null primary key,
    dob               date,
    created_date_time datetime(6),
    agency            varchar(255),
    first_name        varchar(255),
    last_name         varchar(255),
    status            varchar(255)
);