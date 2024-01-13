package EstruturaDeDecisao3;

import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double reajuste;
        double novoSalario;

        System.out.println("informe seu salario: ");
        double salario = leitor.nextDouble();

        if (salario <= 280.0){
            reajuste = salario * 0.2;
            novoSalario = salario + reajuste;
            System.out.println("salario antes do reajuste: "+ salario+
                    "\npercentutal de aumento aplicado: 20%"+
                    "\nvalor do aumento: " + reajuste +
                    "\nnovo salario: "+ novoSalario);
        }else if (salario > 280.0 & salario <= 700.0){
            reajuste = salario * 0.15;
            novoSalario = salario + reajuste;
            System.out.println("salario antes do reajuste: "+ salario+
                    "\npercentutal de aumento aplicado: 15%"+
                    "\nvalor do aumento: " + reajuste +
                    "\nnovo salario: "+ novoSalario);
        }else if (salario > 700 & salario <= 1500){
            reajuste = salario * 0.10;
            novoSalario = salario + reajuste;
            System.out.println("salario antes do reajuste: "+ salario+
                    "\npercentutal de aumento aplicado: 10%"+
                    "\nvalor do aumento: " + reajuste +
                    "\nnovo salario: "+ novoSalario);
        }else if (salario > 1500.0){
            reajuste = salario * 0.05;
            novoSalario = salario + reajuste;
            System.out.println("salario antes do reajuste: "+ salario+
                    "\npercentutal de aumento aplicado: 5%"+
                    "\nvalor do aumento: " + reajuste +
                    "\nnovo salario: "+ novoSalario);
        }

    }
}
