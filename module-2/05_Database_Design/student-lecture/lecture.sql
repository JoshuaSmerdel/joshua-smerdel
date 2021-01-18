-- DDL - Data Definition Language
-- CREATE table
-- DROP table
-- ALTER table

-- 1. drop all tables
DROP TABLE customer;
DROP TABLE sale;
DROP TABLE sale_line_item;
drop table art;
drop TABLE artist;

-- can use "drop table if exists" in cases where table does not exist yet.

-- 2. create all tables
CREATE TABLE customer
-- column_name datatype NULL/NOT NULL constraints
(
    customer_id    serial      NOT NULL PRIMARY KEY,
    first_name     varchar(50) NOT NULL,
    last_name      varchar(50) NOT NULL,
    street_address varchar(50) NULL,
    city           varchar(20) NULL,
    state          char(2)     NULL,
    zip            varchar(10) NULL,
    phone          varchar(15) NOT NULL
);

CREATE TABLE sale
(
    sale_id       serial  NOT NULL PRIMARY KEY,
    customer_id   integer NOT NULL,
    purchase_date date    NOT NULL,
);

CREATE TABLE sale_line_item
(
    sale_id integer        NOT NULL,
    art_id  integer        NOT NULL,
    price   decimal(10, 2) NOT NULL,
    PRIMARY KEY (sale_id, art_id)
);

CREATE TABLE art
(
    art_id    serial       NOT NULL,
    artist_id integer      NOT NULL,
    title     varchar(255) NOT NULL,
    PRIMARY KEY (art_id)
);

CREATE TABLE artist
(
    artist_id integer      NOT NULL,
    name      varchar(100) NOT NULL,

);

-- 3. add relationships

alter table sale -- which table we are altering
add CONSTRAINT fk_customer_sale -- name of the constraint
FOREIGN KEY (customer_id) --which column in the sale table
references customer (customer_id); --points to other table and column

alter table sale_line_item
add CONSTRAINT fk_sale_sale_line_item
FOREIGN KEY (sale_id)
REFERENCES sale(sale_id);

alter table art
add CONSTRAINT fk_artist_art
FOREIGN KEY (art_id)
REFERENCES sale(sale_id);

-- 4. populate the tables