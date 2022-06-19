package JAVA;

public class Car {
    Integer id;
    String lincense;
    Driver driver;
    Integer passenger;

    /**El constructor ayuda a definir los parámetros obligatorios */
    public Car(String license, Driver driver) {
        this.lincense = license;
        this.driver = driver; 
    }

    /** Metodo para traer los datos de la clase */
    void printDataCar() {
        System.out.println("License: " + lincense + " Name Driver: " + driver.name);
    }
}
