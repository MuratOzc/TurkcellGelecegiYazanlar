package methodOverloading;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
        System.out.println(operations.add(2,3));
        System.out.println(operations.add(2,3,5));
    }
}
