-- SELECT ... FROM
-- Selecting the names for all countries

SELECT *
FROM country;

SELECT name
FROM country;

-- Selecting the name and population of all countries

SELECT name
        , population
FROM country;
-- Selecting all columns from the city table

SELECT *
FROM city;

/*
SELECT -- SELECT ... FROM ... WHERE
FROM -- Selecting the cities in Ohio
WHERE -- filter (likle if statements in JAVA) if true include in result, if not, dont include
*/


-- SELECT...FROM...WHERE
-- Selecting cities in OHio

SELECT *
FROM city
WHERE district = 'Ohio';

/*
=
>
<
>=
<=
BETWEEN
*/

-- Selecting countries that gained independence in the year 1776
SELECT *
FROM country
WHERE continent != 'Asia';

SELECT *
FROM country
WHERE NOT (continent = 'Asia');


-- Selecting countries not in Asia


-- Selecting countries that do not have an independence year
SELECT name
        , indepyear
FROM country
WHERE indepyear = null; -- null can NEVER = null

SELECT name
        , indepyear
FROM country
WHERE indepyear IS NULL; -- determines that there is no value

SELECT name
        , indepyear
FROM country
WHERE indepyear IS NOT NULL; -- Determines if there IS a value



-- Selecting countries that do have an independence year


-- Selecting countries that have a population greater than 5 million

SELECT name
        , population
FROM country
WHERE population > 5000000;


-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000

SELECT *
FROM city
WHERE (district = 'Ohio' OR district = 'Utah') --use parenthesis to groups ors together
        AND population < 175000;

-- Selecting country names on the continent North America or South America

SELECT name
        , continent
FROM country
WHERE continent ILIKE '%America'  --ILIKE case insensitive version of LIKE
       



-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area
--	note the use of the 'as' keyword

SELECT name
        , population
        , lifeexpectancy AS life_expectancy
        , population / surfacearea AS population_density --do math inline
FROM country;



