#CREATE DATABASE db_empresa

use db_empresa;


create table tb_funcionaries(
	id bigint(5)auto_increment,
    nome varchar(255) not null,
    cpf varchar(255) not null,
    idade int(2) not null,
    nacionalidade varchar(255) not null,
    salario float(5) not null,
    primary key(id)
    

);

insert into tb_funcionaries(nome,cpf,idade,nacionalidade,salario) values("Pedro ","111.111.111-11",27,"Brasileiro",6000);
insert into tb_funcionaries(nome,cpf,idade,nacionalidade,salario) values("Lucas","222.222.222-22",23,"Brasileiro",2500);
insert into tb_funcionaries(nome,cpf,idade,nacionalidade,salario) values("Maria","333.333.333-33",37,"Portuguesa",7000);
insert into tb_funcionaries(nome,cpf,idade,nacionalidade,salario) values("Luiza","444.444.444-44",29,"Boliviana",6000);
insert into tb_funcionaries(nome,cpf,idade,nacionalidade,salario) values("Daniel","555.555.555-55",25,"Brasileiro",4000);

select *from tb_funcionaries where salario>5000;
select *from tb_funcionaries where salario<5000;
update tb_funcionaries set salario = 3000 where id = 2;

