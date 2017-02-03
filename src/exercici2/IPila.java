package exercici2;

public interface IPila<T> {
    /**
     * Metode que afegeix tipos generic a la pila
     * @param t 
     */
    public void afegir(T t);
    /**
     * Metode que retorna un generic i l'elimina de la pila
     * @return 
     */
    public T treure();
    /**
     * Metode que buida la pila
     */
    public void buidar();
    /**
     * Metode que retorna la mida de la pila
     * @return 
     */
    public int mida();
    /**
     * Metode que converteix una pila generica a un array generic i el torna
     * @param t
     * @return 
     */
    public T[] toArray(Class<T> t);
    
}
