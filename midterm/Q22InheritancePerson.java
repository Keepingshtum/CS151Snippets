package midterm;


/**
 *  This is the code for Question 22. There are slight differences to avoid duplication in the project,
 *  But the program is the same except for a slight renaming of variables.
 *  The original code that appeared in the paper is at the end of the program.
 */

public class Q22InheritancePerson {
    private String name;

    public Q22InheritancePerson(String n) {
        super();
        this.name = n;
    }

    public void setName(String n) {
        this.name = n;
    }

    public static void main(String[] args) {
        InheritanceStudent s = new InheritanceStudent();
    }
}



class InheritanceStudent extends Q22InheritancePerson {

    public InheritanceStudent() {
        //This is one way to fix the code. can you think of a better way to fix it?
        super("");
        this.setName("Student");
    }
}

// Original Code that appeared in the midterm is below
//public class Person {
//    private String name;
//
//    public Person(String n) {
//        super();
//        this.name = n;
//    }
//
//    public void setName(String n) {
//        this.name = n;
//    }
//
//    public static void main(String[] args) {
//        Student s = new Student();
//    }
//}
//
//class Student extends Person {
//
//    public Student() {
//        this.setName("Student");
//    }
//}