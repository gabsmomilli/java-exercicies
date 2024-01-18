package OrientacaoAObjetos.Exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

import static OrientacaoAObjetos.Exercicio2.SistemaDoVestibular.*;

public class Vertibular {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Candidato> candidatos = new ArrayList<>();
        int opcao = -1;

        while(opcao != 4){
            exibirMenu();
            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao){
                case 1:
                    adcCandidato(candidatos, leitor);
                    break;
                case 2:
                    exibirCandidatos(candidatos);
                    break;
                case 3:
                    deletarCandidato(candidatos, leitor);
                    break;
                case 4:
                    System.out.println("Encerrar programa,");
                default:
                    System.out.println("Erro. Numero invalido.");
            }
        }
    }
}
