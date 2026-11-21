
package lesson6_polymorphism_abstraction;


public class PolymorphismDemo {

    public static void main(String[] args) {

        CarePlan paperPlan = new PaperArtifactCarePlan();
        CarePlan metalPlan = new MetalArtifactCarePlan();

        System.out.println("MUSEUM ARTIFACT PRESERVATION");
        System.out.println();

        paperPlan.performCare();
        metalPlan.performCare();
    }
}

class CarePlan {

    void performCare() {
        System.out.println("Performing general artifact care.");
    }
}

class PaperArtifactCarePlan extends CarePlan {

    @Override
    void performCare() {
        System.out.println("Paper Artifact: Maintaining low humidity to protect historical documents.");
    }
}

class MetalArtifactCarePlan extends CarePlan {

    @Override
    void performCare() {
        System.out.println("Metal Artifact: Applying protective coating to prevent rust.");
    }
}


