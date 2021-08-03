package br.com.trainingloiane.javabasico.exercicios.java.basico.aula25.classe;

/*
 1. Escreva  uma  classe  para  representar  uma  lâmpada.
 Desenvolva  métodos   para  ligar,  desligar  a  lampada.
 */
public class Lampada {
    private boolean estado;

    public void ligarLampada() {
        estado = true;
    }

    public void desligarLampada() {
        estado = false;
    }

    public void mudarEstado(){
        if(estado){
            desligarLampada();
        }
        else {
            ligarLampada();
        }
    }
    @Override
    public String toString() {
        if (!estado) {
            return "Lâmpada está desligada.";
        } else {
            return "Lâmpada está ligada.";
        }
    }
}