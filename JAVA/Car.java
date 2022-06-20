package JAVA;

public class Car {
    //encapsulación
    private Integer id;
    private String lincense;
    private Driver driver;
    //Accesible solo en la clase para poder validar el valor que entra en el parámetro
    private Integer passenger;

    /**El constructor ayuda a definir los parámetros obligatorios */
    public Car(String license, Driver driver) {
        this.lincense = license;
        this.driver = driver; 
        System.out.println("passenger: " + passenger);
    }

    /** Metodo para traer los datos de la clase */
    void printDataCar() {
        if (passenger != null) {
            System.out.println("License: " + lincense + " Name Driver: " + driver.name + " Passengers: " + passenger);
        }
    }

    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        if (passenger == 4) {
            this.passenger = passenger;
        } else {
            System.out.println("Se debe asignar 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLincense() {
        return lincense;
    }

    public void setLincense(String lincense) {
        this.lincense = lincense;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    
}
