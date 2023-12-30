import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
        
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "placeholder for guest greeting return string";
    }

    public String guestGreeting(String name , String dayPeriod) {
       
        return String.format("Good %s %s. Lovely to see you.",name, dayPeriod);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("placeholder for date announcement return string %s." ,date);
    }
    
    public String respondBeforeAlexis(String conversation) {

        if(conversation.indexOf("Alexis") > -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";

        }
        if(conversation.indexOf("Alfred") > -1){
            return "At your service. As you wish, naturally.";

        }
       

        return "for snarky response return string";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
    
	
}

