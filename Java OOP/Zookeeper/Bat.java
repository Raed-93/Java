public class Bat extends Mammal {
    public void fly(int energy){
        energy -= 50;
        System.out.println("The bat is airbor. "+ "\r" +   displayEnergy(energy));
    }

    public void eatHumans(int energy){
        energy += 25;
        System.out.println("The bat's satisfactio. " +"\r"+ displayEnergy(energy));
    }

    public void attackTown(int energy){
         energy -= 100;
        System.out.println("The bat's attack." +"\r" + displayEnergy(energy));
    }
    
}
