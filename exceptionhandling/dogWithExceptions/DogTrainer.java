package exceptionhandling.dogWithExceptions;

public class DogTrainer {
    // Method to train a dog and handle the exception
    public void trainAndHandleException(Dog dog) {
        try {
            Dog trainedDog = trainDog(dog);
            System.out.println("Successfully trained: " + trainedDog);
        } catch (DogNotInitializedException error) {
            System.err.println("Error while training the dog: " + error.getMessage());
        }
    }

    // Method to train a dog, potentially throwing an exception
    public Dog trainDog(Dog traineeDog) throws DogNotInitializedException {
        if (traineeDog != null) {
            traineeDog.setCanShakeHands(true);
            return traineeDog;
        } else {
            throw new DogNotInitializedException("Trainee Dog was not initialized!");
        }
    }

    public static void main(String[] args) {
        DogTrainer trainer = new DogTrainer();

        // Example with a properly initialized dog
        Dog buddy = new Dog("Mike", 5);
        trainer.trainAndHandleException(buddy);

        // Example with a null dog
        Dog unknownDog = null;
        trainer.trainAndHandleException(unknownDog);
    }
}
