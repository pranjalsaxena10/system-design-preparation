package DesignPatterns.Behavioural.StrategyDesignPattern.solution.approach1WithInheritance;

public class RedHeadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("This is Redhead Duck...");
    }

    @Override
    public void fly() {
        System.out.println("Redhead is flying...");
    }

}
