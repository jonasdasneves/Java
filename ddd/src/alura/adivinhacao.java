package alura;

import java.util.Random;
import java.util.Scanner;

public class adivinhacao {
    public static void main(String[] args) {
        int aleatorio = new Random().nextInt(100);
        Scanner input = new Scanner(System.in);
        int num = -1;

        while (num != aleatorio){
            System.out.println("Adivinhe o número de 0 a 100!");
            num = input.nextInt();
            if(num<aleatorio){
                System.out.println("O número que pensei é maior!");
            }else
            if (num>aleatorio) {
                System.out.println("O número que pensei é menor!");
            }
            else{
                System.out.println("Você acertou! O número que pensei é "+aleatorio);
            }
        }

    }

}
