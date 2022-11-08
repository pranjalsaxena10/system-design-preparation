package DesignPatterns.Behavioural.StrategyDesignPattern.solution.approach3EncapsulatingVaryingFeatures;

public class NoFly implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("This Duck can't fly");
    }
}
