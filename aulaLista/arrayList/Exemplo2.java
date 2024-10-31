package aulaLista.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exemplo2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(20);
        numeros.add(10);
        numeros.add(-2);
        numeros.add(5);
        numeros.add(50);

        System.out.println(numeros);

        for(Integer numero : numeros){
            if (numero<0)
                System.out.println(numero);
        }

        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
