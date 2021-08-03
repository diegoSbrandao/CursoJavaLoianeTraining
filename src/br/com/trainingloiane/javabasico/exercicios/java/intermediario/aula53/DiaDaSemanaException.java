package br.com.trainingloiane.javabasico.exercicios.java.intermediario.aula53;

public class DiaDaSemanaException extends Exception{
    private String msg = "Errou rude, errou feio!";


    public DiaDaSemanaException() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DiaDaSemanaException(Throwable cause, String msg) {
        super(cause);
        this.msg = msg;
    }

}
