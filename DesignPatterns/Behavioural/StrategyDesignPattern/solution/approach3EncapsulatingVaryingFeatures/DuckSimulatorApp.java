package DesignPatterns.Behavioural.StrategyDesignPattern.solution.approach3EncapsulatingVaryingFeatures;

public class DuckSimulatorApp {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.setFlyingBehaviour(new FlyingWithWings());
        mallardDuck.performFly();

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.setFlyingBehaviour(new FlyingWithWings());
        redHeadDuck.performFly();

        Duck plasticDuck = new PlasticDuck();
        plasticDuck.performFly();

        // - In this approach we have encapsulated varying behaviours of sub-classes viz. FlyingBehaviour as an Interface
        // - There could be various unique implementations of FlyingBehaviour such as FlyingWithWings, NoFly etc
        // - If any new flying behaviour requirement comes up then we can just add separate interface implementation
        // - without changing individual sub-classes implementations
        // - Also added FlyingBehaviour as a member of Duck class (denoting has-a relationship)
        // - Duck class is now not aware of any varying FlyingBehaviour
        // - added performFly() method in Duck class, which in-turn calls fly() of individual FlyingBehaviour implementation
        // - added setter for flyingBehaviour in Duck class so that, flyingBehaviour can be changed at runtime
        // - and not just bound with constructor initialization
    }
}
