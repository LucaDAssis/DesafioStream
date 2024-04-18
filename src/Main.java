import br.one.t6.calculadoras.Calculadora;
import br.one.t6.calculadoras.FiltroRecomendacao;
import br.one.t6.modelos.Episodes;
import br.one.t6.modelos.Movie;
import br.one.t6.modelos.Series;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
        ourMovie.avalia(7);

        Series mySerie = new Series();
        mySerie.setNome("lost");
        mySerie.setTemporadas(8);
        mySerie.setEpPorTemporada(10);
        mySerie.setMinutosPorEp(45);
        mySerie.avalia(10);



        myMovie.exibirFichaTec();
        myMovie.avalia(10);
        myMovie.avalia(9);
        myMovie.avalia(7.9);
        System.out.println(myMovie.pegarMedia());
        System.out.println(myMovie.getTotalDeAvaliacoes());

        mySerie.exibirFichaTec();
        System.out.println(mySerie.pegarMedia());
        System.out.println(mySerie.getTotalDeAvaliacoes());

        Calculadora calculadora = new Calculadora();
        calculadora.inclui(myMovie);
        calculadora.inclui(youMovie);
        calculadora.inclui(ourMovie);
        System.out.println(calculadora.getCalculadoraDeTempo());

        Episodes episodes = new Episodes();
        episodes.setNumero(1);
        episodes.setSerie(mySerie);
        episodes.setTotalVisualizacao(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(myMovie);
        filtro.filtrar(youMovie);
        filtro.filtrar(ourMovie);
        filtro.filtrar(episodes);

        ArrayList<Movie> filmes = new ArrayList<>();
        filmes.add(myMovie);
        filmes.add(youMovie);
        filmes.add(ourMovie);
        System.out.println("Primeiro Filme é! " + filmes.get(0).getNome());
        System.out.println("Quantos Filmes Temos na Lista? " + filmes.size());

    }
}