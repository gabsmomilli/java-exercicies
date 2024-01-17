package OrientacaoAObjetos.ModelagemDeClasse2;

public class ContaCorrente {
    private Integer numeroConta;
    private String nomeCorrentista;
    private Double saldo;

    public ContaCorrente(Integer numeroConta, String nomeCorrentista, Double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public ContaCorrente(Integer numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void exibirInformacoes(){
        System.out.println("Informacoes da conta: ");
        System.out.println("- Numero da conta: " + numeroConta);
        System.out.println("- Nome: " + nomeCorrentista);
        System.out.println("- Saldo: " + saldo + "\n");
    }
}
