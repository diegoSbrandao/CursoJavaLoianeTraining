package br.com.trainingloiane.javabasico.exercicios.java.estruturadedados.classes;

public class Televisao {
    String marca;
    boolean ligado;
    int volume;
    int canal;

    public Televisao() {
        ligado = false;
    }

    public void ligar(){
        ligado = true;
        System.out.println("Tv da marca: "+marca+" está ligada");
    }

    public void desligar(){
        ligado = false;
        System.out.println("Desligando a TV da marca: "+marca);
    }

    public void defineMarca(String marca) {
        this.marca = marca;
        System.out.println("Tv Marca: " + marca);
    }

    public void definirVolume(int volume) {
        if (ligado) {
            this.volume = volume;
            System.out.println("A Tv, tem o volume atual: " + volume);
        } else {
            System.out.println("A Tv está desligada, liga a Tv antes!" + marca);
        }
    }

    public void definirCanal(int canal) {
        if (ligado) {
            this.canal = canal;
            System.out.println("A Tv de marca: " + marca + " está com o canal definido: " + canal);
        } else {
            System.out.println("A Tv está desligada, liga a Tv antes!" + marca);
        }
    }

    public void aumentaVolume(int volume){
        if(ligado){
            this.volume++;
            System.out.println("O volume da Tv marca: "+marca+" está no nível: "+this.volume);
        }
        else {
            System.out.println("A Tv está desligada, ligue a Tv antes!");
        }
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "marca='" + marca + '\'' +
                ", ligado=" + ligado +
                ", volume=" + volume +
                ", canal=" + canal +
                '}';
    }
}
