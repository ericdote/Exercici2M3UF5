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
public class Quadrat extends Figura{
    
    private double midaCostat;
    /**
     * Constructor de Quadrat
     * @param midaCostat
     * @param nom 
     */
    public Quadrat(int midaCostat, String nom) {
        super(nom);
        this.midaCostat = midaCostat;
    }
    /**
     * Geter per la mida
     * @return 
     */
    public double getMidaCostat() {
        return midaCostat;
    }
    /**
     * Setter per la mida
     * @param midaCostat 
     */
    public void setMidaCostat(double midaCostat) {
        this.midaCostat = midaCostat;
    }
    /**
     * Calcula l'area i la retorna
     * @return 
     */
    @Override
    public double area() {
        return Math.pow(midaCostat, 2);
    }
    /**
     * Calcula el perimetre i el retorna
     * @return 
     */
    @Override
    public double perimetre() {
        return 4*midaCostat;
    }

    @Override
    public String toString() {
        return "Quadrat{" + "midaCostat=" + midaCostat + '}';
    }
    
}
