package OrientacaoAObjetos.ModelagemDeclasse3;

public class Conta {
    private Integer numeroDaConta;
    private Double saldo;
    private String nomeDoCorrentista;

    public Conta(Integer numeroDaConta, Double saldo, String nomeDoCorrentista) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.nomeDoCorrentista = nomeDoCorrentista;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNomeDoCorrentista() {
        return nomeDoCorrentista;
    }

    public void setNomeDoCorrentista(String nomeDoCorrentista) {
        this.nomeDoCorrentista = nomeDoCorrentista;
    }

}
