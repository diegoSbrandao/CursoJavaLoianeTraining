package br.com.trainingloiane.javabasico.exercicios.java.basico.aula36.teste;

import br.com.trainingloiane.javabasico.exercicios.java.basico.aula36.classe.Contato;
import br.com.trainingloiane.javabasico.exercicios.java.basico.aula36.classe.Endereco;
import br.com.trainingloiane.javabasico.exercicios.java.basico.aula36.classe.Telefone;

public class ContatoTeste {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Adebarldo");

        Endereco end = new Endereco();
        end.setNomeRua("Rua Aderbaldina");
        end.setCidade("Aderbalandia");
        end.setEstado("AD");
        end.setNumero("321");
        end.setCep("1112233344-456");

        Telefone tel = new Telefone();
        tel.setNumero("97888-4672");
        tel.setDdd("13");
        tel.setTipo("celular"); 
        
        Telefone tel2 = new Telefone();
        tel2.setNumero("3322-4672");
        tel2.setDdd("07");
        tel2.setTipo("casa");

        contato.setEndereco(end);

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;

        contato.setTelefones(telefones);

        System.out.println("-----------------");
        System.out.println(contato.getNome());

        if (contato.getTelefones()!= null) {
            for(Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

        if (contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }


    }
}
