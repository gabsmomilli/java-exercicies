package EstruturaSequencial;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       double salarioBruto;
       double inss;
       double impostoDeRenda;
       double sindicato;
       double salarioLiquido;
       double descontos;

       System.out.println("Por favor digite seu salario em horas: ");
       double salarioPorHora = leitor.nextDouble();
        System.out.println("Por favor digite as horas trabalhadas por dia: ");
        double horasTrabalhadas = leitor.nextDouble();

        salarioBruto = (salarioPorHora * horasTrabalhadas) * 22;
        inss = salarioBruto * 0.08;
        impostoDeRenda =  salarioBruto * 0.11;
        sindicato = salarioBruto * 0.05;
        descontos = inss + sindicato + impostoDeRenda;
        salarioLiquido = salarioBruto - descontos;


        //Folha de Pagamento
        System.out.println("===============================================");
        System.out.println("                    Pagamento                  ");
        System.out.println("===============================================");
        System.out.println("EstruturaSequencial.Salario por hora: \t\t" + salarioPorHora);
        System.out.println("Horas trabalhadas: \t\t" + horasTrabalhadas);
        System.out.println("SALARIO BRUTO: \t\t" + salarioBruto);
        System.out.println("===============================================");
        System.out.println("DESCONTOS:");
        System.out.println("Imposto de Renda (11%): \t" + impostoDeRenda);
        System.out.println("INSS (8%): \t\t\t" + inss);
        System.out.println("Sindicato (5%): \t\t" + sindicato);
        System.out.println("TOTAL DESCONTOS: \t\t" + descontos);
        System.out.println("===============================================");
        System.out.println("SALARIO LIQUIDO: \t\t" + salarioLiquido);
        System.out.println("===============================================");
    }

}

