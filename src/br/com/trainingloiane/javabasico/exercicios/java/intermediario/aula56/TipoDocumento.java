package br.com.trainingloiane.javabasico.exercicios.java.intermediario.aula56;

public enum TipoDocumento {

    CPF {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.cpf();
        }
    }, CNPJ {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.cnpj();
        }
    };

    public abstract String geraNumeroTeste();
}