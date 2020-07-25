create table bookDB
(
    id long auto_increment,
    name varchar,
    author varchar,
    format varchar,
    publisher varchar,
    publicationDate int,
    pages int,
    cost double,
    statusBook varchar,
    description varchar
);

create unique index bookDB_id_uindex
    on bookDB (id);

alter table bookDB
    add constraint bookDB_pk
        primary key (id);

create table genresDB
(
    idBook long,
    name varchar
);

create table review_db
(
    id long auto_increment,
    body varchar,
    estimation varchar,
    id_user long,
    publication_date date
);

create unique index review_db_id_uindex
    on review_db (id);

alter table review_db
    add constraint review_db_pk
        primary key (id);

create table book_review_db
(
    id_book long,
    id_review long
);
