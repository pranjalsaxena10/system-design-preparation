package DesignPatterns.Behavioural.StrategyDesignPattern.solution.approach1WithInheritance;

public class PlasticDuck extends Duck {
    @Override
    public void display() {
        System.out.println("This is Plastic Duck...");
    }

    @Override
    public void fly() {
        System.out.println("PlasticDuck can't fly");
    }
}
