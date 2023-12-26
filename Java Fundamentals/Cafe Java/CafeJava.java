public class CafeJava{
    public static void main(String[] args){
        
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
       
        double mochaPrice = 3.5;
        double coffee = 2.5;
        double latte = 4;
        double cappuccino = 3;

       
    
       
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        
    
        
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
      
        // System.out.println(generalGreeting + customer1); 
        // System.out.println(pendingMessage + customer1);

        // if(isReadyOrder4){
        //      System.out.println(readyMessage + customer4);
        //      System.out.println(displayTotalMessage + cappuccino);
        // }

        // else{
        //      System.out.println(pendingMessage);

        // }

        //  System.out.println(displayTotalMessage + (2 * latte) + customer2);
        //  if(isReadyOrder2){
        //      System.out.println(readyMessage);
        //  }

        //  else{
        //      System.out.println(pendingMessage);
        //  }

         System.out.println(displayTotalMessage + (latte - coffee) + customer3);

    }
}

