create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
	id int auto_increment not null,
    curso varchar(255) not null,
    codigo varchar(255)not null,

	primary key(id)

);
insert into tb_categoria (curso,codigo) values ("Matemática","112233");
insert into tb_categoria (curso,codigo) values ("Química","214521");
insert into tb_categoria (curso,codigo) values ("Matemática","1141551");
insert into tb_categoria (curso,codigo) values ("Química","2526663");
create table tb_curso (
	id_curso int auto_increment not null,
    professor varchar(255) not null,
    matricula varchar(255) not null,
    idade int(3) not null,
    valorcurso float(3) not null,
    aux int not null,

	primary key (id_curso),
    foreign key (aux) references tb_categoria(id)

);

insert into tb_curso (professor,matricula,idade,valorcurso,aux) values ("Agenor","adqk131e",45,45.00,1);
insert into tb_curso (professor,matricula,idade,valorcurso,aux) values ("Juvenal","sdgsg33",56,55.00,2);
insert into tb_curso (professor,matricula,idade,valorcurso,aux) values ("Lúcia","mymy344",45,70.00,3);
insert into tb_curso (professor,matricula,idade,valorcurso,aux) values ("Maria","dhfj553",27,60.00,4);

select *from tb_curso where valorcurso >45;
select *from tb_curso where valorcurso between 3 and 60;
select* from tb_curso where professor like'j%';

select * from tb_categoria inner join tb_curso on tb_curso.aux = tb_categoria.id;
select * from tb_categoria inner join tb_curso on tb_curso.aux = tb_categoria.id where id=1;