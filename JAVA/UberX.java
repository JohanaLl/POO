package JAVA;

public class UberX extends Car{
    
    String brand;
    String model;

    public UberX(String license, Driver driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    //Polimorfismo
    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Model: " + brand + " Brand: " + brand );

    }
}
