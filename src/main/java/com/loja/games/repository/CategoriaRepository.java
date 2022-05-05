package com.loja.games.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loja.games.model.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long>{

}
