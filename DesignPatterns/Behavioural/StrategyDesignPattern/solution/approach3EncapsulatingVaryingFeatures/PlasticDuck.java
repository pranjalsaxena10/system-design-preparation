package DesignPatterns.Behavioural.StrategyDesignPattern.solution.approach3EncapsulatingVaryingFeatures;

public class PlasticDuck extends Duck {

    PlasticDuck() {
        flyingBehaviour = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("This is Plastic Duck...");
    }
}
