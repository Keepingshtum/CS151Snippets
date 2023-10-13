package midterm;


/**
 *
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

