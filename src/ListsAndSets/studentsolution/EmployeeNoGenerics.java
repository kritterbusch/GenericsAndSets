package ListsAndSets.studentsolution;

import common.Dog;
import common.Employee;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KRitterbusch
 */
public class EmployeeNoGenerics {




    public static void main(String[] args) {
               
        
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
