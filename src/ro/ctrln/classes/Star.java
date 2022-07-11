package ro.ctrln.classes;

import java.math.BigDecimal;

public class Star {
    private String StarDiscription; //variabile de instanta(dar sa nu fie tip "static")
    private int diameter; //variabile de instanta(dar sa nu fie tip "static")
    private int satellites; //variabile de instanta(dar sa nu fie tip "static")
    private BigDecimal mass; //variabile de instanta(dar sa nu fie tip "static")
    private String planetNane; //variabile de instanta(dar sa nu fie tip "static")

public static final boolean MIKYWAYSTAR = true; //declararea constantelor in java/se refera la "classa public star"

    public Star(){}
                         //generare constructor din Alt+Insert sau meniul "Code"
    public Star(String starDiscription, int diameter, int satellites, BigDecimal mass) {
        StarDiscription = starDiscription;
        this.diameter = diameter;
        this.satellites = satellites;
        this.mass = mass;
    }
                        //generare get si set din Alt+Insert sau din  meniul

    public String getStarDiscription() {
        return StarDiscription;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getSatellites() {
        return satellites;
    }

    public BigDecimal getMass() {
        return mass;
    }

    public String getPlanetNane() {
        return planetNane; //variabila de instanta
    }

    public void setStarDiscription(String starDiscription) {
        StarDiscription = starDiscription;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setSatellites(int satellites) {
        this.satellites = satellites;
    }

    public void setMass(BigDecimal mass) {
        this.mass = mass;
    }

    public void setPlanetNane(String planetNane) {
        this.planetNane = planetNane; //variabila de instanta
    }

    class smallPlanet{
        private String planetNane;
    }
}
