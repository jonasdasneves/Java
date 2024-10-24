import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class VetorTemperatura {
    private double vetor[];
    private double maiorRegistro;
    private double menorRegistro;
    private double tempNegativas[];
    private double temMedia;
    public Scanner input;

    public VetorTemperatura(int tamanho){

        //instanciando o vetor
        System.out.println("Leitura criada! com " + tamanho + " dias");
        vetor = new double[tamanho];
    }

    public void definirTemperaturas() {

        input = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite a temperatura do dia: ", i+1);
            vetor[i] = input.nextDouble();
        }
    }

    public void maiorTemperatura() {
        maiorRegistro = vetor[0];
        menorRegistro = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > maiorRegistro){
                maiorRegistro = vetor[i];
            }
            if (vetor[i] < menorRegistro) {
                menorRegistro = vetor[i];
            }
        }
    }

    public void definirTemperaturasNegativas(){
        int negativas = 0;
        int itemNegativo = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < 0) {
                negativas++;
            }
            }
        tempNegativas = new double[negativas];

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < 0) {
                tempNegativas[itemNegativo] = vetor[i];
                itemNegativo ++;
            }
        }
    }

    public void definirTemperaturamedia(){
        double somaTemperaturas = 0;
        for (int i = 0; i < vetor.length; i++) {
            somaTemperaturas += vetor[i];
        }
        temMedia = (somaTemperaturas/vetor.length);
    }

    public void imprimir() {
        System.out.println("A maior temperatura registrada é "+maiorRegistro+ "°C e a menor temperatura registrada é "+ menorRegistro);
        System.out.println("As temperaturas negativas registradas foram: ");
        for (int i = 0; i < tempNegativas.length; i++) {
            System.out.println(tempNegativas[i] + "°C");
        }
        System.out.printf("A média das temperaturas registradas foi %.2f°C \n",temMedia);
    }

    public int contaDiasPositivos(){
        int diasPositivos = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > 0){
                diasPositivos++;
            }
        }
        return diasPositivos;
    }
}
