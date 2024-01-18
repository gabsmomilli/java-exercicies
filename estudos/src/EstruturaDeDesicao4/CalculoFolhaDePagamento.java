package EstruturaDeDesicao4;

import java.util.Scanner;

public class CalculoFolhaDePagamento {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salarioBruto;
        double salarioLiquido;
        double descontos;
        double inss;

        System.out.println("Informe o valor de sua hora trabalhada: ");
        double valorDaHora = leitor.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas por dia: ");
        double qntdHoras = leitor.nextDouble();

        salarioBruto = (qntdHoras * 22) * valorDaHora;
        inss = salarioBruto * 0.10;

        if (salarioBruto <= 900){
            salarioLiquido = inss;
            System.out.println(salarioLiquido);
        }else if (salarioBruto > 900 & salarioBruto <= 1500){
            salarioLiquido = inss + (salarioBruto * 0.05);
            System.out.println(salarioLiquido);
        }else if ( salarioBruto > 1500 & salarioBruto <=2500){
            salarioLiquido =inss + (salarioBruto * 0.1);
            System.out.println(salarioLiquido);
        }else if (salarioBruto > 2500 ){
            salarioLiquido = inss + (salarioBruto * 0.2);
            System.out.println(salarioLiquido);
        }
    }
}
