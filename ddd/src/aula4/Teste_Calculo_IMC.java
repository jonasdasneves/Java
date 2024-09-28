package ddd.src.aula4;

import java.util.Scanner;

public class Teste_Calculo_IMC {

    public static void main(String[] args) {

        Calculo_IMC imc = new Calculo_IMC(100, 1.7f);

        double massa = imc.calularIMC();
        imc.mostrarDados(massa);

        System.out.println("======================================================");

        //criando um objeto de scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Peso ");
        float peso = input.nextFloat();

        System.out.println("Altura ");
        float altura = input.nextFloat();

        imc.setPeso(peso);
        imc.setAltura(altura);
        massa = imc.calularIMC();
        imc.mostrarDados(massa);
    }


}
