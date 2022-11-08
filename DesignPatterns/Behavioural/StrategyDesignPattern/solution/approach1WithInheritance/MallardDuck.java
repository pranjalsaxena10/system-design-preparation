package DesignPatterns.Behavioural.StrategyDesignPattern.solution.approach1WithInheritance;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("This is Mallard Duck...");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck is flying...");
    }


}
