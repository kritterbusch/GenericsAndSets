/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListsAndSets.studentsolution;

import common.Dog;
import common.Employee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author KRitterbusch
 */
public class EmployeeWithGenerics {

    public static void main(String[] args) {
        //USING GENERICS <>. no casting.

        List<Employee> employees = new ArrayList<>();//could also use Collection instead of List, but it's too generic--can't call getter method like with lists
        employees.add(new Employee("Gigglesby", "Shirley", "333-33-3333"));
        employees.add(new Employee("Wellington", "John", "444-44-4444"));
        employees.add(new Employee("Gilscarbo", "Goopy", "333-33-3333"));

// Retrieve an item without a cast needed
        
        Employee employeeStats = employees.get(2);

        System.out.println("Last Name\tFirst Name");
        System.out.println("--------------------------");
        for (Employee e : employees) {
            System.out.println(e.getLastName() + "\t" + e.getFirstName());
        }
        
        
        
        //NOT USING GENERICS, USES CASTING
        List list = new ArrayList();
        list.add(new Employee("Foolery", "Tom", "555-55-5555"));
        list.add(new Dog("Oliver", 333));
        
        String item = (String)list.get(1);



//while the following won't error here, it throws a casting exception error
//        for(int i = 0; i < list.size(); i++) {
//            String l = (String) list.get(i);
//            System.out.println(l);
//        }

        //must cast and use Object
//        for (Object obj : list) {
//            String s = (String) obj;//putting (String) in is casting
//            System.out.println(s);
//        }

        // Now retrieve each item and output to console (notice cast)
        System.out.println("Original Shopping List:");
        for(int i=0; i < list.size(); i++) {
            String s = (String)list.get(i);
            System.out.println(s);
        }

    }
}
