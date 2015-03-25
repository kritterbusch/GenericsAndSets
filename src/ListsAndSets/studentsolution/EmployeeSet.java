/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListsAndSets.studentsolution;

import common.Employee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author KRitterbusch
 */
public class EmployeeSet {
    public static void main(String[] args) {
        
    
   List<Employee> employees = new ArrayList<>();//could also use Collection instead of List, but it's too generic--can't call getter method like with lists
        employees.add(new Employee("Smith", "Shirley", "333-33-3333"));
        employees.add(new Employee("Doe", "John", "444-44-4444"));
        employees.add(new Employee("Gilscarbo", "Goopy", "333-33-3333"));
        
        Set<Employee> noDuplicates = new HashSet<>(employees);//when these 2 lines are commented out, the duplicate stays in
        employees = new ArrayList<>(noDuplicates);
        
        //can't do a get method with sets
        
        for (Employee e : employees) {
            System.out.println(e.getLastName());
        }
        //in Employee class, we added equals and hashset methods to check for duplicates

        Employee e1 = employees.get(0);
        Employee e2 = employees.get(1);
        if (e1.equals(e2)) {
            System.out.println("The two employees are the same");
        } else {
            System.out.println("The employees are different");
        }

    } 
}
