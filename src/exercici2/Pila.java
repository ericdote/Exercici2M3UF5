package exercici2;

import java.lang.reflect.Array;

public class Pila<T> implements IPila<T> {

    private Node node = null;
    private int mida = 0;

    @Override
    public void afegir(T t) {
        node = new Node(node, t);
        mida++;
    }

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

    @Override
    public void buidar() {
        node = null;
        mida = 0;
    }

    @Override
    public int mida() {
        return mida;    
    }

    @Override
    public T[] toArray(Class<T> t) {
        T[] llista = (T[]) Array.newInstance(t, mida);
        int x = mida; 
        Node aux = node;        
        while(aux != null){
            llista[--x] = (T) aux.t;
            aux = aux.pare;
        }
        return llista;
    }

    private class Node<T> {
        Node pare;
        T t;

        private Node(Node node, T t) {
                this.pare = node;
                this.t = t;
        }        
    }
}
