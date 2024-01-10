package Desafio8;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeCandidatos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Candidato> candidatos = new ArrayList<>();
        int opcao = -1;

        while(opcao =! 5){
            exibirMenu();

            opcao = leitor.nextInt();;
            leitor.nextLine();
            switch (opcao){
                case 1:
                    adcCandidato(candidatos, leitor);
                    break;
                case 2:
                    exibirCandidato(candidatos);
                    break;
                case 3:
                    deletarCandidato(candidatos, leitor);
                    break;
                case 4:
                    System.out.println("Encerrar programa.");
                default:
                    System.out.println("opcao invalida.");
            }
        }
        private static void exibirMenu() {
            System.out.println("Informe o numero da opcao desejada: ");
            System.out.println("1- Adicionar candidato.");
            System.out.println("2- Exibir lista de candidatos.");
            System.out.println("3- Deletar candidato.");
            System.out.println("4- Encerrar programa.");
        }
        public static void adcCandidato(ArrayList<Candidato> candidatos, Scanner leitor){
            System.out.println("Informe o numero da matricula:");
            String numeroMatricula = leitor.next();
            System.out.println("Informe a nota do candidato:");
            String nota = leitor.next();

            if(buscarCandidato(candidatos, numeroMatricula) == null){
                Candidato novoCandidato = new Produto(numeroMatricula,numeroMatricula);
                candidatos.add(novoCandidato);
                System.out.println("Candidato cadastrado com sucesso.");
            }else{
                System.out.println("Candidato ja existente na base.");
            }
        }
        public static Candidato buscarCandidato(ArrayList<Candidato> candidatos, Scanner leitor){
            System.out.println("Informe o candidato que deseja procurar: ");
            String numeroMatricula = leitor.next();

            for(Candidato candidato : candidatos){
                if (candidato.numeroMatricula.equals(numeroMatricula)){
                    return candidato;
                }
            }
            return null;
        }

        public static void exibirCandidato(ArrayList<Candidato>){}

    }
}
