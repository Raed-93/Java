public class Testjava {
    private int numberOfWheels;
    private String color;

    public Testjava() {
        this(20, "John Doe");
    }
    
    public Testjava(int numberOfWheels, String color) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
      
    }

  

    // Getter for numberOfWheels
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // Setter for numberOfWheels
    public void setNumberOfWheels(int number) {
        this.numberOfWheels = number;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }
}
