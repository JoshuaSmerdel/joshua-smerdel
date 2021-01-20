-- DDL - Data Definition Language
-- CREATE database, table
-- DROP database, table
-- ALTER table

-- connected to postgres database when you are creating another db.

select pg_terminate_backend(pid) from pg_stat_activity where datname = 'project_manager';

drop DATABASE  project_manager;

CREATE DATABASE project_manager;
