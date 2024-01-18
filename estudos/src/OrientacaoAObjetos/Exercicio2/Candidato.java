package OrientacaoAObjetos.Exercicio2;

public class Candidato {
    private String numeroMatricula;
    private Double nota;

    public Candidato(String numeroMatricula, Double nota){
        this.numeroMatricula = numeroMatricula;
        this.nota = nota;
    }

    public Candidato() {

    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public Double getNota() {
        return nota;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
