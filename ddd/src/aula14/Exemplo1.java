package aula14;

public class Exemplo1 {
    public static void main(String[] args) {

        //declarando e instanceando um array
        int[] vetor = new int[5];

        //atribuindo valores para o array
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;
        vetor[4] = 5;

        //Acesso à um item do vetor
        System.out.println("Este é o item 4:" + vetor[3]);

        for(int i=0; i<5; i++){
            System.out.printf("Vetor[%d]: %d \n",i,vetor[i]);
        }

    }
}
