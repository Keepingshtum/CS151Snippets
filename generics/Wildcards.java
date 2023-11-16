package generics;

import java.util.ArrayList;
import java.util.List;

class MenuItem<T> {
    private T item;

    public MenuItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "item=" + item +
                '}';
    }
}

class Food {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Food(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Pizza extends Food {
    public Pizza(String name) {
        super(name);
    }
}

class Sushi extends Food {
    public Sushi(String name) {
        super(name);
    }
}



class FoodDeliveryService {
    // ? extends ... is a "Wildcard" with an upper bound
    public static void printFoodNames(List<? extends Food> foodList) {
        for (Food food : foodList) {
            System.out.println(food.getName());
        }
    }
}

class FoodBasket {
    //? super ... is a Wildcard with a lower bound.
    private List<? super Pizza> items;

    public FoodBasket() {
        this.items = new ArrayList<>();
    }

    // Method to add pizza to the basket
    public void addPizza(Pizza pizza) {
        items.add(pizza);
    }

    // Method to get items from the basket
    public List<? super Pizza> getItems() {
        return items;
    }
}

public class Wildcards {
    public static void main(String[] args) {
        // Using generics with MenuItem
        MenuItem<Food> genericMenuItem = new MenuItem<>(new Food("Generic Food"));
        System.out.println("Generic MenuItem: " + genericMenuItem);

        MenuItem<Pizza> pizzaMenuItem = new MenuItem<>(new Pizza("Margherita Pizza"));
        System.out.println("Pizza MenuItem: " + pizzaMenuItem);

        MenuItem<Sushi> sushiMenuItem = new MenuItem<>(new Sushi("Sashimi Sushi"));
        System.out.println("Sushi MenuItem: " + sushiMenuItem);


        List<Food> foodList = List.of(new Food("Burger"), new Pizza("Pepperoni Pizza"), new Sushi("Nigiri Sushi"));
        List<Pizza> pizzaList = List.of(new Pizza("Margherita Pizza"), new Pizza("Vegetarian Pizza"));

        // Using wildcard to print food names
        FoodDeliveryService.printFoodNames(foodList);
        FoodDeliveryService.printFoodNames(pizzaList);  // Works due to ? extends Food

        FoodBasket pizzaBasket = new FoodBasket();

        // Adding pizzas to the basket
        pizzaBasket.addPizza(new Pizza("Margherita Pizza"));
        pizzaBasket.addPizza(new Pizza("Pepperoni Pizza"));

        // Getting items from the basket
        List<? super Pizza> basketItems = pizzaBasket.getItems();

        // Uncommenting the line below would result in a compilation error
        // Pizza retrievedPizza = basketItems.get(0);

        // However, you can safely add another Pizza to the basket
        pizzaBasket.addPizza(new Pizza("Vegetarian Pizza"));

        System.out.println("Items in the pizza basket: " + basketItems);
    }
}