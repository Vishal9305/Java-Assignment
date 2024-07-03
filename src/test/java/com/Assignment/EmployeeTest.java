package com.Assignment;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testAddEmployeeWithoutHashCodeAndEquals() {
       //Comment HashCode and Equals methods in Employee class

        Set<Employee> employees = new HashSet<>();
        Employee emp1 = new Employee(1, "John", "Doe");
        Employee emp2 = new Employee(1, "John", "Doe");

        employees.add(emp1);
        employees.add(emp2);

        assertEquals(2, employees.size(), "HashSet should contain 2 elements because hashCode() and equals() are not overridden.");
    }

    @Test
    public void testAddEmployeeWithOnlyHashCode() {

//Comment HashCode and Equals methods in Employee class
        Set<Employee> employees = new HashSet<>();
        Employee emp1 = new Employee(1, "John", "Doe");
        Employee emp2 = new Employee(1, "John", "Doe");


        employees.add(emp1);
        employees.add(emp2);


        assertEquals(2, employees.size(), "HashSet should contain 2 elements because equals() is not overridden.");
    }

    @Test
    public void testAddEmployeeWithOnlyEquals() {
//Comment HashCode and Equals methods in Employee class

        Set<Employee> employees = new HashSet<>();
        Employee emp1 = new Employee(1, "John", "Doe");
        Employee emp2 = new Employee(1, "John", "Doe");



        employees.add(emp1);
        employees.add(emp2);


        assertEquals(2, employees.size(), "HashSet should contain 2 elements because hashCode() is not overridden.");
    }

    @Test
    public void testAddEmployeeWithHashCodeAndEquals() {

//Comment out  HashCode and Equals methods in Employee class
        Set<Employee> employees = new HashSet<>();
        Employee emp1 = new Employee(1, "John", "Doe");
        Employee emp2 = new Employee(1, "John", "Doe");



        employees.add(emp1);
        employees.add(emp2);


        assertEquals(1, employees.size(), "HashSet should contain 1 element because both hashCode() and equals() are overridden.");
    }



    //    Comment Equal,Hashcode and compareTo methods in Employee class
    @Test
    public void testDefaultSorting() {
        TreeSet<Employee> employees = new TreeSet<>();
        employees.add(new Employee(3, "John", "Doe"));
        employees.add(new Employee(1, "Jane", "Smith"));
        employees.add(new Employee(2, "Alice", "Johnson"));

        Employee[] expectedOrder = {
                new Employee(1, "Jane", "Smith"),
                new Employee(2, "Alice", "Johnson"),
                new Employee(3, "John", "Doe")
        };

        int index = 0;
        for (Employee employee : employees) {
            assertEquals(expectedOrder[index++], employee);
        }
    }
    //    Comment Equal,Hashcode and compareTo methods in Employee class
    @Test
    public void testCustomSortingByFirstName() {
        TreeSet<Employee> employees = new TreeSet<>(new EmployeeFirstNameComparator());
        employees.add(new Employee(3, "John", "Doe"));
        employees.add(new Employee(1, "Jane", "Smith"));
        employees.add(new Employee(2, "Alice", "Johnson"));

        Employee[] expectedOrder = {
                new Employee(2, "Alice", "Johnson"),
                new Employee(1, "Jane", "Smith"),
                new Employee(3, "John", "Doe")
        };

        int index = 0;
        for (Employee employee : employees) {
            assertEquals(expectedOrder[index++], employee);
        }
    }
}
