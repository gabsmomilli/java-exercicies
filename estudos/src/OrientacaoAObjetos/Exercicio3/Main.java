package OrientacaoAObjetos.Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

import static OrientacaoAObjetos.Exercicio3.Cardapio.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Prato> pratos = new ArrayList<>();
        Prato prato = new Prato();
        int opcao = -1;

        while (opcao != 4){
            exibirMenu();
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao){
                case 1:
                    adcPrato(pratos, leitor);
                    break;
                case 2:
                    listarPratos(pratos);
                    break;
                case 3:
                    deletarPrato(pratos, leitor);
                    break;
                case 4:
                    System.out.println("Finalizar programa.");
                    break;
                default:
                    System.out.println("Erro. Informe um numero valido.");
                    break;
            }
        }
    }
}
