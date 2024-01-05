import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<>();
    }

    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();

    }
// #######
    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name = name;
    }
// #######
    public boolean getready(){
        return ready;
    }

    public void setready(boolean ready){
        this.ready = ready;
    }
    // #####
    public ArrayList<Item> getitems(){
        return items;
    }

    public void setitems(ArrayList<Item> items){
        this.items = items;
    }
// methods
public void addItem (Item item){
    items.add(item);

}

public String getStatusMessage(){
    if (ready) {
     return "Your order is ready";   
    } 
        return "Thank you for waiting. Your order will be ready soon.";

}

 public double getOrderTotal(){
        double total = 0;
        for(Item item : items){
            total += item.getprice();
        }
        return total;
    }
public void display (){
    System.out.println("Costemer: " + this.name);
     for(Item item : items){
           System.out.println(item.getname() + "$" + item.getprice());
        }
        System.out.println("Total: " + getOrderTotal());
      

    }

        
    }




    

