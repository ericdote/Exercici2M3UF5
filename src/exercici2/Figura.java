/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici2;

/**
 *
 * @author Eric
 */
public abstract class Figura implements Comparable<Figura> {
    
    private String nom;
    /**
     * Constructor de figura que li arriba el nom
     * @param nom 
     */
    public Figura(String nom) {
        this.nom = nom;
    }
    /**
     * Constructor de sobrecarrega
     */
    public Figura() {
    }
    /**
     * Getter del nom
     * @return 
     */
    public String getNom() {
        return nom;
    }
    /**
     * Setter del nom
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * Metode abstracte que calculará l'area
     * @return 
     */
    public abstract double area();
    /**
     * Metode abstracte que calculará el primetre
     * @return 
     */
    public abstract double perimetre();
    /**
     * Metode que s'utilitza per comparar una Figura actual amb una que li arriba per parametre per retornar un numero i mes tard usarlo
     * Amb el Arrays.sort()
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Figura o) {
        double areaObjecteActual = this.area(), areaObjecteParametre = o.area();
        return areaObjecteActual > areaObjecteParametre? 1 : 
               areaObjecteActual == areaObjecteParametre? 0 : -1 ;
    }

    @Override
    public String toString() {
        return "Figura{" + "nom=" + nom + '}';
    }
    
}
