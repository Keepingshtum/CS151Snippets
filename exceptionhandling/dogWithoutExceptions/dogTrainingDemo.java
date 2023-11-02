package exceptionhandling.dogWithoutExceptions;


public class dogTrainingDemo {

    public static Dog trainDog (Dog traineeDog) {
        traineeDog.setCanShakeHands(true);
        return traineeDog;
    }

    public static Dog lessDefensiveTrainDog (Dog traineeDog) {
        if(traineeDog != null) {
            traineeDog.setCanShakeHands(true);
            return traineeDog;
        }
        //Postcondition Violation - Precondition not satisfied
        return null;
    }


    public static Dog defensiveTrainDog (Dog traineeDog) {
        if(traineeDog != null) {
            traineeDog.setCanShakeHands(true);
            return traineeDog;
        }
        else {
            System.out.println("Trainee Dog was not initialized!");
        }
        //Postcondition Violation - Precondition not satisfied
        return null;
    }

    public static void main(String[] args){
        Dog newDog = new Dog("Scruffy", 1);
        System.out.println(newDog);
        Dog trainedDog = trainDog(newDog);
        System.out.println(trainedDog);

        //Precondition violation - postcondtions will not hold
//        trainDog(null);

        //What if we don't print any error messages when things go wrong?
        Dog someOtherTrainedDog = lessDefensiveTrainDog(null);
        System.out.println(someOtherTrainedDog);

//        //We can use defensive programming to avoid halting our program!
//        Dog otherTrainedDog = defensiveTrainDog(null);
//        System.out.println(otherTrainedDog);
    }

}

