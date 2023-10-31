package solidprinciples.examples.initial;


public class Project {
    private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();


    void implement() {
        backEndDeveloper.writeJava();
        frontEndDeveloper.writeCode();
    }

    public static void main (String[] args){
        Project project = new Project();
        project.implement();
    }
}
