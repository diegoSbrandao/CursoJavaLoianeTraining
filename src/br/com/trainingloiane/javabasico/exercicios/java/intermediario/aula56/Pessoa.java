package br.com.trainingloiane.javabasico.exercicios.java.intermediario.aula56;

public class Pessoa {
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;

    public Pessoa() {
    }

    public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "tipoDocumento=" + tipoDocumento +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                '}';
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
}
