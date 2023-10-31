package solidprinciples.examples.depInversion;

public class BackEndDeveloperInversion implements DeveloperInversion {
    @Override
    public void writeCode() {
        System.out.println("Java code written");
    }
}

