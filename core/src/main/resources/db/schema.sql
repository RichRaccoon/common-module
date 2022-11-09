create table debug(
    uuid varchar PRIMARY KEY,
    system_type_id int NOT NULL,
    method_params varchar
);

create table exception(
    uuid varchar PRIMARY KEY,
    system_type_id int NOT NULL,
    method_params varchar
);