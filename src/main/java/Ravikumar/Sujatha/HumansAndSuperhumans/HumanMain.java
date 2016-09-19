package Ravikumar.Sujatha.HumansAndSuperhumans;

/**
 * Created by sujatharavikumar on 9/15/16.
 */
public class HumanMain {

    public static void main(String[] args) {
        Human human = new Human();
        SuperHuman superHuman = new SuperHuman();

        human.setName("Sujatha");
        human.printName();

        superHuman.setHeroName("Superman");
        superHuman.printHeroName();

        //Calling setOccupation() and printOccupation() of the Human class
        superHuman.setOccupation("Helping people");
        superHuman.printOccupation();

        //Calling setAddress() and printAddress() of the Human class
        superHuman.setAddress("Super St, Santa Monica");
        superHuman.printAddress();

        //Calling setAge() and printAge() of the Human class
        superHuman.setAge(27);
        superHuman.printAge();

        //Calling setGender() and printGender() of the Human class
        superHuman.setGender('M');
        superHuman.printGender();
    }

}
