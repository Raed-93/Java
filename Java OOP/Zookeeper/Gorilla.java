public class Gorilla extends Mammal{
    public void throwSomething(){
        System.out.println("Gorilla has thrown something. ");
         energy -= 5;
         displayEnergy();
    }  

    public void eatBananas(){
        energy += 10 ;
        System.out.println("The gorilla's satisfaction. ");
        displayEnergy();
    }

    public void climb(){
        energy -= 10;
        System.out.println("Gorilla has climbed a tree. ");
        displayEnergy();
    }


}
