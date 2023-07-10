

-- object: public."user" | type: TABLE --
-- DROP TABLE IF EXISTS public."user" CASCADE;
CREATE TABLE public."user" (
                               id serial NOT NULL,
                               username varchar(20) NOT NULL,
                               email varchar(70) NOT NULL,
                               password varchar(100) NOT NULL,
                               id_user_rol smallint,
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
                             id_user integer,
                             id_description integer,
                             id_item_type integer,
                             id_item_state smallint,
                             CONSTRAINT item_pk PRIMARY KEY (id)
);
-- ddl-end --
-- ddl-end --

-- object: public.review | type: TABLE --
-- DROP TABLE IF EXISTS public.review CASCADE;
CREATE TABLE public.review (
                               id serial NOT NULL,
                               comment varchar(300) NOT NULL,
                               rating smallint NOT NULL,
                               id_item integer,
                               CONSTRAINT opinion_pk PRIMARY KEY (id)
);
-- ddl-end --
-- ddl-end --

-- object: public.user_rol | type: TABLE --
-- DROP TABLE IF EXISTS public.user_rol CASCADE;
CREATE TABLE public.user_rol (
                                 id smallserial NOT NULL,
                                 rol varchar(10) NOT NULL,
                                 CONSTRAINT type_user_pk PRIMARY KEY (id)
);
-- ddl-end --
-- ddl-end --

-- object: public.item_type | type: TABLE --
-- DROP TABLE IF EXISTS public.item_type CASCADE;
CREATE TABLE public.item_type (
                                  id serial NOT NULL,
                                  type varchar(40) NOT NULL,
                                  CONSTRAINT type_item_pk PRIMARY KEY (id)
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
-- ALTER TABLE public.review DROP CONSTRAINT IF EXISTS item_fk CASCADE;
ALTER TABLE public.review ADD CONSTRAINT item_fk FOREIGN KEY (id_item)
    REFERENCES public.item (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: user_fk | type: CONSTRAINT --
-- ALTER TABLE public.item DROP CONSTRAINT IF EXISTS user_fk CASCADE;
ALTER TABLE public.item ADD CONSTRAINT user_fk FOREIGN KEY (id_user)
    REFERENCES public."user" (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: item_type_fk | type: CONSTRAINT --
-- ALTER TABLE public.item DROP CONSTRAINT IF EXISTS item_type_fk CASCADE;
ALTER TABLE public.item ADD CONSTRAINT item_type_fk FOREIGN KEY (id_item_type)
    REFERENCES public.item_type (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
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

-- object: public.item_state | type: TABLE --
-- DROP TABLE IF EXISTS public.item_state CASCADE;
CREATE TABLE public.item_state (
                                   id smallserial NOT NULL,
                                   state varchar(10) DEFAULT 'to do',
                                   CONSTRAINT item_state_pk PRIMARY KEY (id)
);
-- ddl-end --
-- ddl-end --

-- object: item_state_fk | type: CONSTRAINT --
-- ALTER TABLE public.item DROP CONSTRAINT IF EXISTS item_state_fk CASCADE;
ALTER TABLE public.item ADD CONSTRAINT item_state_fk FOREIGN KEY (id_item_state)
    REFERENCES public.item_state (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: user_rol_fk | type: CONSTRAINT --
-- ALTER TABLE public."user" DROP CONSTRAINT IF EXISTS user_rol_fk CASCADE;
ALTER TABLE public."user" ADD CONSTRAINT user_rol_fk FOREIGN KEY (id_user_rol)
    REFERENCES public.user_rol (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


