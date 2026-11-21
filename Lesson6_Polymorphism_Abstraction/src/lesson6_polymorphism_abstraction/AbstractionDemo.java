 
package lesson6_polymorphism_abstraction;

 
public class AbstractionDemo {

    public static void main(String[] args) {

        FloodResponse flood = new FloodResponse();
        FireResponse fire = new FireResponse();

        System.out.println("COMMUNITY DISASTER PREPAREDNESS");
        System.out.println();

        flood.showEmergencyType();
        flood.prepareResponse();

        System.out.println();

        fire.showEmergencyType();
        fire.prepareResponse();
    }
}

abstract class EmergencyResponse {

    abstract void prepareResponse();

    void showEmergencyType() {
        System.out.println("Preparing for an emergency.");
    }
}

class FloodResponse extends EmergencyResponse {

    @Override
    void prepareResponse() {
        System.out.println("Flood Response: Preparing evacuation areas and monitoring water levels.");
    }
}

class FireResponse extends EmergencyResponse {

    @Override
    void prepareResponse() {
        System.out.println("Fire Response: Coordinating evacuation routes and contacting fire responders.");
    }
}


