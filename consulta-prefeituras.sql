create database ConsultaPrefeitura;

use ConsultaPrefeitura;

create table prefeituras(
codigo int(3),
prefeitura varchar(60),
cidade varchar(60));

insert into prefeituras(codigo,prefeitura,cidade) values
(1,"PMR","Registro"),
(2,"PMC","Cajati"),
(3,"PMIC","Ilha Comprida");

create table admins(
email varchar(60),
senha varchar(60));

insert into admins(email,senha)values
("admin@admin.com","adm1234");



