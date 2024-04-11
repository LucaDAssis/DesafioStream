import br.one.t6.modelos.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setNome("Tubarão");
        myMovie.setAnoDeLancamento(1975);
        myMovie.setDuracaoEmMinutos(124);

        myMovie.exibirFichaTec();
        myMovie.avalia(10);
        myMovie.avalia(9);
        myMovie.avalia(7.9);
        System.out.println(myMovie.pegarMedia());
        System.out.println(myMovie.getTotalDeAvaliacoes());
    }
}