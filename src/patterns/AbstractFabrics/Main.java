package patterns.AbstractFabrics;

public class Main {
    public static void main(String[] args) {
        CarsFactory factory = new ToyotaFactory();
factory.createCoupe();
factory.createSedan();
    }
}