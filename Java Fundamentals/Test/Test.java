// import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
class Test {
    public static void main(String[] args) {
       HashMap <String , String> userMap  = new HashMap <String , String>(); 

       userMap.put("nninja@codingdojo.com", "Nancy Ninja");
       userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
    //    String name = userMap.get("nninja@codingdojo.com");
       Set<String> keys =  userMap.keySet();
       for(String key : keys){
        System.out.println(key);
        System.out.println(userMap.get(key));

       }
   
        }
        
    }


       
   
   
    


