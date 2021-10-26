-- CREATE DATABASE db_generation_game_online;

 use db_generation_game_online;

create table tb_classe (
	id int  auto_increment not null,
	classe varchar(255) not null,
	caracteristica varchar(255) not null,
    primary key (id)
);

-- insert into tb_classe (classe, caracteristica)  values("Cavaleiro","Bravery");


create table tb_personagem(
	id_personagem  int  auto_increment not null,
	nome varchar (255) not null,
	nivel int (3) not null,
	ataque int (3) not null,
    defesa int (3) not null,
    agilidade int (3) not null,
    id_criacao int not null,
    
    
    primary key (id_personagem),
	foreign key (id_criacao) references tb_classe(id)
    
);
-- insert into  tb_personagem(nome,nivel,ataque,defesa,agilidade,id_criacao) values ("Aragorn",500,2500,1500,2000,3);
-- insert into  tb_personagem(nome,nivel,ataque,defesa,agilidade,id_criacao) values ("Gandalf",500,4000,1300,1000,1);
-- insert into  tb_personagem(nome,nivel,ataque,defesa,agilidade,id_criacao) values ("Legolas",500,2300,1000,3000,2);
-- insert into  tb_personagem(nome,nivel,ataque,defesa,agilidade,id_criacao) values ("Presto",500,1000,1000,1500,1);
-- insert into  tb_personagem(nome,nivel,ataque,defesa,agilidade,id_criacao) values ("Hank",500,1500,1200,2500,2);
-- insert into  tb_personagem(nome,nivel,ataque,defesa,agilidade,id_criacao) values ("Eric",500,900,4000,1000,3);
-- insert into  tb_personagem(nome,nivel,ataque,defesa,agilidade,id_criacao) values ("Camus de aquário",999,9999,9999,9999,3);

-- select * from tb_personagem where ataque >2000;
-- select * from tb_personagem where defesa > 1000 and defesa <3000;
-- select * from tb_personagem where nome like 'C%';
-- SELECT * FROM tb_classe INNER JOIN tb_personagem ON tb_personagem.id_criacao = tb_classe.id;
-- SELECT * FROM tb_classe INNER JOIN tb_personagem ON tb_personagem.id_criacao = tb_classe.id where id = 3;





