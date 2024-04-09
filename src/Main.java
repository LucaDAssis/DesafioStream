public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.nome = "Tubarão";
        myMovie.anoDeLancamento = 1975;
        myMovie.duracaoEmMinutos = 124;

        myMovie.exibirFichaTec();
        myMovie.avalia(10);
        myMovie.avalia(9);
        myMovie.avalia(7.9);
        System.out.println(myMovie.somaDasAvaliacoes);
        System.out.println(myMovie.totalDeAvaliacao);
        System.out.println(myMovie.pegarMedia());
    }
}