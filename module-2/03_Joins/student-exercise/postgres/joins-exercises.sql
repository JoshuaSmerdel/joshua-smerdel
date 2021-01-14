-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)

SELECT title AS "Nick Stallone Films"
FROM film
         JOIN film_actor USING (film_id)
         JOIN actor USING (actor_id)
WHERE LOWER(first_name) = 'nick'
  AND LOWER(last_name) = 'stallone';

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

SELECT title AS "Rita Reynolds films"
FROM film
         JOIN film_actor USING (film_id)
         JOIN actor USING (actor_id)
WHERE LOWER(first_name) = 'rita'
  AND LOWER(last_name) = 'reynolds';

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

SELECT title AS "Judy and River Dean films"
FROM film
         JOIN film_actor USING (film_id)
         JOIN actor USING (actor_id)
WHERE LOWER(first_name) = 'Judy'
   OR LOWER(first_name) = 'river'
    AND LOWER(last_name) = 'dean';

-- 4. All of the the ‘Documentary’ films
-- (68 rows)

SELECT title AS documentaries
FROM film
         JOIN film_category USING (film_id)
         JOIN category USING (category_id)
WHERE LOWER(name) = 'documentary';


-- 5. All of the ‘Comedy’ films
-- (58 rows)

SELECT title AS comedies
FROM film
         JOIN film_category USING (film_id)
         JOIN category USING (category_id)
WHERE LOWER(name) = 'comedy';

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

SELECT title AS "Rated: G Childrens films"
FROM film
         JOIN film_category USING (film_id)
         JOIN category USING (category_id)
WHERE LOWER(rating) = 'g'
  AND LOWER(name) = 'children';


-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

SELECT title AS "Rated: G Family films under 2hrs"
FROM film
         JOIN film_category USING (film_id)
         JOIN category USING (category_id)
WHERE LOWER(name) = 'family'
  AND LOWER(rating) = 'g'
  AND length < 121;

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

SELECT title AS "Rated: G Matthew Leigh films"
FROM film
         JOIN film_actor USING (film_id)
         JOIN actor USING (actor_id)
WHERE LOWER(rating) = 'g'
  AND LOWER(first_name) = 'matthew'
  AND LOWER(last_name) = 'leigh';

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

SELECT title AS "2006 Sci-Fi"
FROM film
         JOIN film_category USING (film_id)
         JOIN category USING (category_id)
WHERE LOWER(name) = 'sci-fi'
  AND release_year = 2006;

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

SELECT title AS "Nick Stallone Action films"
FROM film
         JOIN film_category USING (film_id)
         JOIN category USING (category_id)
         JOIN film_actor USING (film_id)
         JOIN actor USING (actor_id)
WHERE LOWER(name) = 'action'
  AND LOWER(first_name) = 'nick'
  AND LOWER(last_name) = 'stallone';

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

SELECT CONCAT(address, ', ', city.city, ', ', district, ', ', country.country) AS store
FROM store
         JOIN address USING (address_id)
         JOIN city USING (city_id)
         JOIN country USING (country_id);


-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

SELECT store_id,
       address,
       CONCAT(first_name, ' ', last_name) AS manager
FROM store
         JOIN address USING (address_id)
         JOIN staff USING (store_id);

-- 13. The first and last name of the top ten customers ranked by number of rentals
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)

SELECT CONCAT(first_name, ' ', last_name) AS "Top 10 Customers",
       COUNT(customer_id)                 AS rentals
FROM customer
         JOIN rental USING (customer_id)
GROUP BY customer_id
ORDER BY rentals DESC
LIMIT 10;

-- 14. The first and last name of the top ten customers ranked by dollars spent
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)

SELECT CONCAT(first_name, ' ', last_name) AS "Top 10 Customers",
       SUM(amount)                        AS "Total Spent"
FROM customer
         JOIN payment USING (customer_id)
GROUP BY "Top 10 Customers"
ORDER BY "Total Spent" DESC
LIMIT 10;

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store.
-- (NOTE: Keep in mind that an employee may work at multiple stores.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

SELECT store.store_id     AS store,
       address.address    AS address,
       COUNT(rental_id)   AS "Total Rentals",
       money(SUM(amount)) AS "Total Sales",
       money(AVG(amount)) AS "Average Sale"
FROM store
         JOIN inventory USING (store_id)
         JOIN address USING (address_id)
         JOIN rental USING (inventory_id)
         JOIN payment USING (rental_id)
GROUP BY store, address.address;

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

SELECT film.title       AS title,
       COUNT(rental_id) AS num_rentals
FROM film
         JOIN inventory USING (film_id)
         JOIN rental USING (inventory_id)
GROUP BY film.title
ORDER BY num_rentals DESC
LIMIT 10;

-- 17. The top five film categories by number of rentals
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)

SELECT category.name           AS film_genre,
       COUNT(rental.rental_id) AS rentals
FROM category
         JOIN film_category USING (category_id)
         JOIN inventory USING (film_id)
         JOIN rental USING (inventory_id)
GROUP BY name
ORDER BY rentals DESC
LIMIT 5;

-- 18. The top five Action film titles by number of rentals
-- (#1 should have 30 rentals and #5 should have 28 rentals).

SELECT film.title              AS film_title,
       category.name           AS genre,
       COUNT(rental.rental_id) AS rentals
FROM film
         JOIN film_category USING (film_id)
         JOIN category USING (category_id)
         JOIN inventory USING (film_id)
         JOIN rental USING (inventory_id)
WHERE category.name ILIKE 'action'
GROUP BY film_title, genre
ORDER BY rentals DESC
LIMIT 5;

-- 19. The top 10 actors ranked by number of rentals of films starring that actor
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

SELECT CONCAT(actor.first_name, ' ', actor.last_name) AS actor_name,
       COUNT(DISTINCT rental.rental_id)               AS rentals
FROM actor
         JOIN film_actor USING (actor_id)
         JOIN film USING (film_id)
         JOIN inventory USING (film_id)
         JOIN rental USING (inventory_id)
GROUP BY actor_id
ORDER BY rentals DESC
LIMIT 10;

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor
-- (#1 should have 87 rentals and #5 should have 72 rentals)

SELECT CONCAT(a.first_name, ' ', a.last_name) AS actor_name,
       COUNT(r.rental_id)                     AS rentals
FROM actor a
         JOIN film_actor fa ON a.actor_id = fa.actor_id
         JOIN film f ON fa.film_id = f.film_id
         JOIN film_category fc ON f.film_id = fc.film_id
         JOIN category c ON fc.category_id = c.category_id
         JOIN inventory i ON f.film_id = i.film_id
         JOIN rental r ON i.inventory_id = r.inventory_id
WHERE c.name ILIKE 'comedy'
GROUP BY actor_name
ORDER BY rentals DESC
LIMIT 5;