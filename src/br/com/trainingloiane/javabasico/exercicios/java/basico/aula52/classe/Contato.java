package br.com.trainingloiane.javabasico.exercicios.java.basico.aula52.classe;

/*
 1. Escreva  uma  classe  Contato  que  contenha  nome,  telefone  e  um   identificador.
 Esse  identificador  deve  ser  gerado  automaticamente  pela   classe  através  de  um  contador.

  (cada  vez  que  um  Contato  é  criado  o   contador  é  incrementado  e  atribuído  ao  identificador).
   Crie  uma  classe   Agenda  que  irá  funcionar  para  gerenciar  os  Contatos.
   Essa  classe  precisa   de  ter  um  método  para  adicionar  um  Contato  e  também  para  consultar.

    Crie  uma  classe  Teste  que  informe  um  menu  ao  usuário:
    1‐  para  consultar   um  contato  da  agenda  e
    2  –  para  adicionar  um  contato  na  agenda.

    Se  o  contato  não  existir,  o  programa  deve  lançar  uma  exceção  de   ContatoNaoExisteException.
     Caso  a  agenda  esteja  cheia  quando  o  usuário   quiser  adicionar  um  novo  contato,
     o  programa  deve  lançar  uma  exceção   AgendaCheiaExeption.
     Trate  também  as  exceções  de  tipo  de  dados
     (caso  o   usuário  entre  com  um  tipo  de  dado  inválido.
 */
public class Contato {
    private String nome;
    private String telefone;
    private int id;
    private String email;
    private static int CONTADOR = 0;

    public Contato() {
        CONTADOR++;
        id += CONTADOR;
    }

    public Contato(String nome, String telefone, int id) {
        this.nome = nome;
        this.telefone = telefone;
        this.id = id;
    }

    public int getCONTADOR() {
        return CONTADOR;
    }

    @Override
    public String toString() {
        String s = "[";
        s += "Id: " + id;
        s += ", Nome: " + nome;
        s += ", Telefone: " + telefone;
        s += ", Email: " + email;
        s += "]";
        return s;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
