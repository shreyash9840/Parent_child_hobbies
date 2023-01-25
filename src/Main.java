import Model.Child;
import Model.Hobbies;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Hobbies> list = new ArrayList<Hobbies>();
        Hobbies h1 = new Hobbies("Cricket", 1);
        Hobbies h2 = new Hobbies("Football", 2);
        Hobbies h3 = new Hobbies("basketball", 3);
        list.add(h1);
        list.add(h2);
        list.add(h3);
        Child child1= new Child("Shreyash", list , 12) ;
        child1.getFullname();
        child1.listHobby();
    }
}