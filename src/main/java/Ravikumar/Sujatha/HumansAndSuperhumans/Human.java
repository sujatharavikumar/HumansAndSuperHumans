package Ravikumar.Sujatha.HumansAndSuperhumans;

/**
 * Created by sujatharavikumar on 9/15/16.
 */
public class Human {

    private String name;
    private int age;
    private char gender;
    private String occupation;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printName(){
        System.out.println("Name:"+getName() );
    }

    public void printAge(){
        System.out.println("Age:"+getAge() );
    }

    public void printGender(){
        System.out.println("Gender:"+getGender() );
    }

    public void printOccupation(){
        System.out.println("Occupation:"+getOccupation() );
    }

    public void printAddress(){
        System.out.println("Address:"+getAddress() );
    }

}
