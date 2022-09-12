create database tarefa;
use tarefa;
drop table usuario;

create table tarefa (
    id int auto_increment not null primary key,
    descricao varchar(100) not null,
    data_criacao DATE not null,
    data_conclusao DATE not null,
    status INT not null
);

create index IDX_ID on tarefa(id);

select * from tarefa;

insert into tarefa (descricao,data_criacao, data_conclusao, status)  values ('na bela massa', "2022-09-12", "2022-09-12", 1);
insert into tarefa (descricao,data_criacao, data_conclusao, status)  values ('no braga', "2022-09-12", "2022-09-12", 2);
insert into tarefa (descricao,data_criacao, data_conclusao, status)  values ('no hotifrute', "2022-09-12", "2022-09-12", 3);
insert into tarefa (descricao,data_criacao, data_conclusao, status)  values ('na no G Barbosa', "2022-09-12", "2022-09-12", 4);
insert into tarefa (descricao,data_criacao, data_conclusao, status)  values ('na padaria', "2022-09-12", "2022-09-12", 5);