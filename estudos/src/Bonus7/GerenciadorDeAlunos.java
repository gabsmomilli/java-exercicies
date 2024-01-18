package Bonus7;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeAlunos {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        int numeroDaTarefa = -1;

        while (numeroDaTarefa != 4){
            exibirMenu();

            numeroDaTarefa = leitor.nextInt();
            leitor.nextLine();
            switch (numeroDaTarefa){
                case 1 :
                    adicionarAluno(listaAlunos, leitor);
                    break;
                case 2:
                    exibirListaAlunos(listaAlunos);
                    break;
                case 3 :
                    excluirAlunoPorEmail(listaAlunos, leitor);
                    break;
                case 4 :
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                }
            }
        }

        private static void exibirMenu() {
            System.out.println("Informe o numero da opcao desejada: ");
            System.out.println("1- Adicionar aluno.");
            System.out.println("2- Exibir lista de alunos.");
            System.out.println("3- Excluir aluno por email.");
            System.out.println("4- Encerrar programa.");
        }

        private static void adicionarAluno(ArrayList<Aluno> listaAlunos, Scanner leitor) {
            System.out.println("Informe o nome do aluno: ");
            String nome = leitor.next();
            System.out.println("Informe o telefone do aluno: ");
            String telefone = leitor.next();
            System.out.println("Informe o email do aluno: ");
            String email = leitor.next();

            if (buscarAlunoPorEmail(listaAlunos, email) == null){
                Aluno novoAluno = new Aluno(nome, telefone, email);
                listaAlunos.add(novoAluno);
                System.out.println("Novo aluno cadastrado com sucesso!");
            }else {
                System.out.println("Erro ao cadastrar este aluno. Ja existe um aluno com este cadastro.");
            }
        }

        private static void exibirListaAlunos(ArrayList<Aluno> listaAlunos){
            if (listaAlunos.isEmpty()){
                System.out.println("Nenhum aluno cadastrado.");
            } else {
                System.out.println("Lista de Alunos cadastrados: ");
                for ( Aluno aluno : listaAlunos){
                    System.out.println("Nome: "+aluno.nome+", Telefone: "
                    +aluno.telefone+", Email: "+aluno.email);
                }
            }
        }
        private static Aluno buscarAlunoPorEmail(ArrayList<Aluno> listaAlunos, String email){
            for(Aluno aluno : listaAlunos){
                if (aluno.email.equals(email)){
                    return aluno;
                }
            }
            return null;
        }

        private static void excluirAlunoPorEmail(ArrayList<Aluno> listaAlunos, Scanner leitor){
            System.out.println("Informe o email do aluno que deseja exluir.");
            String email = leitor.next();

            Aluno alunoParaExcluir = buscarAlunoPorEmail(listaAlunos, email);

            if (alunoParaExcluir != null){
                listaAlunos.remove(alunoParaExcluir);
                System.out.println("Aluno excluido com sucesso!");
            }else {
                System.out.println("Aluno nao encontrado.");
            }
        }

    }