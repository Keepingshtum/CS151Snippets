package exceptionhandling.dogWithExceptions;

class DogNotInitializedException extends Exception {
    public DogNotInitializedException(String message) {
        super(message);
    }
}