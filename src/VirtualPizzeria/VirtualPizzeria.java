package VirtualPizzeria;

import Pizza.Pizza;
import Pizza.PizzaFactory.PizzaFactory;
import Pizza.PizzaType.PizzaType;

public class VirtualPizzeria {
    private final PizzaFactory factory;

    public VirtualPizzeria(PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza getPizza(PizzaType type) {
        Pizza pizza = factory.createPizza(type);

        pizza.rollTheDough();
        pizza.addStuffing();
        pizza.bakeInTheOven();

        System.out.println("Pizza is ready :)");
        return pizza;
    }
}
