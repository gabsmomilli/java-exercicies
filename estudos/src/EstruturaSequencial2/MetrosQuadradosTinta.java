package EstruturaSequencial2;
import java.util.Scanner;

public class MetrosQuadradosTinta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double qntdLitros;
        double latas;
        double galoes;
        double preco;

        System.out.println("Informe a quantidade de area que sera pintada: ");
        double metrosQuadrados = leitor.nextDouble();

        qntdLitros = metrosQuadrados / 6;
        System.out.println("É necessario " +qntdLitros+ " litros para pintar esta area");

        if (qntdLitros < 18.0){
            galoes = qntdLitros / 3.6;
            preco = galoes * 25.0;
            System.out.println("Indicamos que compre "+galoes+
                    " galoes de tinta que dara um total de R$"+preco);
        }else if (qntdLitros >= 18.0){
            latas = qntdLitros / 18.0;
            preco = latas * 80.0;
            System.out.println("Indicamos que compre "+latas+
                    " latas de tinta que dara um total de R$"+ preco);
        }
    }
}
