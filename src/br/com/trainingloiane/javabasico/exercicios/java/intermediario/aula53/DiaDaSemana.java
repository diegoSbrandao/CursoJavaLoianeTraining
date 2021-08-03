package br.com.trainingloiane.javabasico.exercicios.java.intermediario.aula53;

public enum DiaDaSemana {
    SEGUNDA (1),TERCA(2),QUARTA(3),QUINTA(4),
    SEXTA(5),SABADO(6),DOMINGO(7);

    private int valor;

    DiaDaSemana(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
