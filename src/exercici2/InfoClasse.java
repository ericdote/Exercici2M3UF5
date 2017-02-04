package exercici2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InfoClasse<T> {

    private Class<T> t1;

    /**
     * Constructor de InfoClasse<T>
     *
     * @param t1
     */
    public InfoClasse(Class<T> t1) {
        this.t1 = t1;
    }

    /**
     * Constructor de sobrecarrega
     */
    public InfoClasse() {
    }

    /**
     * Retorna el nom de la super clase
     *
     * @return
     */
    public String getNomSuperClass() {
        return t1.getClass().getSuperclass().getSimpleName();
    }

    /**
     * Retorna el nom complet de la clase
     *
     * @return
     */
    public String getNomClassComplet() {
        return t1.getClass().getName();
    }

    /**
     * Retorna nomes el nom de la clase
     *
     * @return
     */
    public String getOnlyNomClass() {
        return t1.getClass().getSimpleName();
    }

    /**
     * Retorna un array d'atributs de la clase
     *
     * @return
     */
    public Field[] getArrayAttr() {
        return t1.getClass().getDeclaredFields();
    }

    /**
     * Retorna un array amb els metodes de la clase
     *
     * @return
     */
    public Method[] getArrayMet() {
        return t1.getClass().getDeclaredMethods();
    }

    /**
     * Retorna un array de Strings amb el nom dels atributs
     *
     * @return
     */
    public String[] getArrayNomAttr() {
        String[] nomAtributs = new String[getArrayAttr().length];
        Field[] att = getArrayAttr();
        for (int i = 0; i < nomAtributs.length; i++) {
            nomAtributs[i] = att[i].getName();
        }
        return nomAtributs;
    }

    /**
     * Retorna un array de Strings amb el nom dels metodes
     *
     * @return
     */
    public String[] getArrayNomMet() {
        String[] nomMetodes = new String[getArrayMet().length];
        Method[] att = getArrayMet();
        for (int i = 0; i < nomMetodes.length; i++) {
            nomMetodes[i] = att[i].getName();
        }
        return nomMetodes;
    }

    /**
     * Retorna una instancia generica
     *
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public T getInstanciaGenerica() throws InstantiationException, IllegalAccessException {
        return (T) t1.getClass().newInstance();
    }

    /**
     * Retorna un objecte clonat
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
