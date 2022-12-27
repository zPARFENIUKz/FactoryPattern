import Pizza.Pizza;
import Pizza.PizzaFactory.PizzaFactory;
import Pizza.PizzaType.PizzaType;
import VirtualPizzeria.VirtualPizzeria;

public class Main {
    public static void main(String[] args) {
        VirtualPizzeria pizzeria = new VirtualPizzeria(new PizzaFactory());
        for (PizzaType type : PizzaType.values()) {
            checkPizza(type, pizzeria);
        }
    }

    private static void checkPizza(PizzaType type, VirtualPizzeria pizzeria) {
        Pizza pizza = pizzeria.getPizza(type);
        if (type.getClazz().isInstance(pizza)) {
            System.out.println("Test for " + type + " passed!");
        } else {
            System.out.println("Test for " + type + " failed!");
        }
    }


}
