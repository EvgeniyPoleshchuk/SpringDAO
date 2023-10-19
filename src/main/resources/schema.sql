create table Customers
(
    id           serial primary key,
    name         varchar,
    surname      varchar,
    age          int,
    phone_Number varchar
);
insert into Customers(name, surname, age, phone_number)
VALUES ('ANTON', 'Ivanov', 24, '89211122233');

create table Orders
(
    id           serial primary key,
    date         varchar,
    customer_id  int,
    FOREIGN KEY (customer_id) REFERENCES customers (id),
    product_name varchar,
    amount       int

);
insert into Orders(date, customer_id,product_name,amount)
    VALUES ('24.05.2023',1,'TABLE',1233)

