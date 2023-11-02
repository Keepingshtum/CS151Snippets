package exceptionhandling.dogWithExceptions;

public class dogTrainingDemo {

    //Notice the usage of "throws"
    public static Dog trainDog (Dog traineeDog) throws DogNotInitializedException {
        if(traineeDog != null) {
            traineeDog.setCanShakeHands(true);
            return traineeDog;
        }
        else {
            //Notice that we don't have to return a value in the else block now!
            throw new DogNotInitializedException("Trainee Dog was not initialized!");
        }
    }

    //We can throw multiple exceptions
    public static Dog stricterTrainDog (Dog traineeDog) throws DogNotInitializedException,IllegalArgumentException {
        if(traineeDog != null) {
            if (traineeDog.getAge() < 0) {
                throw new IllegalArgumentException("Dog age cannot be negative!");
            }
            traineeDog.setCanShakeHands(true);
            return traineeDog;
        }
        else {
            //Notice that we don't have to return a value in the else block now!
            throw new DogNotInitializedException("Trainee Dog was not initialized!");
        }
    }


    public static void main(String[] args){
        Dog newDog = new Dog("Scruffy", 1);
        System.out.println(newDog);

        //Uncommenting this code will fail compilation!
//        Dog trainedDog = trainDog(newDog);
//        System.out.println(trainedDog);

//        trainDog(null);

        //We can call this method by using a try and catch block
        try {
            Dog trainedDog = trainDog(newDog);
            System.out.println(trainedDog);
        }

        catch (DogNotInitializedException e) {
            System.out.println("Exception Caught!");
            System.out.println("Exception message is " + e.getMessage());
            //Why is this highlighted in Intellij as a problem?
            e.printStackTrace();
        }


        try {
            Dog otherTrainedDog = trainDog(null);
            System.out.println(otherTrainedDog);
        }

        //Notice how we can avoid naming the exception we're catching
        //Remember LSP? This is a manifestation of it in practice!
        catch (Exception e) {
            System.out.println("Exception Caught!");
            //Use when you only want to get the message of the exception
            System.out.println("Exception message is " + e.getMessage());
            //Use when you want more details on how this error happened
            e.printStackTrace();
        }

        //Notice that this code is still run, even though we have caught an exception!
        try {
            Dog strictlyTrainedDog = stricterTrainDog(new Dog("Pumpkin",-1));
            System.out.println(strictlyTrainedDog);
        }

        //We can catch different types of exceptions with the same block
        catch (DogNotInitializedException | IllegalArgumentException e) {
            System.out.println("Exception Caught!");
            System.out.println("Exception message is " + e.getMessage());
            e.printStackTrace();
        }

        //Notice that this code is still run, even though we have caught an exception!
        try {
            Dog strictlyTrainedDog2 = stricterTrainDog(null);
            Dog strictlyTrainedDog3 = stricterTrainDog(new Dog("Pumpkin",-1));
            System.out.println(strictlyTrainedDog2 + " " + strictlyTrainedDog3);
        }

        catch (DogNotInitializedException | IllegalArgumentException e) {
            System.out.println("Exception Caught!");
            System.out.println("Exception message is " + e.getMessage());
            e.printStackTrace();
        }

        //Use this block to execute code that should run after the try/catch (usually for cleanup)
        finally {
            System.out.println("The finally block will always run, whether the try block succeeded, or an exception was caught.");
        }

    }

}

