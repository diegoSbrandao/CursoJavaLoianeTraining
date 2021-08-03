package br.com.trainingloiane.javabasico.exercicios.java.basico.aula37.classe;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public String obterEtiquetaEndereco(){
        String x = "Rua do aluno: ";
        return x+= super.getEndereco();
    }

    @Override
    public String toString() {
      String s = "Nome do curso: " + getCurso()+" \n";
      for(double nota: notas){
          s+= "Notas: " + nota+"\n";
      }
      return s;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }
}