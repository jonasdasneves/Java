package alura;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 0;
        int menu = 0;

        while (menu != 4) {

            System.out.println("Olá! em que posso ajudar? \n 1 - Consultar saldo \n 2 - fazer saque \n 3 - depositar \n 4 - Sair");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("seu saldo é de R$"+saldo);
                    break;
                case 2:
                    System.out.println("Quanto você quer sacar?");
                    double saque = input.nextInt();
                    if(saque<=saldo){
                        saldo = saldo-saque;
                        System.out.println("Saque realizado com sucesso");
                    }
                    else{
                        System.out.println("Você não tem saldo para realizar esse saque");
                    }
                    break;

                case 3:
                    System.out.println("Quanto você quer depositar?");
                    double deposito = input.nextInt();
                    saldo = saldo+deposito;
                    System.out.println("Depósito foi realizado com sucesso");
                    break;

                case 4:
                    System.out.println("Obrigado pela preferência. Tenha um ótimo dia");
                    break;

                default:
                    System.out.println("Digite um valor válido");
            }
        }

    }
}
