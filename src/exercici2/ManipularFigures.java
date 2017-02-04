package exercici2;

import java.util.Arrays;

public class ManipularFigures {

    /**
     * Metode que li arriba per perimetre una pila de figures i retorna la mitja
     * dels seus perimetres
     *
     * @param figura
     * @return
     */
    public double mitjanaPerimetres(Pila<Figura> figura) {
        double mitjana = 0;
        for (Figura i : figura.toArray(Figura.class)) {
            mitjana += i.perimetre();
        }
        return mitjana / figura.mida();
    }

    /**
     * Metode que li arriba un array generic i el torna ordenat
     *
     * @param <T>
     * @param t
     * @return
     */
    public <T> T[] arrayOrdenat(T[] t) {
        Arrays.sort(t);
        return t;
    }

}
