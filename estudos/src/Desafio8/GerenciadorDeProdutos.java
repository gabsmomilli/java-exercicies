package Desafio8;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeProdutos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        int opcao = -1;

        while (opcao != 4){
            exibirMenu();

            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao){
                case 1:
                    inserirProduto(produtos, leitor);
                    break;
                case 2:
                    exibirProdutos(produtos);
                    break;
                case 3:
                    deletarProduto(produtos, leitor);
                    break;
                default:
                    System.out.println("Programa encerrado.");
            }
        }
    }
    public static void exibirMenu(){
        System.out.println("Informe o numero da opcao desejada:");
        System.out.println("1- Adicionar produto no carrinho");
        System.out.println("2- Ver produtos do carrinho");
        System.out.println("3- Remover produto do carrinho");
        System.out.println("4- Finalizar programa");
    }
    public static void inserirProduto(ArrayList<Produto> produtos, Scanner leitor){
        System.out.println("Informe o nome do produto: ");
        String nome = leitor.next();
        System.out.println("Informe o preco do produto: ");
        Double preco = leitor.nextDouble();

        if(buscarProduto(produtos, nome ) == null){
            Produto novoProduto = new Produto(nome, preco);
            produtos.add(novoProduto);
            System.out.println("Produto inserido no carrinho com sucesso.");
        }else {
            System.out.println("Produto ja existente no carrinho.");
        }
    }
    public static Produto buscarProduto(ArrayList<Produto> produtos, String nome){
        for(Produto produto : produtos){
            if(produto.nome.equals(nome)){
                return produto;
            }
        }
        return null;
    }
    public static void exibirProdutos(ArrayList<Produto> produtos){
        if( produtos.isEmpty()){
            System.out.println("O carrinho esta vazio.");
        }else{
            System.out.println("Itens no carrinho; ");
            for(Produto produto : produtos){
                System.out.println("Nome: "+produto.nome+", preco: "+ produto.preco);
            }
        }
    }

    public static void deletarProduto(ArrayList<Produto> produtos, Scanner leitor){
        System.out.println("Informe o nome do produto que deseja remover do carrinho: ");
        String nomeParaDeletar = leitor.next();

        if(nomeParaDeletar != null){
            produtos.remove(nomeParaDeletar);
            System.out.println("Produto deletado com sucesso");
        }else {
            System.out.println("Produto nao encontrado");
        }
    }

}
