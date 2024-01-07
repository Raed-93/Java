/**
 * Mammal
 */
public class Mammal {

    private int energy = 100;
    protected int energyBat = 300;

    public int getDisplayEnergy(){
        return energy;
    }
     public void setDisplayEnergy(int energy){
        this.energy = energy;
     }

    public void displayEnergyBat(){
        System.out.println("Energy Bat: " + energyBat);
    }
}