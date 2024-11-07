create table if not exists notes
(
    guid              binary(16) not null primary key,
    created_datetime  datetime(6),
    datetime          datetime(6),
    modified_datetime datetime(6),
    client_guid       binary(16),
    comments          varchar(255),
    logged_user       varchar(255)
);
alter table notes
    add constraint fk_client_guid foreign key (client_guid) references clients (guid)