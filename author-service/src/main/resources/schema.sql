CREATE TABLE book 
(
    id bigint identity,
    isbn varchar(13) NOT NULL,
    title varchar(200) NOT NULL,
    price decimal NOT NULL,
    release_date DATE,
    CONSTRAINT unique_isbn UNIQUE (isbn)
);

CREATE TABLE author
(
    id bigint NOT NULL,
    lastname varchar(100) NOT NULL,
    firstname varchar(100) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE book_author
(
    book_id bigint NOT NULL,
    author_id bigint NOT NULL,
    CONSTRAINT book_author_pkey PRIMARY KEY (book_id, author_id),
    CONSTRAINT author_id FOREIGN KEY (book_id) REFERENCES author (id),
    CONSTRAINT book_id FOREIGN KEY (book_id) REFERENCES public.book (id)
);
