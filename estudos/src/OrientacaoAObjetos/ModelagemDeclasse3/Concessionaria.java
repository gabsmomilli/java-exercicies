package OrientacaoAObjetos.ModelagemDeclasse3;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();
        SistemaConcessionaria sistemaConcessionaria = new SistemaConcessionaria();

        Carro carro1= new Carro("onix", 1000000.0,
                "chevrolet", "vermelho", 8600.0, "BC1GE");
        carros.add(carro1);
    }
}
