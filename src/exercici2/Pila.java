package exercici2;

import java.lang.reflect.Array;

public class Pila<T> implements IPila<T> {

    private Node node = null;
    private int mida = 0;

    /**
     * Metode que li arriba per parametre un tipos generic i l'afegeix a la pila
     *
     * @param t
     */
    @Override
    public void afegir(T t) {
        node = new Node(node, t);
        mida++;
    }

    /**
     * Metode que treu un tipos generic de la pila i torna el seu valor
     *
     * @return
     */
    @Override
    public T treure() {
        T valor = null;
        if (node != null) {
            valor = (T) node.t;
            node = node.pare;
            mida--;
        }
        return valor;
    }

    /**
     * Metode que buida la pila generica
     */
    @Override
    public void buidar() {
        node = null;
        mida = 0;
    }

    /**
     * Metode que torna la mida de la pila
     *
     * @return
     */
    @Override
    public int mida() {
        return mida;
    }

    /**
     * Metode que li arriba per parametre un tipos generic i el retorna en array
     * generic
     *
     * @param t
     * @return
     */
    @Override
    public T[] toArray(Class<T> t) {
        T[] llista = (T[]) Array.newInstance(t, mida);
        int x = mida;
        Node aux = node;
        while (aux != null) {
            llista[--x] = (T) aux.t;
            aux = aux.pare;
        }
        return llista;
    }

    /**
     * Clase interna Node generica
     *
     * @param <T>
     */
    private class Node<T> {

        Node pare;
        T t;

        /**
         * Constructor de node
         *
         * @param node
         * @param t
         */
        private Node(Node node, T t) {
            this.pare = node;
            this.t = t;
        }
    }
}
