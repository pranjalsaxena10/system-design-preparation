package DesignPatterns.Behavioural.StrategyDesignPattern.solution.approach2WithInterface;

public class DuckSimulatorApp {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.fly();

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.fly();

        Duck plasticDuck = new PlasticDuck();
        plasticDuck.display();

        // - In this approach we have taken out fly() method out of Duck class
        // - Added Flyable Interface having method as void fly();
        // - With this approach one can argue that, only subclasses requiring fly functionality needs to implement
        // - but what if we need to change behaviour of fly functionality?
        // - We need to then change in all the subclasses which require this feature. So no code is reused :(
    }
}
