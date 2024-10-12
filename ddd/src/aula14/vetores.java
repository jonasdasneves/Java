package aula14;

import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tamanho: ");
        int t = input.nextInt();

        //instanciar o tamanho
        int vetor[] = new int[t];

        for(int i=0; i<t; i++){
            System.out.println("Número: ");
            vetor[i] = input.nextInt();
        }
        for(int i=0; i<t; i++){
            System.out.println(vetor[i]);
        }
    }
}
