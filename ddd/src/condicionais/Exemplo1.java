package condicionais;

import java.io.InputStream;
import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char conceito = ' ';

        System.out.println("Digite a nota da primeira materia");
        float num1 = input.nextFloat();
        System.out.println("Digite a nota da segunda materia");
        float num2 = input.nextFloat();
        System.out.println("Digite a nota da terceira materia");
        float num3 = input.nextFloat();

        float media = ((num1 + num2 + num3)/3);

        if(media < 6){
            conceito = 'E';
        }else if(media < 7){
            conceito = 'D';
        }else if (media < 8){
            conceito = 'C';
        }else if (media < 9){
            conceito = 'B';
        }else {
            conceito = 'A';
        }

        switch (conceito){

            case 'A':
                System.out.println("Conceito " + conceito);
                break;

            case 'B':
                System.out.println("Conceito " + conceito);
                break;

            case 'C':
                System.out.println("Conceito " + conceito);
                break;

            case 'D':
                System.out.println("Conceito " + conceito);
                break;

            case 'E':
                System.out.println("Conceito " + conceito);
                break;

            default:
                System.out.println("Opção inválida");
        }
    }

}
