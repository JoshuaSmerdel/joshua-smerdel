-- ORDERING RESULTS

-- SELECT first_name,  -- LAST thing that happens
--         last_name,
--         state
-- FROM student -- 1 db determines the source
-- WHERE class = 'Java' -- 2 filters teh rows
-- GROUP BY state -- perform any grouping
-- --HAVING clause -- 4 filter the groups
-- ORDER BY last_name,
--         first_name; -- 5 sort


-- Populations of all countries in descending order

SELECT name,
       population
FROM country
ORDER BY population DESC
LIMIT 5;

--Names of countries and continents in ascending order

SELECT continent,
       name
FROM country
ORDER BY continent,
         name;

-- LIMITING RESULTS
-- The name and average life expectancy of the countries with the 10 highest life expectancies.

SELECT name,
       lifeexpectancy
FROM country
WHERE lifeexpectancy IS NOT NULL
ORDER BY lifeexpectancy DESC
LIMIT 10;

-- CONCATENATING OUTPUTS

-- The name & state of all cities in California, Oregon, or Washington.

SELECT concat(name, "' " district)
           AS city_state
FROM city
WHERE district IN ('California',
                   'Oregon',
                   'Washington');

-- "city, state", sorted by state then city

-- AGGREGATE FUNCTIONS
-- Average Life Expectancy in the World

-- Total population in Ohio

-- The surface area of the smallest country in the world

SELECT min(surfacearea)
FROM country;

-- The 10 largest countries in the world

SELECT surfacearea
FROM country
ORDER BY surfacearea DESC
LIMIT 10;

-- The number of countries who declared independence in 1991

SELECT count(indepyear)
from country
where indepyear = 1991;

-- GROUP BY

-- Total population of each state in the USA

select district,
       sum(population) as total_population
from city
where countrycode = 'USA'
group by district
order by district;


-- Count the number of countries where each language is spoken, ordered from most countries to least

-- Average life expectancy of each continent ordered from highest to lowest

-- Exclude Antarctica from consideration for average life expectancy

-- Sum of the population of cities in each state in the USA ordered by state name

-- The average population of cities in each state in the USA ordered by state name

-- SUBQUERIES
-- Find the names of cities under a given government leader

-- select *
-- from city
-- where countrycode in ()

select *
from city
where countrycode in (select code
                      from country
                      where headofstate = 'Elisabeth II');


-- Find the names of cities whose country they belong to has not declared independence yet


-- Additional samples
-- You may alias column and table names to be more descriptive

-- Alias can also be used to create shorthand references, such as "c" for city and "co" for country.

-- Ordering allows columns to be displayed in ascending order, or descending order (Look at Arlington)

-- Limiting results allows rows to be returned in 'limited' clusters,where LIMIT says how many, and OFFSET (optional) specifies the number of rows to skip

-- Most database platforms provide string functions that can be useful for working with string data. In addition to string functions, string concatenation is also usually supported, which allows us to build complete sentences if necessary.

-- Aggregate functions provide the ability to COUNT, SUM, and AVG, as well as determine MIN and MAX. Only returns a single row of value(s) unless used with GROUP BY.

-- Counts the number of rows in the city table

-- Also counts the number of rows in the city table

-- Gets the SUM of the population field in the city table, as well as
-- the AVG population, and a COUNT of the total number of rows.

-- Gets the MIN population and the MAX population from the city table.

-- Using a GROUP BY with aggregate functions allows us to summarize information for a specific column. For instance, we are able to determine the MIN and MAX population for each countrycode in the city table.
