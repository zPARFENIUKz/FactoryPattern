package Pizza;


public abstract class Pizza {
    public void rollTheDough() {
        // Раскатываем тесто
        System.out.println("Rolling the dough for out pizza");
    }

    public abstract void addStuffing();     // Добавляем начинку

    public void bakeInTheOven() {
        // Запекаем в духовке
        System.out.println("Baking our pizza in the oven");
    }

}
