package br.com.trainingloiane.javabasico.exercicios.java.basico.exception;

public class Aula48 {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0, 2, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if(numeros[i]%2 !=0){
                    throw new NaoInteiroException(numeros[i], denominadores[i]);
                }
                System.out.println(numeros[i] + "/" + denominadores[i] + " = Resultado Divisão: " + numeros[i] / denominadores[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NaoInteiroException ex) {
                //System.out.println("----Errou rude, errou feio!----");
               // ex.printStackTrace();
               System.out.println(ex.toString());
            }
//            catch(Throwable exc){
//                System.out.println("Oxxxxxx");
//            }
        }


    }
}
