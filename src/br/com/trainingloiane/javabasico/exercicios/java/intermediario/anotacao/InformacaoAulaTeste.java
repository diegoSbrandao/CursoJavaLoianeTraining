package br.com.trainingloiane.javabasico.exercicios.java.intermediario.anotacao;

public @interface InformacaoAulaTeste {

    String autor();

    int aulaNumero();

    String blog() default "http://loiane.com";

    String site() default "http://loiane.training";
}
