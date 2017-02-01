package exercici2;

import java.util.ArrayList;

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
            valor = node.t;
            node = node.pare;       
            mida--;
        } 
        return valor;
    }

   

    @Override
    public void buidar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T mida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class Node {
        Node pare;
        T t;

        private Node(Node node, T t) {
                this.pare = node;
                this.t = t;
        }        
    }
}
