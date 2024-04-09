public class Movie {
    String nome;
    int anoDeLancamento;
    boolean incluindoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacao;
    int duracaoEmMinutos;

    void exibirFichaTec(){
        System.out.println("Nome Do Filme: " + nome);
        System.out.println("Ano De Lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    double pegarMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
