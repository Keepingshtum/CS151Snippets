package programmingContracts;

public class Dog {
    private String name;
    private int age;

    private boolean canShakeHands;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.canShakeHands = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCanShakeHands() {
        return canShakeHands;
    }

    public void setCanShakeHands(boolean canShakeHands) {
        this.canShakeHands = canShakeHands;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", canShakeHands=" + canShakeHands +
                '}';
    }
}
