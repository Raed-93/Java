public class Gorilla extends Mammal{
    public void throwSomething(int energy){
         energy -= 5;
        System.out.println("Gorilla has thrown something. " + "\r" + displayEnergy(energy));
         
      
    }  

    public void eatBananas(int energy){
        energy += 10 ;
        System.out.println("The gorilla's satisfaction. " + "\r" +  displayEnergy(energy));
       
    }

    public void climb(int energy){
        energy -= 10;
        System.out.println("Gorilla has climbed a tree. " + "\r" +  displayEnergy(energy));
       
    }


}
