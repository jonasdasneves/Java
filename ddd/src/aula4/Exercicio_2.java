package ddd.src.aula4;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Peso ");
        float peso = input.nextFloat();
        System.out.println("altura ");
        float altura = input.nextFloat();

        double massa = (peso / (Math.pow(altura, 2)));

        System.out.printf("Massa corpórea: %.3f\n", massa);

        if (massa < 18.5) {
            System.out.println("Abaixo do Peso!");
        } else if (massa >= 18.5 && massa < 25) {
            System.out.println("Peso ideal!");
        } else if (massa >= 25 && massa < 30) {
            System.out.println("Um pouco acima do peso");
        } else if (massa >= 30 && massa < 35) {
            System.out.println("Obesidade Grau I");
        } else if (massa >= 30 && massa < 35) {
            System.out.println("Obesidade Grau II");
        }else {
            System.out.println("Obesidade Grau III");
        }
    }
}