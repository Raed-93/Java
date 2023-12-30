import java.util.ArrayList;
class Test {
    public static void main(String[] args) {
        ArrayList<String> snacks = new ArrayList<String> ();
        snacks.add("Apples");
        snacks.add("Almonds");
        snacks.add("Pretzels");
        snacks.add("Yogurt");
for(int i =0; i < snacks.size(); i++) {
	if(snacks.get(i).charAt(0) == 'A') {
		snacks.remove(i);
        i--;
	}
}
System.out.println(snacks);
// Running this code would produce the following error:
// Exception in thread "main" java.util.ConcurrentModificationException


       }
   
   
    }


