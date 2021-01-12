#!/bin/bash
psql -U postgres -f "./dropdb.sql" &&

user: postgres
password: postgres1




createdb -U postgres world &&






psql -U postgres -d world -f "./world.sql" 