package ro.ctrln.primitive.Classes;

import java.math.BigDecimal;

public class Star {

    public static void main(String[] args) {


        private String StarDiscription;
        private int diameter;
        private int satellites;
        private BigDecimal mass;
        private String planetNane;


    public Star() {
        }

        //generare constructor din Alt+Insert sau meniul "Code"

    public Star(String starDiscription, int diameter, int satellites, BigDecimal mass, String planetNane){
            StarDiscription = starDiscription;
            this.diameter = diameter;
            this.satellites = satellites;
            this.mass = mass;
            this.planetNane = planetNane;
        }


        //generare get si set din Alt+Insert sau din  meniul
        public String getStarDiscription () {
            return StarDiscription;
        }

        public int getDiameter () {
            return diameter;
        }

        public int getSatellites () {
            return satellites;
        }

        public BigDecimal getMass () {
            return mass;
        }

        public String getPlanetNane () {

            this.planetNane = planetNane; //variabila de instanta
            return "";
        }

        public String computePlanetLocation (smallPlanet Samallplanet,int location){
            String planetLocation = this.StarDiscription + Samallplanet.getplanetNane() + location;
            return planetLocation;
        }


        class smallPlanet {
            private String planetNane;
            // private String marte;

            private String getplanetNane() {
                return this.planetNane;
            }
        }
    }
    }
