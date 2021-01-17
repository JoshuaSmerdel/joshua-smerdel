-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

BEGIN TRANSACTION;

INSERT INTO actor
    (first_name, last_name)
VALUES ('Hampton', 'Avenue'),
       ('Lisa', 'Byway');

COMMIT;

ROLLBACK;

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

BEGIN TRANSACTION;
INSERT INTO film
    (title, description, release_year, language_id, length)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in
    -- ancient Greece', 2008, 1, 398);

COMMIT;

ROLLBACK;

UPDATE film
SET length = 198
WHERE title ILIKE 'euclidean pi';

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

--Hampton actor ID 201
--lisa actor ID 202
-- film id 1001

BEGIN TRANSACTION;

INSERT INTO film_actor (actor_id, film_id)
VALUES (201, 1001),
       (202, 1001);

COMMIT;

ROLLBACK;

-- 4. Add Mathmagical to the category table.

BEGIN TRANSACTION;

INSERT INTO category (name)
VALUES ('Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

--mathmagical category id = 17
--karate moon film id = 494
--egg igby film id = 274
--random go film id = 714
--young language film id = 996
--euclidean pi film id = 1001

BEGIN TRANSACTION;

INSERT INTO film_category (film_id, category_id)
VALUES (1001, 17),
       (494, 17),
       (274, 17),
       (714, 17),
       (996, 17);

COMMIT;

ROLLBACK;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

BEGIN TRANSACTION;

UPDATE film
SET rating = 'G'
WHERE film_id IN
      (SELECT film_id FROM film_category WHERE film_category.category_id = 17);

COMMIT;

ROLLBACK;

SELECT rating
FROM film
         JOIN film_category fc ON film.film_id = fc.film_id
         JOIN category c ON fc.category_id = c.category_id
WHERE c.name = 'Mathmagical';

-- 7. Add a copy of "Euclidean PI" to all the stores.

BEGIN TRANSACTION;

INSERT INTO inventory (film_id, store_id)
VALUES (1001, 1),
       (1001, 2);

COMMIT;

ROLLBACK;

SELECT *
FROM inventory
WHERE film_id = 1001;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <yes it succeeded.  Because I told it to delete any instance of 1001 that was found.>

BEGIN TRANSACTION;

DELETE
FROM inventory
WHERE film_id = 1001;

COMMIT;

ROLLBACK;

SELECT *
FROM inventory
WHERE film_id = 1001

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <no. because other entries are using this data.>

BEGIN TRANSACTION;

DELETE
FROM category
WHERE category_id = 17;

COMMIT;

ROLLBACK;

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

BEGIN TRANSACTION;

DELETE
FROM film_category
WHERE category_id = 17;

COMMIT;

ROLLBACK;

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <the first succeeded because the dependents were removed>
-- <the second did not work because it still has dependents>

BEGIN TRANSACTION;

DELETE
FROM category
WHERE category_id = 17;

COMMIT;

ROLLBACK;

BEGIN TRANSACTION;

DELETE
FROM film
WHERE title ILIKE 'euclidean pi';

COMMIT;

ROLLBACK;

SELECT *
FROM film
WHERE title ILIKE 'euclidean pi';

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

--<step1>
DELETE
FROM film_actor
WHERE film_id = 1001;

--<step2>
DELETE
FROM film
WHERE title ILIKE 'euclidean pi';