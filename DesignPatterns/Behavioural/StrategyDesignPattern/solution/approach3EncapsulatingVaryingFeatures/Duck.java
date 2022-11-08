package DesignPatterns.Behavioural.StrategyDesignPattern.solution.approach3EncapsulatingVaryingFeatures;

public abstract class Duck {
    FlyingBehaviour flyingBehaviour;

    public void quack() {}
    public void swim() {}
    public abstract void display();
    public void performFly() {
        flyingBehaviour.fly();
    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }
}
