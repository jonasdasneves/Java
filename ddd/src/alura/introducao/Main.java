package alura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match");
        System.out.println("Filme: That time i got reincarned as an airfryer");

        int anoDeLancamento = 2020;
        System.out.println("Ano de lanamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDofilme = 8.1;
        String tipoPlano = "gold";

        double media = 0;
        for(int i = 0; i<10; i++){
            Scanner input = new Scanner(System.in);
            double nota = input.nextDouble();
            media+=nota;
        }
        System.out.printf("A nota média do filme é %f",media/10);

        String sinopse = """
                Anime isekai com protagonista genérico n° 4565355
                """;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println("classificação do filme: "+classificacao);

        if (anoDeLancamento>=2020){
            System.out.println("Filme atual que as pessoas estão curtindo!");
        }

        if (incluidoNoPlano==true && tipoPlano.equals("plus")){
            System.out.println("assista agora!");
        }else{
            System.out.println("Assine o plano plus!");
        }

    }
}
