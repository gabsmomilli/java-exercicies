package Desafio8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeFuncionarios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int opcao = -1;

        while (opcao != 3){
            exibirMenu();

            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao){
                case 1:
                    inserirFuncionario(funcionarios, leitor);
                    break;
                case 2:
                    listarFuncionarios(funcionarios);
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamete.");
            }
        }
    }
    private static void exibirMenu() {
        System.out.println("Informe o numero da opcao desejada: ");
        System.out.println("1- Adicionar funcionario.");
        System.out.println("2- Exibir lista de funcionarios.");
        System.out.println("3- Encerrar programa.");
    }

    public static void inserirFuncionario(ArrayList<Funcionario> funcionarios, Scanner leitor){
        System.out.println("Informe o nome do funcionario:");
        String nome = leitor.next();
        System.out.println("Informe o telefone do funcionario:");
        String telefone = leitor.next();
        System.out.println("Informe o email do funcionario:");
        String email = leitor.next();
        System.out.println("Informe o CPF do funcionario:");
        String cpf = leitor.next();

        if(buscaFuncionarioPorCPF(funcionarios, cpf) == null){
            Funcionario novoFuncionario = new Funcionario(nome,telefone,email,cpf);
            funcionarios.add(novoFuncionario);
            System.out.println("Funcionario cadastrado com sucesso!");
        }else{
            System.out.println("Este funcionario ja existe na base.");
        }
    }
    public static Funcionario buscaFuncionarioPorCPF(ArrayList<Funcionario> funcionarios, String cpf){
        for(Funcionario funcionario : funcionarios){
            if(funcionario.cpf.equals(cpf)){
                return funcionario;
            }
        }
        return null;
    }

    public static void listarFuncionarios(ArrayList<Funcionario> funcionarios){
        if(funcionarios.isEmpty()){
            System.out.println("Nenhum funcionarion foi cadastrado ainda.");
        }else {
            System.out.println("Lista de funcionarios: ");
            for (Funcionario funcionario : funcionarios){
                System.out.println("Nome: "+funcionario.nome+", telefone: "+funcionario.telefone+
                        ", email: "+ funcionario.email+", cpf: "+funcionario.cpf);
            }
        }
    }
}
