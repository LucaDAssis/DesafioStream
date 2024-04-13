import br.one.t6.calculadoras.Calculadora;
import br.one.t6.modelos.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setNome("Tubarão");
        myMovie.setAnoDeLancamento(1975);
        myMovie.setDuracaoEmMinutos(124);

        Movie youMovie = new Movie();
        youMovie.setNome("Tubarão 2");
        youMovie.setAnoDeLancamento(1975);
        youMovie.setDuracaoEmMinutos(200);

        Movie ourMovie = new Movie();
        ourMovie.setNome("Tubarão 3");
        ourMovie.setAnoDeLancamento(1998);
        ourMovie.setDuracaoEmMinutos(180);


        myMovie.exibirFichaTec();
        myMovie.avalia(10);
        myMovie.avalia(9);
        myMovie.avalia(7.9);
        System.out.println(myMovie.pegarMedia());
        System.out.println(myMovie.getTotalDeAvaliacoes());

        Calculadora calculadora = new Calculadora();
        calculadora.inclui(myMovie);
        calculadora.inclui(youMovie);
        calculadora.inclui(ourMovie);
        System.out.println(calculadora.getCalculadoraDeTempo());

    }
}