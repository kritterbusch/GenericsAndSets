    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists.with.generics;

import common.Employee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author kritterbusch
 */
public class demo1 {

    public static void main(String[] args) {
////        List<String> beatles = new ArrayList<>();
////        beatles.add("John");
////        beatles.add("Paul");
////        beatles.add("Ringo");
////        
////
////
////        beatles.add(3, "George");
//
////        String favoriteBeatle = beatles.get(3);
////
////        for (String s : beatles) {
////            System.out.println(s);
////        }
//        List<String> hobbies = new LinkedList<>();//can use ArrayList, LinkedList, etc--all interchangeable 
//        hobbies.add("Running");
//        hobbies.add("Sleeping");
//        hobbies.add("Painting");
//        hobbies.add("Tom Foolery");
//
////        String hobbySelection = hobbies.get(0);
//        for (String h : hobbies) {
//            System.out.println(h);
//        }
//        System.out.println("");
//
//        hobbies.add(1, "Singing");
//        for (String h : hobbies) {
//            System.out.println(h);
//        }
//        System.out.println("");
//
////        hobbies.remove("Tom Foolery");//both remove this item--can use name or spot in arraylist
//        hobbies.remove(4);
//        for (String h : hobbies) {
//            System.out.println(h);
//        }
//        System.out.println("");
        //        for(int i=0; i < shoppingList.size(); i++) {
//            String s = (String)shoppingList.get(i);
//            System.out.println(s);
//        }

        List<String> vectorDemo = new Vector<>(50, 5);//legacy class Vector<>(initial capacity, increment)

        List<Employee> employees = new ArrayList<>();//could also use Collection instead of List, but it's too generic--can't call getter method like with lists
        employees.add(new Employee("Smith", "Shirley", "333-33-3333"));
        employees.add(new Employee("Doe", "John", "444-44-4444"));
        employees.add(new Employee("Gilscarbo", "Goopy", "333-33-3333"));

        Set<Employee> noDuplicates = new HashSet<>(employees);
        employees = new ArrayList<>(noDuplicates);
        
        //can't do a get method with sets
        
        for (Employee e : employees) {
            System.out.println(e.getLastName());
        }
        //in Employee class, we added equals and hashset methods to check for duplicates

        Employee e1 = employees.get(0);
        Employee e2 = employees.get(2);
        if (e1.equals(e2)) {
            System.out.println("The two employees are the same");
        } else {
            System.out.println("The employees are different");
        }

    }
}
