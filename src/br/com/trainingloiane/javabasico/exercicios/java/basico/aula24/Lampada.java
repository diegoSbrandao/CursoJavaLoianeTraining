package br.com.trainingloiane.javabasico.exercicios.java.basico.aula24;

import java.util.Arrays;

/*
1. Escreva  uma  classe  para  representar  uma  lâmpada  que  está  à  venda  em   um  supermercado.
 */
public class Lampada {
    private String modelo;
    private String tensao;
    private String cor;
    private String tipoLuz;
    private int potencia;
    private int garantiaMeses;
    private double preco;
    private String[] tipos = new String[5];

    public Lampada() {
    }

    public Lampada(String modelo, String tensao, String cor, String tipoLuz, int potencia, int garantiaMeses, double preco) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.potencia = potencia;
        this.garantiaMeses = garantiaMeses;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "modelo='" + modelo + '\'' +
                ", tensao='" + tensao + '\'' +
                ", cor='" + cor + '\'' +
                ", tipoLuz='" + tipoLuz + '\'' +
                ", potencia=" + potencia +
                ", garantiaMeses=" + garantiaMeses +
                ", preco=" + preco +
                ", tipos=" + Arrays.toString(tipos) +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }
}
