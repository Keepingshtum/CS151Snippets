package midterm;


/**
 *  This is the code for Question 15. There are slight differences to avoid duplication in the project,
 *  But the program is the same except for a slight renaming of variables.
 *  The original code that appeared in the paper is at the end of the program.
 */

class otherA {
    int x = 20;

    public static void main(String[] args) {
        otherA a = new otherB();
        System.out.println(a.x);
    }
}

class otherB extends otherA {
    int x = 30;
}

//Original Code is below
//
//class A {
//    int x = 20;
//
//    public static void main(String[] args) {
//        A a = new B();
//        System.out.println(a.x);
//    }
//}
//
//class B extends A {
//    int x = 30;
//}

