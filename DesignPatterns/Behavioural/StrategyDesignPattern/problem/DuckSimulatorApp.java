package DesignPatterns.Behavioural.StrategyDesignPattern.problem;

public class DuckSimulatorApp {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();

    }
}
