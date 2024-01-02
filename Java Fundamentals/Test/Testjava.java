public class Testjava {

    private int age;
    private String name;
    private static int numberOfPeople = 0;
    public Testjava(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfPeople++;
    }
    public static void peopleCount() {
        System.out.println(numberOfPeople);
    }
}
