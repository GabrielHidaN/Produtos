package com.example.Produtos.repository;

import com.example.Produtos.Entity.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface   ProdutosRepository extends JpaRepository<Produtos, Long> {
}
