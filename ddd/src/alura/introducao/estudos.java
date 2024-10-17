package ddd.src.alura;

import java.util.Scanner;

public class estudos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String note = "";

        while (true) {
            System.out.println("Faça suas anotações! ");
            String anotacao = input.next();
            note = anotacao + note;
            System.out.println(note);
        }
    }
}
