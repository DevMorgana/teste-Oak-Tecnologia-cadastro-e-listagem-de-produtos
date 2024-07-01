package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    cadastrarProduto(scanner, cadastro);
                    cadastro.listarProdutos();
                    break;
                case 2:
                    cadastro.listarProdutos();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Cadastrar novo produto");
        System.out.println("2. Listar produtos");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarProduto(Scanner scanner, CadastroProdutos cadastro) {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Descrição do produto: ");
        String descricao = scanner.nextLine();

        System.out.print("Valor do produto: ");
        double valor = scanner.nextDouble();

        System.out.print("Disponível para venda (true/false): ");
        boolean disponivelParaVenda = scanner.nextBoolean();

        cadastro.cadastrarProduto(nome, descricao, valor, disponivelParaVenda);
    }
}