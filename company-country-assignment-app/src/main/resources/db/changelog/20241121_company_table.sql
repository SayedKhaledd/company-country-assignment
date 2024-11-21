--liquibase formatted sql
--changeset sayed:20241121_company_table
CREATE SEQUENCE public.company_id_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807 CACHE 1;

ALTER SEQUENCE public.company_id_sequence
    OWNER TO ${user_owner};

CREATE TABLE public.company
(
    id                BIGINT                 NOT NULL DEFAULT nextval('company_id_sequence'),
    name              VARCHAR(255)           NOT NULL,
    country_id        BIGINT                 NOT NULL,

    created_date      TIMESTAMP              NOT NULL,
    modified_date     TIMESTAMP              NOT NULL,
    created_by        CHARACTER VARYING(100) NOT NULL,
    modified_by       CHARACTER VARYING(100) NOT NULL,
    marked_as_deleted BOOLEAN                NOT NULL DEFAULT FALSE,
    CONSTRAINT company_id_pk PRIMARY KEY (id),
    CONSTRAINT company_country_id_fk FOREIGN KEY (country_id) REFERENCES public.country (id)
) TABLESPACE pg_default;

ALTER TABLE public.company
    OWNER TO ${user_owner};