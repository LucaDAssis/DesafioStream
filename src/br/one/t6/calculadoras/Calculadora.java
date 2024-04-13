package br.one.t6.calculadoras;

import br.one.t6.modelos.Title;

public class Calculadora {
    private int calculadoraDeTempo;

    public int getCalculadoraDeTempo() {
        return calculadoraDeTempo;
    }

    public void inclui(Title title){
        calculadoraDeTempo += title.getDuracaoEmMinutos();
    }
}
