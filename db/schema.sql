CREATE
OR REPLACE FUNCTION trigger_set_timestamp()
RETURNS TRIGGER AS $$
BEGIN
  NEW.updated_at
= NOW();
RETURN NEW;
END;
$$
LANGUAGE plpgsql;

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
    city         varchar,
    created_at   timestamptz NOT NULL DEFAULT now(),
    updated_at   timestamptz
);

CREATE TRIGGER set_timestamp
    BEFORE UPDATE
    ON user_info
    FOR EACH ROW
    EXECUTE FUNCTION trigger_set_timestamp();

CREATE TABLE user_military_service
(
    id         bigserial primary key,
    id_number  varchar,
    name       varchar,
    gender     boolean,
    birthday   date,
    has_served boolean,
    year_start int,
    year_end   int,
    created_at timestamptz NOT NULL DEFAULT now(),
    updated_at timestamptz
);

CREATE TRIGGER set_timestamp
    BEFORE UPDATE
    ON user_military_service
    FOR EACH ROW
    EXECUTE FUNCTION trigger_set_timestamp();

CREATE TABLE user_health
(
    id         bigserial primary key,
    id_number  varchar,
    name       varchar,
    gender     boolean,
    birthday   date,
    height     numeric,
    weight     numeric,
    created_at timestamptz NOT NULL DEFAULT now(),
    updated_at timestamptz
);

CREATE TRIGGER set_timestamp
    BEFORE UPDATE
    ON user_health
    FOR EACH ROW
    EXECUTE FUNCTION trigger_set_timestamp();


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
    college          varchar,
    created_at       timestamptz NOT NULL DEFAULT now(),
    updated_at       timestamptz
);

CREATE TRIGGER set_timestamp
    BEFORE UPDATE
    ON user_education
    FOR EACH ROW
    EXECUTE FUNCTION trigger_set_timestamp();
