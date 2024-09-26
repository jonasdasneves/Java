package ddd.src.aula4;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {

        //criar um scanner
        Scanner input = new Scanner(System.in);

        int num, soma = 0;

        System.out.println("Exercício 1 - Condicionais");

        System.out.println("Número: ");
        num = input.nextInt();

        if(num > 100){
            soma = num + 150;
        }

        System.out.println("Resultado: " + soma);


    }

}
