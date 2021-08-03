package br.com.trainingloiane.javabasico.exercicios.java.basico.interfacexercicios;

public class TesteInterface implements Abc,Ghi,Def{
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

      TesteInterface n = new TesteInterface();
      n.imprime();
      System.out.println(n.soma(a,b));
      System.out.println(n.multi(a,b));

    }

    @Override
    public void imprime() {
        System.out.println("Método 01");
    }

    @Override
    public double multi(double a, double b) {
        return a*b;
    }

    @Override
    public int soma(int a, int b) {
        return a+b;
    }
}
