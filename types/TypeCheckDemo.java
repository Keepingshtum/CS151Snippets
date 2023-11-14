package types;

public class TypeCheckDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Dog animal1 = new Dog();
        Animal animal2 = new Cat();

        // Using instanceof to check if an object is an instance of a class
        if (animal1 instanceof Animal) {
            System.out.println(animal1 instanceof Dog);
            System.out.println("animal1 is an instance of Dog");
            ((Dog) animal1).bark(); // Cast to Dog to access bark() method
        }

        if (animal2 instanceof Cat) {
            System.out.println("animal2 is an instance of Cat");
            ((Cat) animal2).meow(); // Cast to Cat to access meow() method
        }

        //Note the use of the ? symbol - this is a "wildcard" type that is used to denote an unknown type.
        Class<?> dogClass = Dog.class;
        //Requires the throwing of a ClassNotFoundException
        Class<?> catClass = Class.forName("types.Cat");

        System.out.println("dogClass.getName(): " + dogClass.getName());
        System.out.println("catClass.getSimpleName(): " + catClass.getSimpleName());

        // Using getClass() method to get the runtime class of an object
        Class<?> animal1Class = animal1.getClass();
        Class<?> animal2Class = animal2.getClass();

        //Try  placing a breakpoint on the next line, debugging this code, and examine the dogClass and catClass objects.
        System.out.println("animal1Class.getName(): " + animal1Class.getName());
        System.out.println("animal2Class.getSimpleName(): " + animal2Class.getSimpleName());
    }
}
