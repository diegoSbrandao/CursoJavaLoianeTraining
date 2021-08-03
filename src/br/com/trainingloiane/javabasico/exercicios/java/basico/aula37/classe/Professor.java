package br.com.trainingloiane.javabasico.exercicios.java.basico.aula37.classe;

public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;

    public String obterEtiquetaEndereco(){
        String x = "Rua do Professor: ";
        return x+= super.getEndereco();
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }

}