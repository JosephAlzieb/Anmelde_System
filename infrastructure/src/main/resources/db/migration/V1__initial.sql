
create table if not exists termin
(
    Id int auto_increment,
    anmeldefrist text not null,
    von text not null,
    bis text not null,
    titel varchar(50) not null,
    constraint termin_pk
        primary key (Id)
);



create table if not exists gruppe
(
    Id int auto_increment,
    constraint gruppe_pk
        primary key (Id)
);


create table user
(
    Id int auto_increment,
    gihub varchar(30) not null,
    name varchar(30) not null,
    matrikelnummer int not null,
    gruppeId int not null,
    constraint user_pk
        primary key (Id),
    constraint user_gruppe_Id_fk
        foreign key (gruppeId) references gruppe (Id)
            on update cascade on delete cascade
);



create table belegung
(
    gruppeId int not null,
    terminId int not null,
    constraint belegung_pk
        primary key (terminId),
    constraint belegung_gruppe_Id_fk
        foreign key (gruppeId) references gruppe (Id)
            on update cascade on delete cascade,
    constraint belegung_termin_Id_fk
        foreign key (terminId) references termin (Id)
            on update cascade on delete cascade
);

