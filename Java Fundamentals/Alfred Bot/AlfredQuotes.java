import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
       
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String x) {
       return String.format("Hi %s,%s, placeholder for guest greeting return string",name,x);
    //    return "placeholder for guest greeting return string";
      
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "placeholder for date announcement return string" + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        return "for snarky response return string";
    }
    
	
}

