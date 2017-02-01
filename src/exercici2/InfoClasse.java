package exercici2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.lang.model.element.Element;

public class InfoClasse<T> {

    private Class<T> t1;

    public InfoClasse(Class<T> t1) {
        this.t1 = t1;
    }   

    public InfoClasse() {
    }

    public String getNomSuperClass() {
        return t1.getClass().getSuperclass().getSimpleName();
    }

    public String getNomClassComplet() {
        return t1.getClass().getName();
    }

    public String getOnlyNomClass() {
        return t1.getClass().getSimpleName();
    }

    public Field[] getArrayAttr() {
        return t1.getClass().getDeclaredFields();
    }

    public Method[] getArrayMet() {
        return t1.getClass().getDeclaredMethods();
    }

    public String[] getArrayNomAttr() {
        String[] nomAtributs = new String[getArrayAttr().length];
        Field[] att = getArrayAttr();
        for (int i = 0; i < nomAtributs.length; i++) {
            nomAtributs[i] = att[i].getName();
        }
        return nomAtributs;
    }

    public String[] getArrayNomMet() {
        String[] nomMetodes = new String[getArrayMet().length];
        Method[] att = getArrayMet();
        for (int i = 0; i < nomMetodes.length; i++) {
            nomMetodes[i] = att[i].getName();
        }
        return nomMetodes;
    }

    public T getInstanciaGenerica() throws InstantiationException, IllegalAccessException {
        return (T) t1.getClass().newInstance();
    }
    
    @Override
    public T clone() throws CloneNotSupportedException{
        //TODO
        return null;
    }

}
