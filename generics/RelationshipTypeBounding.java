package generics;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "'}";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                '}';
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                '}';
    }
}

class Pet<T extends Animal> {
    private T pet;

    public Pet(T pet) {
        this.pet = pet;
    }

    public T getPet() {
        return pet;
    }

    @Override
    public String toString() {
        return "PetContainer{" +
                "pet=" + pet +
                '}';
    }
}

// Generic method to copy contents from a List<U> to a List<T>
class ListCopy {
    public static <T extends U, U> void copyContents(List<T> destList, List<U> sourceList) {
        destList.addAll((Collection<? extends T>) sourceList);
    }
}



public class RelationshipTypeBounding {
    public static void main(String[] args) {
        Pet<Cat> cat = new Pet<>(new Cat("Whiskers"));
        System.out.println("Cat Container: " + cat);

        // Create a PetContainer with a Dog
        Pet<Dog> dog = new Pet<>(new Dog("Buddy"));
        System.out.println("Dog Container: " + dog);

        // Uncommenting the line below would result in a compilation error
//         Pet<String> stringContainer = new Pet<>("Not a pet");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<Number> numberList = new ArrayList<>();
        numberList.add(4.0);
        numberList.add(5.0);
        numberList.add(6.0);

        ListCopy.copyContents(integerList, numberList);
        System.out.println("Updated Integer List: " + integerList);

        // Uncommenting the line below would result in a compilation error
        // ListCopy.copyContents(numberList, integerList);
    }
}
