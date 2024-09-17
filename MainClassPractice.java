// dH 9/17/24
// MainClassPractice.java

public class MainClassPractice {
    public static void main(String[] args) {

        System.out.println("\nWelcome to my OOP Class Practice Program!\n");

        // Create a couple Dog objects
        // with an empty arguments ("no args)
        Dog myDog = new Dog();
        Dog anotherDog = new Dog();

        // Create a dog with a String name
        Dog aDog = new Dog("Spot");

        // Output the new Dog object's name.
        System.out.println("\n The new dog's name is: " + aDog.getName());

        // Create a fourth dog with an int age.
        Dog fourthDog = new Dog(33);

        // Output the dog's age.
        System.out.println("\n my new dog's age is: " + fourthDog.getAge());

        // And... finally create a fifth and last dog...
        Dog fifthDog = new Dog("my new dog's name", 7 );

        // Validate it.
        System.out.println(" my last dog's name is " + fifthDog.getName() + " and age is: " + fifthDog.getName() );

        // Give our dog a birthday (add a year to its age)
        fifthDog.setAge(fifthDog.getAge() + 1);
        // Validate it.
        System.out.println("\n My dog, who is named: " + fifthDog.getName() + ", had a birthday and age is now: " + fifthDog.getAge() );







    }
}