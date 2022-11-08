package DesignPatterns.Behavioural.StrategyDesignPattern.solution.approach2WithInterface;

public class RedHeadDuck extends Duck implements Flyable {
    @Override
    public void display() {
        System.out.println("This is Redhead Duck...");
    }

    @Override
    public void fly() {
        System.out.println("Redhead Duck is flying");
    }
}
