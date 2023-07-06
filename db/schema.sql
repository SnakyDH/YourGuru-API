-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- pgModeler version: 0.9.4
-- PostgreSQL version: 13.0
-- Project Site: pgmodeler.io
-- Model Author: ---

-- Database creation must be performed outside a multi lined SQL file.
-- These commands were put in this file only as a convenience.
--
-- object: new_database | type: DATABASE --
-- DROP DATABASE IF EXISTS new_database;
--CREATE DATABASE new_database;
-- ddl-end --


-- object: public."user" | type: TABLE --
-- DROP TABLE IF EXISTS public."user" CASCADE;
CREATE TABLE public."user" (
                               id varchar(20) NOT NULL,
                               username varchar(20) NOT NULL,
                               email varchar(70) NOT NULL,
                               password varchar(100) NOT NULL,
                               id_rol_user smallint,
                               CONSTRAINT user_pk PRIMARY KEY (id)
);
-- ddl-end --
-- ddl-end --

-- object: public.item | type: TABLE --
-- DROP TABLE IF EXISTS public.item CASCADE;
CREATE TABLE public.item (
                             id serial NOT NULL,
                             title varchar(40) NOT NULL,
                             release_date timestamp,
                             created_at timestamp NOT NULL,
                             updated_at timestamp NOT NULL,
                             id_user varchar(20),
                             id_type_item integer,
                             id_description integer,
                             CONSTRAINT item_pk PRIMARY KEY (id)
);
-- ddl-end --
-- ddl-end --

-- object: public.opinion | type: TABLE --
-- DROP TABLE IF EXISTS public.opinion CASCADE;
CREATE TABLE public.opinion (
                                id serial NOT NULL,
                                info varchar(150) NOT NULL,
                                rating smallint NOT NULL,
                                id_item integer,
                                CONSTRAINT opinion_pk PRIMARY KEY (id)
);
-- ddl-end --
-- ddl-end --

-- object: public.rol_user | type: TABLE --
-- DROP TABLE IF EXISTS public.rol_user CASCADE;
CREATE TABLE public.rol_user (
                                 id smallserial NOT NULL,
                                 rol varchar(10) NOT NULL,
                                 CONSTRAINT type_user_pk PRIMARY KEY (id)
);
-- ddl-end --
-- ddl-end --

-- object: public.type_item | type: TABLE --
-- DROP TABLE IF EXISTS public.type_item CASCADE;
CREATE TABLE public.type_item (
                                  id serial NOT NULL,
                                  type varchar(40) NOT NULL,
                                  CONSTRAINT actors_pk PRIMARY KEY (id)
);
-- ddl-end --
-- ddl-end --

-- object: public.description | type: TABLE --
-- DROP TABLE IF EXISTS public.description CASCADE;
CREATE TABLE public.description (
                                    id serial NOT NULL,
                                    description varchar(150) NOT NULL,
                                    CONSTRAINT description_pk PRIMARY KEY (id)
);
-- ddl-end --
-- ddl-end --

-- object: item_fk | type: CONSTRAINT --
-- ALTER TABLE public.opinion DROP CONSTRAINT IF EXISTS item_fk CASCADE;
ALTER TABLE public.opinion ADD CONSTRAINT item_fk FOREIGN KEY (id_item)
    REFERENCES public.item (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: user_fk | type: CONSTRAINT --
-- ALTER TABLE public.item DROP CONSTRAINT IF EXISTS user_fk CASCADE;
ALTER TABLE public.item ADD CONSTRAINT user_fk FOREIGN KEY (id_user)
    REFERENCES public."user" (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: type_item_fk | type: CONSTRAINT --
-- ALTER TABLE public.item DROP CONSTRAINT IF EXISTS type_item_fk CASCADE;
ALTER TABLE public.item ADD CONSTRAINT type_item_fk FOREIGN KEY (id_type_item)
    REFERENCES public.type_item (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: rol_user_fk | type: CONSTRAINT --
-- ALTER TABLE public."user" DROP CONSTRAINT IF EXISTS rol_user_fk CASCADE;
ALTER TABLE public."user" ADD CONSTRAINT rol_user_fk FOREIGN KEY (id_rol_user)
    REFERENCES public.rol_user (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: user_uq | type: CONSTRAINT --
-- ALTER TABLE public."user" DROP CONSTRAINT IF EXISTS user_uq CASCADE;
ALTER TABLE public."user" ADD CONSTRAINT user_uq UNIQUE (id_rol_user);
-- ddl-end --

-- object: description_fk | type: CONSTRAINT --
-- ALTER TABLE public.item DROP CONSTRAINT IF EXISTS description_fk CASCADE;
ALTER TABLE public.item ADD CONSTRAINT description_fk FOREIGN KEY (id_description)
    REFERENCES public.description (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: item_uq | type: CONSTRAINT --
-- ALTER TABLE public.item DROP CONSTRAINT IF EXISTS item_uq CASCADE;
ALTER TABLE public.item ADD CONSTRAINT item_uq UNIQUE (id_description);
-- ddl-end --

-- object: public.item_genre | type: TABLE --
-- DROP TABLE IF EXISTS public.item_genre CASCADE;
CREATE TABLE public.item_genre (
                                   id_item integer NOT NULL,
                                   id_genre integer NOT NULL,
                                   CONSTRAINT item_genre_pk PRIMARY KEY (id_item,id_genre)
);
-- ddl-end --
-- ddl-end --

-- object: item_fk | type: CONSTRAINT --
-- ALTER TABLE public.item_genre DROP CONSTRAINT IF EXISTS item_fk CASCADE;
ALTER TABLE public.item_genre ADD CONSTRAINT item_fk FOREIGN KEY (id_item)
    REFERENCES public.item (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: public.genre | type: TABLE --
-- DROP TABLE IF EXISTS public.genre CASCADE;
CREATE TABLE public.genre (
                              id serial NOT NULL,
                              name varchar(40) NOT NULL,
                              CONSTRAINT genre_pk PRIMARY KEY (id)
);
-- ddl-end --
-- ddl-end --

-- object: genre_fk | type: CONSTRAINT --
-- ALTER TABLE public.item_genre DROP CONSTRAINT IF EXISTS genre_fk CASCADE;
ALTER TABLE public.item_genre ADD CONSTRAINT genre_fk FOREIGN KEY (id_genre)
    REFERENCES public.genre (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


