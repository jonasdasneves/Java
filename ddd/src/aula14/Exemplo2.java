package aula14;

import java.util.Scanner;

public class Exemplo2 {

    //Atributo de classe
    private int[] vetor;
    public Scanner input;

    //Construtor
    public Exemplo2(int tamanho){

        //instanciando o vetor
        System.out.println("Vetor criado! com " + tamanho + " elementos");
        vetor = new int[tamanho];
    }

    public void popularVetor(){
        //Instanceando um Scanner
        input = new Scanner(System.in);
        for(int i = 0; i<vetor.length; i++){
            System.out.printf("vetor[%d]: ", i);
            vetor[i] = input.nextInt();
        }
    }

    public void imprimir(){
        System.out.println("Imprimindo vetor...");
        for(int i = 0; i<vetor.length; i++){
            System.out.printf("Vetor[%d]: %d \n", i , vetor[i]);
        }
    }

}
