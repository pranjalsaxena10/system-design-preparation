package DesignPatterns.Behavioural.StrategyDesignPattern.solution.approach3EncapsulatingVaryingFeatures;

public class FlyingWithWings implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("Duck is Flying with wings");
    }
}
