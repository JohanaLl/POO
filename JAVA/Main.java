package JAVA;

public class Main {
    
    public static void main(String[] args) {

        UberX uberx = new UberX("JHG456", new Driver("Andres Ferrero", "ADD639"), "Chevrolet", "Spark");
        uberx.setPassenger(3);
        uberx.printDataCar();

        UberVan ubervan = new UberVan("JHG456", new Driver("Andrea Ferrero", "ADD639"));
        ubervan.setPassenger(6);
        ubervan.printDataCar(); 
    }
}
