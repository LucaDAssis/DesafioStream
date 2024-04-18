package br.one.t6.modelos;

import br.one.t6.calculadoras.Classificavel;

public class Movie extends Title implements Classificavel {

    private String diretor;

    public Movie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }


    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (pegarMedia() / 2);
    }

    @Override
    public String toString() {
        return " Filme: ( " + this.getNome() + " )  Ano de Lançamento: " + this.getAnoDeLancamento();
    }
}
