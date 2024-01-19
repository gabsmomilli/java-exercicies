package OrientacaoAObjetos.ModelagemDeclasse3;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBanco {
    private ArrayList<Conta> contas;
    private Scanner leitor;

    public SistemaBanco(ArrayList<Conta> contas, Scanner leitor){
        this.contas = new ArrayList<>();
        leitor = new Scanner(System.in);
    }

    public void saque(Scanner leitor) {
        System.out.println("informe o numero de sua conta: ");
        Integer numeroDaConta = leitor.nextInt();

        if(buscarContaPeloNumeroDaConta(contas, numeroDaConta) != null){
            Conta conta = buscarContaPeloNumeroDaConta(contas, numeroDaConta);

            System.out.println("Informe o valor que deseja sacar: ");
            Double saldo = leitor.nextDouble();
            if(conta.getSaldo() >= saldo){
                double novoSaldo = conta.getSaldo() - saldo;
                conta.setSaldo(novoSaldo);
            } else {
                System.out.println("saldo insuficiente.");
            }
        } else {
            System.out.println("Esta conta nao consta no banco.");
        }
    }

    public Conta buscarContaPeloNumeroDaConta(ArrayList<Conta> contas, Integer numeroDaConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroDaConta().equals(numeroDaConta)){
                return conta;
            }
        }
        return null;
    }

    public void deposito(Scanner leitor){
        System.out.println("Informe o numero da conta no qual deseja realizar o deposito: ");
        Integer numeroDaConta = leitor.nextInt();

        if(buscarContaPeloNumeroDaConta(contas, numeroDaConta) != null){
            Conta conta = buscarContaPeloNumeroDaConta(contas, numeroDaConta);

            System.out.println("Informe o valor que deseja depositar: ");
            Double deposito = leitor.nextDouble();

            double novoSaldo = conta.getSaldo() + deposito;
            conta.setSaldo(novoSaldo);
        } else {
            System.out.println("Esta conta nao consta no banco.");
        }
    }

    public void extratoDeUmaConta(Scanner leitor){
        System.out.println("Informe o numero da conta no qual deseja visualizar o extrato: ");
        Integer numeroDaConta = leitor.nextInt();

        Conta contaMostrarExtrato = buscarContaPeloNumeroDaConta(contas, numeroDaConta);
        if (contaMostrarExtrato != null){
            System.out.println("EXTRATO\n" +
                    "Nome do correntista: " + contaMostrarExtrato.getNomeDoCorrentista() +
                    "- Numero da conta: " + contaMostrarExtrato.getNumeroDaConta() + "\n" +
                    "- Saldo: " + contaMostrarExtrato.getSaldo());
        }
    }
}
