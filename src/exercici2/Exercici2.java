
package exercici2;

import java.util.Arrays;


public class Exercici2 {


    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();
        
        pila.afegir(1);
        pila.afegir(2);
        pila.afegir(3);
        System.out.println(Arrays.toString(pila.toArray(Integer.class)));

    }
    
}
