package OrientacaoAObjetos.Exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDoVestibular {
    Scanner leitor = new Scanner(System.in);
    ArrayList<Candidato> candidatos = new ArrayList<>();


    public SistemaDoVestibular(ArrayList<Candidato> candidatos){
        this.candidatos = candidatos;
    }
    public ArrayList<Candidato> getCandidatos(){
        return candidatos;
    }
    public void setCandidatos(ArrayList<Candidato> candidatos){
        this.candidatos = candidatos;
    }

    static void exibirMenu() {
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
        Double nota = leitor.nextDouble();

        if(buscarCandidato(candidatos, numeroMatricula) == null){
            Candidato novoCandidato = new Candidato(numeroMatricula, nota);
            candidatos.add(novoCandidato);
            System.out.println("Candidato cadastrado com sucesso.");
        }else{
            System.out.println("Candidato ja existente na base.");
        }
    }

    public static void exibirCandidatos(ArrayList<Candidato> candidatos){
        if(candidatos.isEmpty()){
            System.out.println("Nao ha nenhum candidato cadastrado.");
        }else{
            System.out.println("Lista de candidatos: ");
            for(Candidato candidato : candidatos){
                System.out.println("N° da matricula: "+ candidato.getNumeroMatricula() +
                        ", nota: "+ candidato.getNota());
            }
        }
    }

    public static Candidato buscarCandidato(ArrayList<Candidato> candidatos, String numeroMatricula){
        for(Candidato candidato : candidatos){
            if (candidato.getNumeroMatricula().equals(numeroMatricula)){
                return candidato;
            }
        }
        return null;
    }

    public static void deletarCandidato(ArrayList<Candidato> candidatos, Scanner leitor){
        System.out.println("Informe o numero da matricula do candidato que deseja deletar: ");
        String numeroMatricula = leitor.next();

        Candidato candidatoParaDeletar = buscarCandidato(candidatos, numeroMatricula);

        if(candidatoParaDeletar != null){
            candidatos.remove(candidatoParaDeletar);
            System.out.println("Candidato deletado com sucesso!");
        }else{
            System.out.println("Matricula nao encontrada.");
        }
    }
}
