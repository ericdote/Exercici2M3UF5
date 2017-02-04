package exercici2;

import java.util.Arrays;
import java.util.Random;

public class Exercici2 {

    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();

        pila.afegir(1);
        pila.afegir(2);
        pila.afegir(3);
        System.out.println("Treure objecte de pila: " + pila.treure());
        System.out.println("Mida de la pila: " + pila.mida());
        System.out.println("Passar a array la pila: " + Arrays.toString(pila.toArray(Integer.class)));
        System.out.println();
        Pila<Figura> figures = new Pila<>();
        for (int i = 0; i < 10; i++) {
            figures.afegir(new Quadrat(new Random().nextInt(10), "nom " + i));
        }
        ManipularFigures mf = new ManipularFigures();
        System.out.println("Mitjana perimetres");
        System.out.println(mf.mitjanaPerimetres(figures));
        Figura[] figuresArray = figures.toArray(Figura.class);
        System.out.println("Array desordenat: ");
        System.out.println(Arrays.toString(figuresArray));
        mf.arrayOrdenat(figuresArray);
        System.out.println("Array ordenat: ");
        System.out.println(Arrays.toString(figuresArray));
    }

}
