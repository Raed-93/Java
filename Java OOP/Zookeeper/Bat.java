public class Bat extends Mammal {
    public void fly(){
        System.out.println("The bat is airbor.");
        energyBat -= 50;
        displayEnergyBat();
    }

    public void eatHumans(){
        System.out.println("The bat's satisfactio.");
        energyBat += 25;
        displayEnergyBat();
    }

    public void attackTown(){
        System.out.println("The bat's attack.");
        energyBat -= 100;
        displayEnergyBat();
    }
    
}
