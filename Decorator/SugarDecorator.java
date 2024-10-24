class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", сахар";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.20; // Добавляем стоимость сахара
    }
}