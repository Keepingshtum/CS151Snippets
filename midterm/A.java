package midterm;


/**
 *  This code is for question 10 of the midterm.
 */

class A {
    int i = 1;
}

class B extends A {
    private int j = 1;

    public void display() {
        System.out.println(j + i);
    }
}

//Note that this class is not "public" , unlike in the question text
// i've done this to keep the code in one program, but the output would be the same even if it was in a different class.
// Try it for yourself if you don't believe me!
class InheritanceTest {
    public static void main(String args[]) {
        B obj = new B();
        obj.display();
    }
}