package com.example.blogEclipse.repository;

import java.util.List;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.blogEclipse.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem,Long>{
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
}
