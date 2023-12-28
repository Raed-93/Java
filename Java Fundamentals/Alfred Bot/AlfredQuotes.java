import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
       
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
      
     return "placeholder for guest greeting return string";
      
    }

    public String guestGreeting(String name, String Dayperiod ) {
      
     return "Good " + name + " ," + Dayperiod +"Lovely to see you";
      
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

