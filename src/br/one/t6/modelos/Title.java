package br.one.t6.modelos;

public class Title {
    private String nome;
    private int anoDeLancamento;
    private boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;


    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacao;
    }

    public void setIncluindoNoPlano(boolean incluindoNoPlano) {
        this.incluindoNoPlano = incluindoNoPlano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluindoNoPlano() {
        return incluindoNoPlano;
    }


    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibirFichaTec(){
        System.out.println("Nome Do Filme: " + getNome());
        System.out.println("Ano De Lançamento: " + getAnoDeLancamento());
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double pegarMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
