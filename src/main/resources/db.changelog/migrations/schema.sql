create table Customers
(
    id           serial primary key,
    name         varchar,
    surname      varchar,
    age          int,
    phone_Number varchar
);


create table Orders
(
    id           serial primary key,
    date         varchar,
    customer_id  int,
    FOREIGN KEY (customer_id) REFERENCES customers (id),
    product_name varchar,
    amount       int

);


