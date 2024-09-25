package condicionais;

import java.util.Scanner;

public class CalculadoraSimples {

    public double entradaDados(){
        System.out.println("*_* Entradad de dados *-*");
        Scanner input = new Scanner(System.in);
        System.out.println("Número: ");
        double num = input.nextDouble();
        return num;
    }

    public int menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("*_* Menu *_*");
        System.out.println("1-Adição");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");
        int op = input.nextInt();
        return op;
    }

    public double adicao(double n1, double n2){
        System.out.println("*_* Adição *_*");
        return n1+n2;
    }

    public double subtracao(double n1, double n2){
        System.out.println("*_* Subtração *_*");
        return n1-n2;
    }

    public double multiplicacao(double n1, double n2){
        System.out.println("*_* Multiplicação *_*");
        return n1*n2;
    }

    public double divisao(double n1, double n2){
        System.out.println("*_* Divisão *_*");
        return n1/n2;
    }

    public void imprimir(double resultado) {
        System.out.println("*_* Imprimir *_*");
        System.out.println("Resultado: "+resultado);
    }

    public double controlador(double n1, double n2, int op) {
        System.out.println("*_* Controlador *_*");
        double result = 0;
        switch (op){
            case 1:
                result = adicao(n1,n2);
                break;
            case 2:
                result = subtracao(n1,n2);
                break;
            case 3:
                result = multiplicacao(n1,n2);
                break;
            case 4:
                result = divisao(n1,n2);
                break;
            default:
                System.out.println("Digite um valor válido");
        }
        return result;
    }
}
