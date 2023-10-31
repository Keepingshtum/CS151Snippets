package programmingContracts;


public class postConditionDemo {


    /**
     * Precondition - traineeDog is not null; is initialized
     * @param traineeDog - The Dog to be "Trained" to shake hands
     * @return "Trained Dog" with "canShakeHands" set to true.
     * Postcondition - traineeDog is not null; all other properties remain unchanged.
     */
    public static Dog trainDog (Dog traineeDog) {
        traineeDog.setCanShakeHands(true);
        return traineeDog;
    }

    public static void main(String[] args){
         Dog newDog = new Dog("Scruffy", 1);
         System.out.println(newDog);
         Dog trainedDog = trainDog(newDog);
         System.out.println(trainedDog);

         //Precondition violation - postcondtions will not hold
//        trainDog(null);

        //We can use defensive programming to avoid halting our program!
        defensiveTrainDog(null);
    }

    /**
     * Precondition - traineeDog is not null; is initialized
     * @param traineeDog - The Dog to be "Trained" to shake hands
     * @return "Trained Dog" with "canShakeHands" set to true.
     * Postcondition - traineeDog is not null; all other properties remain unchanged.
     */
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

}

