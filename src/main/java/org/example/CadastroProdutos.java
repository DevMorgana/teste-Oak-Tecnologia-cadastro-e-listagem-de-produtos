package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CadastroProdutos {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(String nome, String descricao, double valor, boolean disponivelParaVenda) {
        Produto produto = new Produto(nome, descricao, valor, disponivelParaVenda);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        Collections.sort(produtos, Comparator.comparingDouble(Produto::getValor));

        System.out.println("Listagem de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}