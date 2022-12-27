package Pizza.PizzaFactory;

import Pizza.*;
import Pizza.PizzaType.*;

public class PizzaFactory {
    public Pizza createPizza(PizzaType type) {
        return switch (type) {
            case MEAT -> new MeatPizza();
            case CHEESE -> new CheesePizza();
            case VEGGIE -> new VeggiePizza();
            case PEPPERONI -> new PepperoniPizza();
            case BBQ_CHICKEN -> new BBQChickenPizza();
        };
    }
}
