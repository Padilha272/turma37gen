#CREATE DATABASE db_commerce
use db_commerce;

Create table tb_produtos(
  id bigint(5)auto_increment,
  nome varchar(255) not null,
  marca varchar(255) not null,
  cor varchar(255)not null ,
  preco float(5) not null,
  estoque int(3) not null,
	primary key(id)
);

insert into tb_produtos(nome,marca,cor,preco,estoque) values ("Tênis","Nike","Preto",180.00,12);
insert into tb_produtos(nome,marca,cor,preco,estoque) values ("Casaco","Puma","Rosa",300.00,10);
insert into tb_produtos(nome,marca,cor,preco,estoque) values ("Boné","Adidas","Azul",50.00,20);
insert into tb_produtos(nome,marca,cor,preco,estoque) values ("Bicicleta","Kaloi","Prata",1200,3);

SELECT * FROM tb_produtos where preco > 500;
SELECT * FROM tb_produtos where preco < 500;

update tb_produtos set cor = "Verde" where id = 4;





