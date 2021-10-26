CREATE database db_pizzaria_legal;
 use db_pizzaria_legal;

create table tb_categoria(
	id int auto_increment not null,
    nome varchar(255) not null,
    categoria varchar(255) not null,

	primary key(id)

);
 insert into tb_categoria (nome,categoria)
 values ("Sabores classicos","Pizza Salgada"),
 ("Sabores Gourmet","Pizza doce");
 
 -- update tb_categoria set nome = "Sabores clássicos" where id = 1;
 
 create table tb_pizza (
	id_pizza int auto_increment not null,
	nome varchar(255) not null,
    sabor1 varchar(255) not null,
    sabor2 varchar(255) not null,
    sabor3 varchar(255) ,
	valor float(3) not null,
    id_aux int not null,
    primary key (id_pizza),
 
 
	foreign key (id_aux) references tb_categoria(id)
 );
 insert into tb_pizza(nome,sabor1,sabor2,sabor3,valor,id_aux) 
 values ("Pepperoni ","Pepperoni","Queijo mussarela","",59.95,1),
 ("Calabresa","Calabresa","Queijo mussarella","Cebola",39.95,1),
 ("Margeritaa","Tomate","Manjericão","Mussarela",25.95,1),
 ("Romeu e julieta","Goiabada","Mussarela","Canela-em-pó",45.95,2),
("Pizza Kit-Kat com morango","Morango","Kit-Kat","Chocolate belga",85.95,2);


select * from tb_pizza where valor >45;
select * from tb_pizza where valor between 29 and 60;
select * from tb_pizza where nome like 'C%';
SELECT * FROM tb_categoria INNER JOIN tb_pizza ON tb_pizza.id_aux = tb_categoria.id;
select * from tb_categoria inner join tb_pizza on tb_pizza.id_aux = tb_categoria.id where id =1;
