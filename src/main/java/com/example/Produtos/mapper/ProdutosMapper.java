package com.example.Produtos.mapper;

import com.example.Produtos.Entity.Produtos;
import com.example.Produtos.dto.ProdutosDTO;
import org.springframework.stereotype.Component;


@Component
public class ProdutosMapper {
    public Produtos map(ProdutosDTO produtosDTO){
        Produtos produtos = new Produtos();

        produtos.setId(produtosDTO.getId());
        produtos.setNome(produtosDTO.getNome());
        produtos.setDescricao(produtosDTO.getDescricao());
        produtos.setPreco(produtosDTO.getPreco());
        produtos.setQuantidade(produtosDTO.getQuantidade());

        return produtos;
    }

    public ProdutosDTO map(Produtos produtos){
        ProdutosDTO produtosDTO = new ProdutosDTO();

        produtosDTO.setId(produtos.getId());
        produtosDTO.setNome(produtos.getNome());
        produtosDTO.setDescricao(produtos.getDescricao());
        produtosDTO.setPreco(produtos.getPreco());
        produtosDTO.setQuantidade(produtos.getQuantidade());

        return produtosDTO;
    }

}
