CREATE TABLE user_info
(
    id           bigserial primary key,
    id_number    varchar,
    name         varchar,
    gender       boolean,
    married      boolean,
    birthday     date,
    phone_number varchar,
    address      text,
    city         varchar
);

CREATE TABLE user_military_service
(
    id         bigserial primary key,
    id_number  varchar,
    name       varchar,
    gender     boolean,
    birthday   date,
    has_served boolean,
    year_start int,
    year_end   int
);

CREATE TABLE user_health
(
    id        bigserial primary key,
    id_number varchar,
    name      varchar,
    gender    boolean,
    birthday  date,
    height    numeric,
    weight    numeric
);

CREATE TABLE user_education
(
    id               bigserial primary key,
    id_number        varchar,
    name             varchar,
    gender           boolean,
    birthday         date,
    education_level  varchar,
    primary_school   varchar,
    secondary_school varchar,
    high_school      varchar,
    college          varchar
);