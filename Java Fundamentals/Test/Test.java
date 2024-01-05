import java.util.ArrayList;
public class Test {
    public static void main(String[] args){
        ArrayList<String> snacks = new ArrayList<String> ();
        snacks.add("Apples");
        snacks.add("Almonds");
        snacks.add("Pretzels");
        snacks.add("Yogurt");
        System.out.println(snacks);
        for(int i=0; i<snacks.size(); i++) {
          System.out.println(String.format("i = %d AND snack = %s", i, snacks.get(i))); // new line
          if(snacks.get(i).charAt(i) == 'A') {
            System.out.println(String.format("i = %d AND we are removing %s", i, snacks.get(i)));
            snacks.remove(i);
          }
        }
        System.out.println(snacks);
    }
}


       
   
   
    


