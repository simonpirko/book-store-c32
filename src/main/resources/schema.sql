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
    id long auto_increment,
    name varchar
);

create unique index genresDB_id_uindex
    on genresDB (id);

alter table genresDB
    add constraint genresDB_pk
        primary key (id);

create table reviewDB
(
    id long auto_increment,
    body varchar,
    estimation varchar,
    idUser long,
    publicationDate varchar
);

create unique index reviewDB_id_uindex
    on reviewDB (id);

alter table reviewDB
    add constraint reviewDB_pk
        primary key (id);

create table bookReviewDB
(
    idBook long,
    idReview long
);
