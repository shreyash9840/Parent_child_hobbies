package Model;

import java.util.ArrayList;

public class Child extends Parent{
    String FirstName;
    ArrayList<Hobbies> hobby ;
    int age;

    public Child(String firstName, ArrayList<Hobbies> hobby, int age) {
        FirstName = firstName;
        this.hobby = hobby;
        this.age = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public ArrayList<Hobbies> getHobby() {
        return hobby;
    }

    public void setHobby(ArrayList<Hobbies> hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getFullname() {
        System.out.println("Name-" +this.FirstName+" "+this.family_Name);
    }

    public void listHobby () {
        for (Hobbies s : this.hobby) {
            System.out.println(s.getH_name());
        }
        ;
    }
}