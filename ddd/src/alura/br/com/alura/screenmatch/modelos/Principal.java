package alura.br.com.alura.screenmatch.modelos;

import alura.br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import alura.br.com.alura.screenmatch.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão");
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.setAnoDelançamento(1988);
        System.out.println(meuFilme.getDuracaoEmMinutos());

        Filme filmeDoPaulo = new Filme("Dogville");
        filmeDoPaulo.setDuracaoEmMinutos(150);
        filmeDoPaulo.setAnoDelançamento(1988);

        Filme outroFilme = new Filme("Jujutsu Kaisen 0");
        outroFilme.setDuracaoEmMinutos(100);
        outroFilme.setAnoDelançamento(2022);

        ArrayList<Filme> filmes = new ArrayList<Filme>();

        filmes.add(meuFilme);
        filmes.add(filmeDoPaulo);
        filmes.add(outroFilme);

        System.out.println(filmes);
        System.out.println(filmes.get(2).toString());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDelançamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(12);
        lost.setMinutosPorEpisodio(45);
        System.out.println("Minutos para maratonar lost: "+lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
