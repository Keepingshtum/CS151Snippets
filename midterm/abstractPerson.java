package midterm;


/**
 *  This is the code for Question 5. There are slight differences to avoid duplication in the project,
 *  But the program is the same except for a slight renaming of variables.
 *  The original code that appeared in the paper is at the end of the program.
 */

abstract class abstractPerson {

    abstract void method1();



    public void method2() {

        System.out.print("Person 2 ");

    }



    public static void main(String[] args) {

        abstractPerson u = new Undergrad();

        u.method1();

    }

}




class midtermStudent extends abstractPerson {

    public void method1() {

        System.out.print("Student 1 ");

        method2();

    }

    public void method2() {

        System.out.print("Student 2 ");

    }

}




class Undergrad extends midtermStudent {

    public void method2() {

        System.out.print("Undergrad 2 ");

    }

}


/**
 * Original Code as it appeared in the midterm is below:
 */


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