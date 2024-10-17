package alura;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double avaliacao = 0;
        double media = 0;
        for(int i=0; i < 3 ; i++){

            System.out.println("sua nota para o filme: ");
            avaliacao = input.nextDouble();
            media = media+avaliacao;
        }
        media = media/3;
        System.out.printf("A média desse filme é %f",media);
    }

}
