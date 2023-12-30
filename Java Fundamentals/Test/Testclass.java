import java.util.Date;
class Testclass {
   
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
        
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "placeholder for guest greeting return string";
    }

    public String guestGreeting(String name , String dayPeriod) {
        // YOUR CODE HERE
        return "Good evening," + name + "," + "Lovely to see you" + dayPeriod;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "placeholder for date announcement return string " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        
        boolean Alexis = false;
        boolean Alfred = true;

        if(Alexis){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";

        }
        else if(Alfred){
            return "At your service. As you wish, naturally.";

        }
        else{
            return "Right. And with that I shall retire";
        }

        // return "for snarky response return string";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}


   


