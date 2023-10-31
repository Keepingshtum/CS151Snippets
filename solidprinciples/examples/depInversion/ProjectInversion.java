package solidprinciples.examples.depInversion;

import solidprinciples.examples.depInjection.BackEndDeveloperInjection;

public class ProjectInversion {
    private DeveloperInversion developer;

    // Dependency Injection through setter method
    // Remember, DeveloperInversion is an Interface!
    void setDeveloper(DeveloperInversion developer) {
        this.developer = developer;
    }

    void implement() {
        developer.writeCode();
    }

    public static void main (String[] args){
        BackEndDeveloperInversion backEndDeveloper = new BackEndDeveloperInversion();
        ProjectInversion project = new ProjectInversion();
        project.setDeveloper(backEndDeveloper);
        project.implement();

        FrontEndDeveloperInversion frontEndDeveloper = new FrontEndDeveloperInversion();
        project.setDeveloper(frontEndDeveloper);
        project.implement();
    }
}
