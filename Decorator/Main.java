// Класс Main для демонстрации работы
public class Main {
    public static void main(String[] args) {
        // Создаем простой кофе
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " стоит: $" + coffee.cost());

        // Добавляем молоко
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " стоит: $" + coffee.cost());

        // Добавляем сахар
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " стоит: $" + coffee.cost());
    }
}