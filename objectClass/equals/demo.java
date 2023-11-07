package objectClass.equals;

import java.util.Date;

public class demo {

    public static void main (String[] args) {
        SomePerson somePerson = new SomePerson();
        somePerson.setAge(5);
        somePerson.setName("Tom");
        somePerson.setDateofbirth(new Date(1541627679));

        SomePerson someOtherPerson = new SomePerson();
        someOtherPerson.setAge(5);
        someOtherPerson.setName("Tom");
        someOtherPerson.setDateofbirth(new Date(1541627679));

        //What do you think this will output?
        System.out.println(somePerson == someOtherPerson);
        //What do you think this will output?
        System.out.println(somePerson.equals(someOtherPerson));
    }
}
