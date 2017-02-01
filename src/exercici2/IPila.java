package exercici2;

public interface IPila<T> {
  
    public void afegir(T t);
    
    public T treure();
    
    public void buidar();
    
    public T mida();
    
    public T[] toArray();
    
}
