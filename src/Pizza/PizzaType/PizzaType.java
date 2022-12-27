package Pizza.PizzaType;

import Pizza.*;

public enum PizzaType {
    PEPPERONI(PepperoniPizza.class),
    VEGGIE(VeggiePizza.class),
    MEAT(MeatPizza.class),
    CHEESE(CheesePizza.class),
    BBQ_CHICKEN(BBQChickenPizza.class);

    private final Class<? extends Pizza> clazz;

    PizzaType(Class<? extends Pizza> clazz) {
        this.clazz = clazz;
    }

    public Class<? extends Pizza> getClazz() {
        return clazz;
    }
}
