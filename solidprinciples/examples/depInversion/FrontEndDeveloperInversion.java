package solidprinciples.examples.depInversion;

public class FrontEndDeveloperInversion implements DeveloperInversion{
    @Override
    public void writeCode() {
        System.out.println("GUI written via JavaFX!");
    }
}
