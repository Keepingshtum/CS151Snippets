package objectClass.clone;

import java.util.Date;

public class demo {

    public static void main (String[] args) {
        SomePerson somePerson = new SomePerson();
        somePerson.setAge(5);
        somePerson.setName("Tom");
        somePerson.setDateOfBirth(new Date(1541627679));

        SomePerson newPerson = somePerson;

        System.out.println(somePerson);
        System.out.println(newPerson);

        System.out.println(somePerson.getName());
        System.out.println(newPerson.getName());

        somePerson.setName("NotTom");
        System.out.println(somePerson.getName());
        System.out.println(newPerson.getName());


        SomePersonWithClone somePersonWithClone = new SomePersonWithClone();
        somePersonWithClone.setAge(5);
        somePersonWithClone.setName("Tom");
        somePersonWithClone.setDateofbirth(new Date(1541627679));

        try {
            SomePersonWithClone newPersonWithClone = (SomePersonWithClone) somePersonWithClone.clone();
            System.out.println(somePersonWithClone.getName());
            System.out.println(newPersonWithClone.getName());
        }
        catch (Exception e) {
            System.out.println("Whoops!");
            e.printStackTrace();
        }

        //Things can go wrong in multiple ways...
        //What happens if you don't implement cloneable?

        try {
            SomePerson newPersonWithClone = (SomePerson) somePersonWithClone.clone();
            System.out.println(somePersonWithClone.getName());
            System.out.println(newPersonWithClone.getName());
        }
        catch (Exception e) {
            System.out.println("Whoops!");
            e.printStackTrace();
        }

    }
}
