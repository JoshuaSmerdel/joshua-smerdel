-- DDL - Data Definition Language
-- CREATE database, table
-- DROP database, table
-- ALTER table

-- connected to postgres database when you are creating another db.

select pg_terminate_backend(pid) from pg_stat_activity where datname = 'gills_art';

drop DATABASE  gills_art;

CREATE DATABASE gills_art;
