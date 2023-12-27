public class Test{
    public static void main(String[] args){

        Testclass greeterApp = new Testclass();
 
    	// Use the variable to access Greetings methods
    	// using dot notation.
    
        String dateMessage = greeterApp.getCurrentDate();
        
        String raed = greeterApp.greetEnglish("raed");
        String spain = greeterApp.greetSpanish("ahmad");

        System.out.println(raed);
        System.out.println(spain);

        System.out.println(dateMessage);

    }
}