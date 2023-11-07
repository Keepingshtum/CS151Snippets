package objectClass.clone;

import java.util.Date;
import java.util.Objects;

public class SomePersonWithClone implements Cloneable {
    int age;
    String name;

    Date dateOfBirth;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Date getDateofbirth() {
        return dateOfBirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateOfBirth = dateofbirth;
    }

    //We don't have to check for equality with every single class member, all combinations possible are allowed.
    //Left to reader to check for themselves.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SomePerson that)) return false;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(dateOfBirth, that.dateOfBirth);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        SomePersonWithClone clonedPerson = (SomePersonWithClone) super.clone();
        // Create a new Date object to avoid sharing the same reference
        clonedPerson.dateOfBirth = (Date) this.dateOfBirth.clone();
        return clonedPerson;
    }
}
