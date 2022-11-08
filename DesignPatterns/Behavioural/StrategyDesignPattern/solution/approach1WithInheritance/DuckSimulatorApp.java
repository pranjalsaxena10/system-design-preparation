package DesignPatterns.Behavioural.StrategyDesignPattern.solution.approach1WithInheritance;

public class DuckSimulatorApp {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.fly();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.fly();

        Duck plasticDuck = new PlasticDuck();
        plasticDuck.display();
        plasticDuck.fly();
        // So here we added a new sub-class as PlasticDuck which isn't supposed to fly
        // so we need to override fly() method in sub-class, so that it should meet the requirements
        // But wait, for every new sub-class to be added, let's say WoodenDuck, we again need to override
        // fly() method to do nothing which increases Code Duplicacy
        // and if requirements keep on changing it requires every sub-class to be updated for just simple feature addition

        // Thus it makes hard for code to be reused any more...
    }
}
