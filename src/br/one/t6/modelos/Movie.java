package br.one.t6.modelos;

public class Movie {
    public String nome;
    public int anoDeLancamento;
    public boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    public int duracaoEmMinutos;


   public double getTotalDeAvaliacoes(){
       return totalDeAvaliacao;
   }

    public void exibirFichaTec(){
        System.out.println("Nome Do Filme: " + nome);
        System.out.println("Ano De Lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double pegarMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
