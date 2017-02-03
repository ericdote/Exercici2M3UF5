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

    public Quadrat(int midaCostat, String nom) {
        super(nom);
        this.midaCostat = midaCostat;
    }

    public double getMidaCostat() {
        return midaCostat;
    }

    public void setMidaCostat(double midaCostat) {
        this.midaCostat = midaCostat;
    }
    
    @Override
    public double area() {
        return Math.pow(midaCostat, 2);
    }

    @Override
    public double perimetre() {
        return 4*midaCostat;
    }

    @Override
    public String toString() {
        return "Quadrat{" + "midaCostat=" + midaCostat + '}';
    }
    
}
