DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS departments;
DROP TABLE IF EXISTS projects;
DROP TABLE IF EXISTS job_titles;
DROP TABLE IF EXISTS project_assignments;
DROP TABLE IF EXISTS dept_assignments;

CREATE TABLE employees
(
    employee_id   serial      NOT NULL,
    job_id        integer     NOT NULL,
    last_name     varchar(30) NOT NULL,
    first_name    varchar(30) NOT NULL,
    gender        varchar(10) NOT NULL,
    date_of_birth date        NOT NULL,
    date_of_hire  date        NOT NULL,
    dept_number   int         NOT NULL,
    PRIMARY KEY (employee_id)
);

CREATE TABLE job_titles
(
    job_id serial      NOT NULL,
    title  varchar(25) NOT NULL,
    PRIMARY KEY (job_id)
);

CREATE TABLE departments
(
    dept_number serial      NOT NULL,
    dept_name   varchar(25) NOT NULL,
    PRIMARY KEY (dept_number)
);

CREATE TABLE dept_assignments
(
    employee_id int NOT NULL,
    dept_number int NOT NULL,
    PRIMARY KEY (dept_number, employee_id)
);

CREATE TABLE projects
(
    proj_number serial      NOT NULL,
    proj_name   varchar(40) NOT NULL,
    start_date  date        NOT NULL,
    PRIMARY KEY (proj_number)
);

CREATE TABLE project_assignments
(
    employee_id int NOT NULL,
    proj_number int NOT NULL,
    PRIMARY KEY (employee_id, proj_number)
);

ALTER TABLE project_assignments
    ADD CONSTRAINT fk_project_proj_number
        FOREIGN KEY (proj_number)
            REFERENCES projects (proj_number);

ALTER TABLE project_assignments
    ADD CONSTRAINT fk_employees_employee_id
        FOREIGN KEY (employee_id)
            REFERENCES employees (employee_id);

ALTER TABLE employees
    ADD CONSTRAINT fk_job_titles_job_id
        FOREIGN KEY (job_id)
            REFERENCES job_titles (job_id);

ALTER TABLE employees
    ADD CONSTRAINT fk_department_dept_number
        FOREIGN KEY (dept_number)
            REFERENCES departments (dept_number);

ALTER TABLE dept_assignments
    ADD CONSTRAINT fk_employees_employee_id
        FOREIGN KEY (employee_id)
            REFERENCES employees (employee_id);

ALTER TABLE dept_assignments
    ADD CONSTRAINT fk_department_dept_number2
        FOREIGN KEY (dept_number)
            REFERENCES departments (dept_number);