package com.loja.games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loja.games.model.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long>{
	public List <Categoria> findAllByTituloCategoriaContainingIgnoreCase(String tituloCategoria);

}
