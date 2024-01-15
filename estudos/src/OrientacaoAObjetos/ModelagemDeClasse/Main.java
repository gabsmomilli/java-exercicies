package OrientacaoAObjetos.ModelagemDeClasse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // BOLA
        Bola bola1 = new Bola(3.14, "branca", "barbie",30.0);
        Bola bola2 = new Bola(19.6,"adidas", "azul", 27.9);
        Bola bola3 = new Bola(15.7, "verde", "nike", 0.1);

        bola1.exibirInformacoes();
        bola2.exibirInformacoes();
        bola3.exibirInformacoes();

        // PESSOA
        Pessoa pessoa1 = new Pessoa("Gabriela", 22 , 59.0, 1.63);
        Pessoa pessoa2 = new Pessoa("Ramon", 22, 90.0, 1.68);
        Pessoa pessoa3 = new Pessoa("Carla", 37, 65.0, 1.71);

        pessoa1.exibirInformacoes();
        pessoa1.calcularIMC();

        pessoa2.exibirInformacoes();
        pessoa2.calcularIMC();

        pessoa3.exibirInformacoes();
        pessoa3.calcularIMC();

        // CONTA CORRENTE
        ContaCorrente conta1 = new ContaCorrente(1234, "Gabriela", 0.10);
        ContaCorrente conta2 = new ContaCorrente(12345, "Ramon",10000.00);
        ContaCorrente conta3 = new ContaCorrente(123456, "Carla", 15000.00);

        conta1.exibirInformacoes();
        conta2.exibirInformacoes();
        conta3.exibirInformacoes();

        // CARRO
        Carro carro1 = new Carro(4, "Terrify", "Ford", 2.5);
        Carro carro2 = new Carro(4, "Onix", "Chevrolet" );
        Carro carro3 = new Carro(4, "Q5", "Audi", 2.5);

        carro1.exibirInformacoes();
        carro2.exibirInformacoes();
        carro3.exibirInformacoes();

        //PAIS
        Pais pais1 = new Pais ("Brasil", "1700000km", 100000);
        Pais pais2 = new Pais ("Argentina", "14639km", 1800);
        Pais pais3 = new Pais ("Peru", "1799m", 3728);
        Pais pais4 = new Pais ("Paraguai", "9731km", 34738);

        Pais pais = new Pais();
        List<Pais> continente = new ArrayList<>();
        continente.add(pais1);
        continente.add(pais2);
        continente.add(pais3);
        continente.add(pais4);

        pais.exibirInformacoes(continente);
    }
}
