package objectClass.equals;

import java.util.Date;
import java.util.Objects;

public class SomePerson {
    int age;
    String name;

    Date dateofbirth;

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
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    //We don't have to check for equality with every single class member, all combinations possible are allowed.
    //Left to reader to check for themselves.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SomePerson that)) return false;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(dateofbirth, that.dateofbirth);
    }
}
