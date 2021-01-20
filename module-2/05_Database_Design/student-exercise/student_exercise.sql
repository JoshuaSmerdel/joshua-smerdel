DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS departments;
DROP TABLE IF EXISTS projects;
DROP TABLE IF EXISTS job_titles;
DROP TABLE IF EXISTS project_assignments;
DROP TABLE IF EXISTS dept_assignments;

INSERT INTO departments
    (dept_name)
VALUES ('Hardware'),
       ('Millwork'),
       ('Plumbing'),
       ('Lumber'),
       ('Electrical'),
       ('Management');

INSERT INTO employees (first_name, last_name, gender, date_of_birth, date_of_hire, dept_number, job_id)
VALUES ('Samuel', 'Adams', 'male', '1980-12-16', '2010-01-01', 1, 1),
       ('Hunter', 'Thompson', 'male', '19781112', '20200101', 2, 2),
       ('Eliot', 'Ness', 'male', '19670204', '20150203', 3, 3),
       ('Aza', 'Mycoskie', 'female', '19990709', '20180101', 4, 4),
       ('Brooke', 'Smerdel', 'female', '19980606', '20111116', 5, 5),
       ('Mason', 'Smerdel', 'male', '19940412', '20140704', 6, 6),
       ('Aesop', 'Rock', 'male', '19801031', '20010911', 1, 7),
       ('Commodore', 'Perry', 'male', '19550403', '20200103', 2,  2);

INSERT INTO projects
    (proj_name, start_date)
VALUES ('Endcap Facing', '20210101'),
       ('Black Friday Rollout', '20211121'),
       ('July Promo', '20210621');

INSERT INTO job_titles (title)
VALUES ('Manager'),
       ('Associate'),
       ('Assistant Manager'),
       ('Inventory Manager'),
       ('Cashier'),
       ('Department Supervisor'),
       ('Shipping and Receiving');

insert INTO project_assignments (employee_id, proj_number)
values (1, 6), (2, 5), (3, 4), (4, 3), (5, 2), (6, 1), (7, 1), (8, 2);



DELETE
FROM projects;
DELETE
FROM employees;
DELETE
FROM project_assignments;
DELETE
FROM job_titles;
DELETE
FROM departments;
DELETE
FROM dept_assignments;