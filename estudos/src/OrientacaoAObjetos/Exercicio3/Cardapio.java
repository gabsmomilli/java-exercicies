package OrientacaoAObjetos.Exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cardapio {
    Scanner leitor = new Scanner(System.in);
    ArrayList<Prato> pratos = new ArrayList<>();
    ArrayList<Ingrediente> ingredientes = new ArrayList<>();

    public static void exibirMenu(){
        System.out.println("Informe o numero da opcao desejada: ");
        System.out.println("1- Adicionar prato.");
        System.out.println("2- Listar pratos.");
        System.out.println("3- Deletar prato");
        System.out.println("4- Finalizar programa.");
    }

    public static void adcPrato(Prato prato, Scanner leitor){
        String x = "S";
        System.out.println("Informe o nome do prato:");
        String nome = leitor.next();

        List<Ingrediente> ingredientes = new ArrayList<>();

        while (x.equals("S")){
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

        prato.setIngredientes(ingredientes);

        System.out.println("Seu prato foi salvo com os seguintes ingredientes " + prato.getIngredientes());


    }
}
