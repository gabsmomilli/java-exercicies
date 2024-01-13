package OrientacaoAObjetos.Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4){
            exibirMenu();

            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao){
                case 1:
                    adcProduto(produtos, leitor);
                    break;
                case 2:
                    listarProdutos(produtos);
                    break;
                case 3:
                    deletarProduto(produtos, leitor);
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opcão invalida.");
            }
        }
    }

    public static void exibirMenu(){
        System.out.println("Informe o numero da opcão desejada: ");
        System.out.println("1- Adicionar produto no carrinho.");
        System.out.println("2- Listar produtos do carrinho.");
        System.out.println("3- Deletar produto do carrinho.");
        System.out.println("4- Finalizar programa.");
    }

    public static void adcProduto(ArrayList<Produto> produtos, Scanner leitor){
        System.out.println("Informe o nome do produto: ");
        String nome = leitor.next();
        System.out.println("Informe o valor do produto: ");
        Double preco = leitor.nextDouble();

        if(buscarProduto(produtos, nome) == null){
            Produto novoProduto = new Produto(nome,preco);
            produtos.add(novoProduto);
            System.out.println("Novo produto adicionado no carrinho.");
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

    public static void listarProdutos(ArrayList<Produto> produtos){
        if(produtos.isEmpty()){
            System.out.println("O carinho esta vazio.");
        }else{
            System.out.println("Itens no carrinho; ");
            for(Produto produto : produtos){
                System.out.println("Nome: "+produto.nome+", preco: "+produto.preco);
            }
        }
    }

    public static void deletarProduto(ArrayList<Produto> produtos, Scanner leitor){
        System.out.println("Informe o nome do produto que deseja excluir de seu carrinho: ");
        String produtoParaDeletar = leitor.next();

        if(produtoParaDeletar != null){
            produtos.remove(produtoParaDeletar);
            System.out.println("Produto deletado com sucesso!");
        }else{
            System.out.println("Produto não encontrado.");
        }

    }
}
