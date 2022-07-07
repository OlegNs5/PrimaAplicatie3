package ro.ctrln.classes;

import java.math.BigDecimal;

public class Star {
    private String StarDiscription;
    private int diameter;
    private int satellites;
    private BigDecimal mass;

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

    public void setStarDiscription(String StarDiscription) {
        this.StarDiscription = StarDiscription;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getSatellites() {
        return satellites;
    }

    public void setSatellites(int satellites) {
        this.satellites = satellites;
    }

    public BigDecimal getMass() {
        return mass;
    }

    public void setMass(BigDecimal mass) {
        this.mass = mass;
    }
}
