-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)

select title as "Nick Stallone Films"
from film
join film_actor using (film_id)
join actor using (actor_id)
where lower (first_name) = 'nick'
and lower (last_name) = 'stallone';

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

select title as "Rita Reynolds films"
from film
join film_actor using (film_id)
join actor using (actor_id)
where  lower (first_name) = 'rita'
and lower (last_name) = 'reynolds';

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

select title as "Judy and River Dean films"
from film
join film_actor using (film_id)
join actor using (actor_id)
where lower (first_name) = 'Judy' or lower (first_name) = 'river'
and lower (last_name) = 'dean';

-- 4. All of the the ‘Documentary’ films
-- (68 rows)

select title as documentaries
from film
join film_category using (film_id)
join category using (category_id)
where lower (name) = 'documentary';


-- 5. All of the ‘Comedy’ films
-- (58 rows)

select title as comedies
from film
join film_category using (film_id)
join category using (category_id)
where lower (name) = 'comedy';

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

select title as "Rated: G Childrens films"
from film
join film_category using (film_id)
join category using (category_id)
where lower (rating) = 'g' and lower (name) = 'children';


-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

select title as "Rated: G Family films under 2hrs"
from film
join film_category using (film_id)
join category using (category_id)
where lower (name) = 'family'
and lower (rating) = 'g'
and length < 121;

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

select title as "Rated: G Matthew Leigh films"
from film
join film_actor using (film_id)
join actor using ( actor_id)
where lower (rating) = 'g'
and lower (first_name) = 'matthew'
and lower (last_name) = 'leigh';

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

select title as "2006 Sci-Fi"
from film
join film_category using (film_id)
join category using (category_id)
where lower (name) = 'sci-fi'
and release_year = 2006;

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

select title as "Nick Stallone Action films"
join film_category using (film_id)
join category using (category_id)
join film_actor using (film_id)
join actor using (actor_id)
where name ilike 'action'
and lower (first_name) = 'nick'
and lower (last_name) = 'stallone';

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

select  concat (address, ', ', city.city, ', ', district, ', ', country.country) as store
from store
join address using (address_id)
join city using (city_id)
join country using (country_id);


-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

select store_id,
       address,
       concat (first_name,' ', last_name) as manager
from store
join address using (address_id)
join staff using (store_id);

-- 13. The first and last name of the top ten customers ranked by number of rentals
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)

select concat (first_name, ' ', last_name) as "Top 10 Customers",
       count(customer_id) as rentals
from customer
join rental using (customer_id)
group by customer_id
order by rentals desc
limit 10;

-- 14. The first and last name of the top ten customers ranked by dollars spent
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)

select concat (first_name, ' ', last_name) as "Top 10 Customers",
       sum (amount) as "Total Spent"
from customer
join payment using (customer_id)
group by "Top 10 Customers"
order by "Total Spent" desc
limit 10;

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store.
-- (NOTE: Keep in mind that an employee may work at multiple stores.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

select store_id,
       address


-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

-- 17. The top five film categories by number of rentals
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)

-- 18. The top five Action film titles by number of rentals
-- (#1 should have 30 rentals and #5 should have 28 rentals)

-- 19. The top 10 actors ranked by number of rentals of films starring that actor
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor
-- (#1 should have 87 rentals and #5 should have 72 rentals)

SELECT a.first_name, a.last_name, COUNT(r.*) AS toprental
FROM actor a
         JOIN film_actor fa ON fa.actor_id = a.actor_id
         JOIN film f ON f.film_id = fa.film_id
         JOIN inventory i ON i.film_id = f.film_id
         JOIN rental r ON r.inventory_id = i.inventory_id
         JOIN film_category fc ON fc.film_id = f.film_id
         JOIN category c ON c.category_id = fc.category_id
WHERE c.name = 'Comedy'
GROUP BY a.actor_id, a.first_name, a.last_name
ORDER BY toprental DESC
LIMIT 5;