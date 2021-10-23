#CREATE DATABASE db_escola

use db_escola;


CREATE TABLE tb_matricula(
	id bigint(5)auto_increment,
	nome varchar(255) not null,
    matricula bigint(5) not null,
    idade int(2) not null,
    nota float(3) not null,
	serie varchar(255) not null,
    primary key(id)
);

	insert into tb_matricula (nome,matricula,idade,nota,serie) values ("Mauro",13425,12,6.5,"Quarta-série");
	insert into tb_matricula (nome,matricula,idade,nota,serie) values ("Sérgio",14465,17,5,"Terceiro ano");
	insert into tb_matricula (nome,matricula,idade,nota,serie) values ("Maria",14789,14,8,"Primeiro ano");

SELECT * FROM tb_matricula where nota >7;
SELECT * FROM tb_matricula where nota <7;

update tb_matricula set nota = 7.1 where id =2;