package com.estoque.manager.gerenciador_estoque.repository;

import com.estoque.manager.gerenciador_estoque.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}