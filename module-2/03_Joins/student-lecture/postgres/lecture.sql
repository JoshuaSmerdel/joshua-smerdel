-- ********* INNER JOIN ***********

-- Let's find out who made payment 16666:

SELECT *
FROM payment
WHERE payment_id == 16666;

-- Ok, that gives us a customer_id, but not the name. We can use the customer_id to get the name FROM the customer table

SELECT *
FROM payment AS p
         INNER JOIN customer AS c
                    ON p.customer_id = c.customer_id
WHERE p.payment_id = 16666;

-- We can see that the * pulls back everything from both tables. We just want everything from payment and then the first and last name of the customer:

SELECT p.*,
       c.first_name,
       c.last_name
FROM payment AS p
         INNER JOIN customer AS c
                    ON p.customer_id = c.customer_id
WHERE p.payment_id = 16666;

-- But when did they return the rental? Where would that data come from? From the rental table, so let’s join that.

select 

-- What did they rent? Film id can be gotten through inventory.

-- What if we wanted to know who acted in that film?

-- What if we wanted a list of all the films and their categories ordered by film title

-- Show all the 'Comedy' films ordered by film title

-- Finally, let's count the number of films under each category

-- ********* LEFT JOIN ***********

-- (There aren't any great examples of left joins in the "dvdstore" database, so the following queries are for the "world" database)

-- A Left join, selects all records from the "left" table and matches them with records from the "right" table if a matching record exists.

-- Let's display a list of all countries and their capitals, if they have some.

-- Only 232 rows
-- But we’re missing entries:

-- There are 239 countries. So how do we show them all even if they don’t have a capital?
-- That’s because if the rows don’t exist in both tables, we won’t show any information for it. If we want to show data FROM the left side table everytime, we can use a different join:

select c.name,
       c.capital,
       city.name
from country as c
         left join city
                    on c.capital = city.id;

select c.name,
       c.capital,
       city.name
from country as c
         left join city
                    on c.capital = city.id
where city.name is null;

-- *********** UNION *************

select first_name,
       last_name,
       'A' as type
from actor

union

select first_name,
       last_name,
       'C'
from customer
order by last_name,
         first_name;

-- Back to the "dvdstore" database...

-- Gathers a list of all first names used by actors and customers
-- By default removes duplicates

-- Gather the list, but this time note the source table with 'A' for actor and 'C' for customer
