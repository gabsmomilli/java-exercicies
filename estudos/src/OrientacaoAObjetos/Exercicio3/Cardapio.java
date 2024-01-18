package OrientacaoAObjetos.Exercicio3;

import Desafio8.Candidato;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cardapio {
    Scanner leitor = new Scanner(System.in);
    ArrayList<Prato> pratos = new ArrayList<>();
    ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    Prato prato = new Prato();

    public static void exibirMenu(){
        System.out.println("Informe o numero da opcao desejada: ");
        System.out.println("1- Adicionar prato.");
        System.out.println("2- Listar pratos.");
        System.out.println("3- Deletar prato");
        System.out.println("4- Finalizar programa.");
    }

    public static void adcPrato(ArrayList<Prato> pratos, Scanner leitor){
        List<Ingrediente> ingredientes = new ArrayList<>();
        Prato prato = new Prato();
        String x = "s";

        System.out.println("Informe o nome do prato:");
        String nome = leitor.next();

        while (x.equals("s")){
            System.out.println("Informe o ingrediente: ");
            String nomeIngrediente = leitor.next();

            System.out.println("Informe a quantidade de "+nomeIngrediente);
            String qndtIngrediente = leitor.next();

            Ingrediente novoIngrediente = new Ingrediente(nomeIngrediente, qndtIngrediente);
            ingredientes.add(novoIngrediente);

            System.out.println("Ingrediente adicionado no prato " + nome);

            System.out.println("Deseja informar mais algum ingrediente?");
            x = leitor.next();
        }

        prato.setNome(nome);
        prato.setIngredientes(ingredientes);
        pratos.add(prato);

    }

    public static void listarPratos(ArrayList<Prato> pratos) {
        if (pratos.isEmpty()) {
            System.out.println("Nao ha nenhum prato no cardapio.");
        } else {
            System.out.println("Cardapio: ");
            for (Prato prato : pratos) {
                System.out.println("Nome do prato: " + prato.getNome());
                System.out.println("Ingredientes:");

                for (Ingrediente ingrediente : prato.getIngredientes()) {
                    System.out.println(" - " + ingrediente.getNome() + ": " + ingrediente.getPorcao());
                }
            }
        }
    }

    public static Prato buscarPrato(ArrayList<Prato> pratos,  String nome){
        for(Prato prato : pratos){
            if (prato.getNome().equals(nome)){
                return prato;
            }
        }
        return null;
    }

    public static void deletarPrato(ArrayList<Prato> pratos, Scanner leitor){
        System.out.println("Informe o prato que deseja deletar do cardapio: ");
        String nome = leitor.next();

        Prato pratoParaDeletar = buscarPrato(pratos, nome);

        if (pratoParaDeletar != null){
            pratos.remove(pratoParaDeletar);
            System.out.println("Prato " + nome + " foi removido com sucesso!");
        }else{
            System.out.println("Produto não encontrado.");
        }
    }
}
