package JAVA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class UberVan extends Car {

    Map<String, HashMap<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    public UberVan(String license, Driver driver) {
        super(license, driver);
    }

    //Polimorfismo
    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("Se debe asignar minimo 4 pasajeros");
        }
    }

}