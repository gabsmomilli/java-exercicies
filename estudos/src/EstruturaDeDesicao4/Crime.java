package EstruturaDeDesicao4;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qntdRespostas;

        System.out.println("Telefonou para a vitima? (0- nao , 1-sim) ");
        int telefone = leitor.nextInt();
        System.out.println("Esteve no local do crime? (0- nao , 1-sim) ");
        int local = leitor.nextInt();
        System.out.println("Mora perto da vitima? (0- nao , 1-sim) ");
        int moraPerto = leitor.nextInt();
        System.out.println("Devia para a vitima? (0- nao , 1-sim) ");
        int deviaParaVitima = leitor.nextInt();
        System.out.println("Ja trabalhou com a vitima? (0- nao , 1-sim) ");
        int trabalhouComAVitima = leitor.nextInt();

        qntdRespostas = telefone + local + moraPerto + deviaParaVitima + trabalhouComAVitima;

        if ( qntdRespostas == 2){
            System.out.println("Suspeito");
        } else if ( qntdRespostas == 3 | qntdRespostas ==4){
            System.out.println("Cumpice");
        } else if ( qntdRespostas == 5){
            System.out.println("Assassino");
        } else if (qntdRespostas <2 ){
            System.out.println("Inocente");
        }
    }
}
