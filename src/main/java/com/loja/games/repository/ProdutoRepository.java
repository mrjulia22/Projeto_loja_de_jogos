package com.loja.games.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.games.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long>{

}
