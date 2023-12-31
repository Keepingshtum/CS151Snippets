package midterm;


/**
 *  This code is for question 3 of the midterm.
 *  There are slight differences to avoid duplication in the project,
 *  But the program is the same except for a slight renaming of variables.
 *  The original code that appeared in the paper is at the end of the program.
 */
public class Q3Person {
    private String name;

    public Q3Person(String name) {
        this.name = name;
    }
    public boolean isAsleep(int hr) {
        return 22 < hr || 7 > hr;
    }
    public String toString() {
        return name;
    }
    public void status(int hr) {
        if (this.isAsleep(hr))
            System.out.println("Now offline: " + this);
        else
            System.out.println("Now online: " + this);
    }
    public static void main(String[] args) {
        Q3Person p;
        p = new Student("Sally");
        p.status(1);
    }
}
class Student extends Q3Person {
    public Student(String name) {
        super(name);
    }

    public boolean isAsleep(int hr) // override
    {
        return 2 < hr && 8 > hr;
    }
}

//Original Code:
//public class Person {
//    private String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//    public boolean isAsleep(int hr) {
//        return 22 < hr || 7 > hr;
//    }
//    public String toString() {
//        return name;
//    }
//    public void status(int hr) {
//        if (this.isAsleep(hr))
//            System.out.println("Now offline: " + this);
//        else
//            System.out.println("Now online: " + this);
//    }
//    public static void main(String[] args) {
//        Person p;
//        p = new Student("Sally");
//        p.status(1);
//    }
//}
//class Student extends Person {
//    public Student(String name) {
//        super(name);
//    }
//
//    public boolean isAsleep(int hr) // override
//    {
//        return 2 < hr && 8 > hr;
//    }
//}