package midterm;


/**
 *  This code is for question 17 of the midterm.
 */

class Myclass {
    static int a = 20;
    static int b = 30;
    static int c = 40;

    Myclass() {
        a = 200;
    }

    static void m1() {
        b = 100;
    }

    static {
        c = 400;
    }

    public static void main(String[] args) {
        Myclass m1 = new Myclass();
        m1.m1();
        Myclass m2 = new Myclass();
        System.out.println(m2.a + m2.b + m2.c);
    }
}