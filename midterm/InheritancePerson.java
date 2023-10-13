package midterm;


public class InheritancePerson {
    private String name;

    public InheritancePerson(String n) {
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

//Un

class InheritanceStudent extends InheritancePerson {

    public InheritanceStudent() {
        //This is one way to fix the code. can you think of a better way to fix it?
        super("");
        this.setName("Student");
    }
}