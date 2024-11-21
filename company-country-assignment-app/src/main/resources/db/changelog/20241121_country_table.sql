--liquibase formatted sql
--changeset sayed:20241124_country_table
CREATE SEQUENCE public.country_id_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807 CACHE 1;

ALTER SEQUENCE public.country_id_sequence
    OWNER TO ${user_owner};

CREATE TABLE public.country
(
    id                BIGINT                 NOT NULL DEFAULT nextval('country_id_sequence'),
    iso_code          VARCHAR(255)           NOT NULL,
    name              VARCHAR(255)           NOT NULL,


    created_date      TIMESTAMP              NOT NULL,
    modified_date     TIMESTAMP              NOT NULL,
    created_by        CHARACTER VARYING(100) NOT NULL,
    modified_by       CHARACTER VARYING(100) NOT NULL,
    marked_as_deleted BOOLEAN                NOT NULL DEFAULT FALSE,
    CONSTRAINT country_id_pk PRIMARY KEY (id)

) TABLESPACE pg_default;

ALTER TABLE public.country
    OWNER TO ${user_owner};
CREATE UNIQUE INDEX country_code_uq
    ON public.country (iso_code) WHERE marked_as_deleted = false;