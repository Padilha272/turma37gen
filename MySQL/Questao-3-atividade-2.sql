create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
	id int auto_increment not null,
    nome varchar(255) not null,
    marca varchar(255) not null,

	primary key(id)

);
insert into tb_categoria (nome,marca)
 values ("Bovina","Friboi"),
 ("Aves","Aurora"),
 ("Suína","Perdigão");
 
 use db_cidade_das_carnes;
create table tb_produtos(
	id_carne int (5)auto_increment not null,
    carne varchar(255) not null,
     selo_qualidade boolean not null, 
    lote  date not null,
    valor float(3),
	aux int(5) not null,
	primary key(id_carne),
   foreign key (aux) references tb_categoria(id)
);

insert into tb_produtos (carne,selo_qualidade,lote,valor,aux) values ("Picanha",1,"2021-10-25",70.00,1);
insert into tb_produtos (carne,selo_qualidade,lote,valor,aux) values ("Carne de sol",1,"2021-10-23",60.00,1);
insert into tb_produtos (carne,selo_qualidade,lote,valor,aux) values ("Asa de frango",0,"2021-10-24",18.00,2);
insert into tb_produtos (carne,selo_qualidade,lote,valor,aux) values ("peito de frango",1,"2021-10-22",20.00,2);
insert into tb_produtos (carne,selo_qualidade,lote,valor,aux) values ("Tender",1,"2021-10-23",45.00,3);
insert into tb_produtos (carne,selo_qualidade,lote,valor,aux) values ("Costela",1,"2021-10-25",50.00,3);

select * from tb_produtos where valor > 50;
select * from tb_produtos where valor between 3 and 60;
select * from tb_produtos where carne like 'C%';

SELECT * FROM tb_categoria INNER JOIN tb_produtos ON tb_produtos.aux = tb_categoria.id ;
SELECT * FROM tb_categoria INNER JOIN tb_produtos ON tb_produtos.aux = tb_categoria.id where id=1;


 