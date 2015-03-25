/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListsAndSets.studentsolution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author KRitterbusch
 */
public class Hobbies {

    public static void main(String[] args) {

        List<String> hobbies = new ArrayList<>();//can use ArrayList, LinkedList, etc--all interchangeable 
        hobbies.add("Running");
        hobbies.add("Sleeping");
        hobbies.add("Painting");
        hobbies.add("Tom Foolery");

//        String hobbySelection = hobbies.get(0);
        for (String h : hobbies) {
            System.out.println(h);
        }
        System.out.println("");
        System.out.println("Adding Singing to list");
        hobbies.add(1, "Singing");
        for (String h : hobbies) {
            System.out.println(h);
        }
        System.out.println("");
        System.out.println("Removing Tomfoolery from List");
        System.out.println("(for loop using enhanced for loop)");

//        hobbies.remove("Tom Foolery");//both remove this item--can use name or spot in arraylist, ie 4
        hobbies.remove(4);
        for (String h : hobbies) {
            System.out.println(h);
        }
        System.out.println("");
        System.out.println("(for loop using for loop");
        for (int i = 0; i < hobbies.size(); i++) {
            String s = (String) hobbies.get(i);
            System.out.println(s);
        }
    }
}
