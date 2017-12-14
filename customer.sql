create table customer (
id integer not null,
name varchar(50) not null,
email varchar(150) not null,
constraint pk_customer primary key (id)
);
create sequence seq_customer;