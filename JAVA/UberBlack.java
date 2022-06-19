package JAVA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class UberBlack extends Car {

    Map<String, HashMap<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Driver driver, 
        Map<String, HashMap<String, Integer>> typeCarAccepted, 
        ArrayList<String> seatsMaterial) { 
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial   = seatsMaterial;
    }
}