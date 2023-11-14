package quizTwo;

import java.util.ArrayList;
import java.util.List;


public class Matchmaker {

    static class User {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private String gender;
        private int age;


        //... Getters for name, gender, and age
    }


    public List<User> findMatches(User user) {
        List<User> matches = new ArrayList<>();
        if(user.getGender() == "Male" && user.getAge() >= 25) {

            // ... Logic to find compatible matches based on user's gender and age
        }
        return matches;


    }

    public static void main(String[] args) {
        Matchmaker matchmaker = new Matchmaker();
        User user = new User();
        user.setGender("Male");
        user.setName("newUser");
        user.setAge(25);
        List<User> potentialMatches = matchmaker.findMatches(null);
        System.out.println("Potential Matches: " + potentialMatches);
    }
}