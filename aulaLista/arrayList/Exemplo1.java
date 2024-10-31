package aulaLista.arrayList;

import java.util.ArrayList;

public class Exemplo1 {
    public static void main(String[] args) {
        //declarando e instaceando uma lista
        ArrayList<String> carros = new ArrayList<String>();

        //adicionar um carro na lista
        carros.add("HB20");
        carros.add("BMW");
        carros.add("Subaru");
        carros.add("Celta");
        carros.add("Corsa");
        carros.add("Fusca");

        //Imprime lista
        System.out.println(carros);

        //Imprime cada elemento da lista
        for(String carro: carros) {
            System.out.println("Carro :"+carro);
        }

        carros.set(0,"Chevete");
        System.out.println(carros);

        //Obtendo o tamanho da lista
        System.out.println("Tamanho: "+carros.size());

        //percorrendo o array com for
        for(int i=0; i < carros.size(); i++){
            System.out.printf("%d - %s \n", i+1, carros.get(i));
        }

        //removendo um item da lista
        carros.remove(0);
        System.out.println(carros);

        //carros.clear();

        //obter o indice de um elemento específico
        System.out.println("Índice: " + carros.indexOf("Fusca"));

        //Verifica se a lista contem um elemento
        System.out.println("Contém: " + carros.contains("BMW"));

        //Operador ternário
        System.out.println("Disponível: " + (carros.contains("Jeep") ?"sim":"não"));


    }
}
