-- The following queries utilize the "world" database.
-- Write queries for the following problems. 
-- Notes:
--   GNP is expressed in units of one million US Dollars
--   The value immediately after the problem statement is the expected number 
--   of rows that should be returned by the query.

-- 1. The name and state plus population of all cities in states that border Ohio 
-- (i.e. cities located in Pennsylvania, West Virginia, Kentucky, Indiana, and 
-- Michigan).
-- The name and state should be returned as a single column called 
-- name_and_state and should contain values such as ‘Detroit, Michigan’.  
-- The results should be ordered alphabetically by state name and then by city 
-- name. 
-- (19 rows)

select concat(name, ', ', district) as name_and_state,
       name,
       district,
       population
from city
where district in ('Pennsylvania',
                   'West Virginia',
                   'Kentucky',
                   'Indiana',
                   'Michigan')
order by district, name;

-- 2. The name, country code, and region of all countries in Africa.  The name and
-- country code should be returned as a single column named country_and_code 
-- and should contain values such as ‘Angola (AGO)’ 
-- (58 rows)

select name,
       code,
       region,
       concat(name, ', ', code) as country_and_code
from country
where continent = 'Africa';

-- 3. The per-capita GNP (i.e. GNP multiplied by 1000000 then divided by population) of all countries in the
-- world sorted from highest to lowest. Recall: GNP is express in units of one million US Dollars 
-- (highest per capita GNP in world: 37459.26)

select name,
       cast((gnp * 1000000) / population as money) as per_capita_gnp
from country
where population > 0
order by per_capita_gnp desc;

-- 4. The average life expectancy of countries in South America.
-- (average life expectancy in South America: 70.9461)

select avg(lifeexpectancy) as avg_life_exp
from country
where continent = 'South America'
  and population is not null
group by continent
order by avg_life_exp;

-- 5. The sum of the population of all cities in California.
-- (total population of all cities in California: 16716706)

select sum(population) as cal_pop
from city
where district = 'California'
group by district;

-- 6. The sum of the population of all cities in China.
-- (total population of all cities in China: 175953614)

select sum(population)
from city
where countrycode = 'CHN'
group by countrycode;

-- 7. The maximum population of all countries in the world.
-- (largest country population in world: 1277558000)

select max(population)
from country;

-- 8. The maximum population of all cities in the world.
-- (largest city population in world: 10500000)

select max(population)
from city;


-- 9. The maximum population of all cities in Australia.
-- (largest city population in Australia: 3276207)

select max(population)
from city
where countrycode = 'AUS';

-- 10. The minimum population of all countries in the world.
-- (smallest_country_population in world: 50)

select min(population)
from country
where population > 0;

-- 11. The average population of cities in the United States.
-- (average city population in USA: 286955.3795)

select avg(population)
from city
where countrycode = 'USA';

-- 12. The average population of cities in China.
-- (average city population in China: 484720.6997 approx.)

select avg(population)
from city
where countrycode = 'CHN';

-- 13. The surface area of each continent ordered from highest to lowest.
-- (largest continental surface area: 31881000, "Asia")

select sum(surfacearea) as cont_surf_area,
       continent
from country
group by continent
order by cont_surf_area desc;

-- 14. The highest population density (population divided by surface area) of all 
-- countries in the world. 
-- (highest population density in world: 26277.7777)

select name,
       (population / surfacearea) as pop_den
from country
order by pop_den desc;

-- 15. The population density and life expectancy of the top ten countries with the 
-- highest life expectancies in descending order. 
-- (highest life expectancies in world: 83.5, 166.6666, "Andorra")

select name,
       lifeexpectancy,
       (population / surfacearea) as pop_den
from country
where lifeexpectancy > 0
order by lifeexpectancy desc;

-- 16. The difference between the previous and current GNP of all the countries in 
-- the world ordered by the absolute value of the difference. Display both 
-- difference and absolute difference.
-- (smallest difference: 1.00, 1.00, "Ecuador")

select abs(gnp - gnpold) as absolute_difference,
       (gnp - gnpold)    as difference,
       name
from country
where gnp is not null
  and gnpold is not null
order by absolute_difference;

-- 17. The average population of cities in each country (hint: use city.countrycode)
-- ordered from highest to lowest.
-- (highest avg population: 4017733.0000, "SGP")

select avg(population) as avg_pop,
       countrycode
from city
group by countrycode
order by avg_pop desc;

-- 18. The count of cities in each state in the USA, ordered by state name.
-- (45 rows)

select district,
       count(name) as num_cities
from city
where countrycode = 'USA'
group by district;

-- 19. The count of countries on each continent, ordered from highest to lowest.
-- (highest count: 58, "Africa")

select continent,
       count(name) as num_countries
from country
group by continent
order by num_countries desc;

-- 20. The count of cities in each country ordered from highest to lowest.
-- (largest number of  cities ib a country: 363, "CHN")

select countrycode,
       count(name) num_cities_per_country
from city
group by countrycode
order by num_cities_per_country desc;

-- 21. The population of the largest city in each country ordered from highest to 
-- lowest.
-- (largest city population in world: 10500000, "IND")

select distinct countrycode,
                max(population) as max_pop
from city
group by countrycode
order by max_pop desc;

-- 22. The average, minimum, and maximum non-null life expectancy of each continent 
-- ordered from lowest to highest average life expectancy. 
-- (lowest average life expectancy: 52.5719, 37.2, 76.8, "Africa")

select continent,
       avg(lifeexpectancy) as avg_life,
       min(lifeexpectancy) as min_life,
       max(lifeexpectancy) as _max_life
from country
where lifeexpectancy is not null
group by continent
order by avg_life, min_life, _max_life;

-- Bonus

select distinct district
from city
where countrycode = 'USA'
  and district != 'Maine'
  and district != 'Vermont'
  and district != 'West Virginia'
  and district != 'North Dakota'
  and district != 'Wyoming'
order by district;
