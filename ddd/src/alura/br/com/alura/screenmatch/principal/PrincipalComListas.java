package alura.br.com.alura.screenmatch.principal;

import alura.br.com.alura.screenmatch.modelos.Filme;
import alura.br.com.alura.screenmatch.modelos.Serie;
import alura.br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1988);

        Filme filmeDoPaulo = new Filme("Dogville", 1988);

        Filme outroFilme = new Filme("Jujutsu Kaisen 0", 2022);

        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> lista = new ArrayList<Titulo>();

        lista.add(meuFilme);
        lista.add(filmeDoPaulo);
        lista.add(outroFilme);
        lista.add(lost);

        for(Titulo item : lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }


    }
}
