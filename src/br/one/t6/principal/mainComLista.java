package br.one.t6.principal;

import br.one.t6.modelos.Movie;
import br.one.t6.modelos.Series;
import br.one.t6.modelos.Title;

import java.awt.color.ColorSpace;
import java.util.ArrayList;
import java.util.Collections;

public class mainComLista {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Tubarão", 1975);
        myMovie.avalia(9);
        Movie youMovie = new Movie("Tubarão 2", 1975);
        youMovie.avalia(8);
        Movie ourMovie = new Movie("Tubarão 3", 1998);
        ourMovie.avalia(7);
        Series mySerie = new Series("Lost", 2000);
        mySerie.avalia(7);

        ArrayList<Title> lista = new ArrayList<>();
        lista.add(myMovie);
        lista.add(youMovie);
        lista.add(ourMovie);
        lista.add(mySerie);
        for (Title item: lista){
            System.out.println(item.getNome());
            if (item instanceof Movie movie)
            System.out.println("Classificação " + movie.getClassificacao());
        }

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam Sendler");
        buscarPorArtista.add("Jackie Chan");
        buscarPorArtista.add("Cris Rock");
        System.out.println(buscarPorArtista);
        Collections.sort(buscarPorArtista);
        System.out.println(buscarPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
    }
}
