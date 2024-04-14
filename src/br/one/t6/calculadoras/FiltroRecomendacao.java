package br.one.t6.calculadoras;

public class FiltroRecomendacao {

    public void filtrar(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("O Titulo Está Bombando no momento!!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("O Titulo está caindo no gosto da Galera!!");
        } else {
            System.out.println("Adicione a Sua lista Parar Avaliar!!");
        }
    }
}
