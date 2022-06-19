package JAVA;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Car car = new Car("AMQ123", new Driver("Andres Herrera", "123456"));
        car.printDataCar();

        Car car2 = new Car("QWE567", new Driver("Andrea Herrera", "9876541"));
        car2.printDataCar();

        UberX uberx = new UberX("JHG456", new Driver("Andres Ferrero", "ADD639"), "Chevrolet", "Spark");
        uberx.printDataCar();

        UberPool UberPool = new UberPool("JHG456", new Driver("Andrea Ferrero", "ADD639"), "Dodge", "Attitude");
        UberPool.printDataCar();
    }
}
