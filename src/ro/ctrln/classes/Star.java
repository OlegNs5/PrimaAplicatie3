package ro.ctrln.classes;

import java.math.BigDecimal;

public class Star {
    private String StarDiscription;
    private int diameter;
    private int satellites;
    private BigDecimal mass;

    public Star(){}
                                         //acesta este un costructor (obiect)
    public Star(String StarDiscription,int diameter,int satellites,BigDecimal mass){
        this.StarDiscription=StarDiscription;
        this.diameter=diameter;
        this.satellites=satellites;
        this.mass=mass;
    }
                                         //acestea sunt metode "get"
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
                                        //metodele tip 'set'

    public void setStarDiscription(String StarDiscription) {
        this.StarDiscription = StarDiscription;
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
}
