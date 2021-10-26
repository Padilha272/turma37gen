use db_estoque;

CREATE TABLE tb_marcas(
	id bigint(5) auto_increment,
	nome varchar(20) not null,
	ativo boolean,
    primary key (id)
);

INSERT INTO tb_marcas (nome,ativo) values ("Naique",true);
INSERT INTO tb_marcas (nome,ativo) values ("Puma",true);
INSERT INTO tb_marcas (nome,ativo) values ("Adidas",false);
INSERT INTO tb_marcas (nome,ativo) values ("Kappa",true);

SELECT * FROM tb_marcas

#update tb_marcas set nome = "Nike" where id = 1;
#update tb_marcas set nome = "Lotto" where id = 2;
#update tb_marcas set ativo = true where id = 4;


use db_estoque;

CREATE TABLE tb_produtos (
	id bigint auto_increment,
    nome varchar(30) not null,
	preco decimal(10,2),
	marca_id bigint not null,

	primary key (id),
	foreign key (marca_id) references tb_marcas(id)
);
insert into tb_produtos (nome,preco,marca_id) 
values ("Tenis",69.99,2)


select *from tb_produtos where preco >60.00


