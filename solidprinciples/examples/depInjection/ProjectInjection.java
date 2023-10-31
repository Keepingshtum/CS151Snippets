package solidprinciples.examples.depInjection;

import solidprinciples.examples.depInversion.FrontEndDeveloperInversion;

public class ProjectInjection {
    private BackEndDeveloperInjection backEndDeveloperInjection;
    private FrontEndDeveloperInjection frontEndDeveloperInjection;

    // Dependency Injection through constructor
    // Remember, BackEndDeveloperInjection is a concrete class
    ProjectInjection(BackEndDeveloperInjection backEndDeveloperInjection , FrontEndDeveloperInjection frontEndDeveloperInjection) {
        this.backEndDeveloperInjection = backEndDeveloperInjection;
        this.frontEndDeveloperInjection = frontEndDeveloperInjection;
    }

    void implement() {
        backEndDeveloperInjection.writeCode();
        frontEndDeveloperInjection.writeCode();
    }

    public static void main (String[] args){
        BackEndDeveloperInjection backEndDeveloperInjection = new BackEndDeveloperInjection();
        FrontEndDeveloperInjection frontEndDeveloperInjection1 = new FrontEndDeveloperInjection();
        ProjectInjection projectInjection = new ProjectInjection(backEndDeveloperInjection,frontEndDeveloperInjection1);
        projectInjection.implement();
    }
}
