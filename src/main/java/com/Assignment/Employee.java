package com.Assignment;

public class Employee implements Comparable<Employee> {
    private int id;
    private String firstName;
    private String lastName;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        int idComparison = Integer.compare(this.id, other.id);
        if (idComparison != 0) return idComparison;

        int firstNameComparison = this.firstName.compareTo(other.firstName);
        if (firstNameComparison != 0) return firstNameComparison;

        return this.lastName.compareTo(other.lastName);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, firstName, lastName);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id &&
//                firstName.equals(employee.firstName) &&
//                lastName.equals(employee.lastName);
//    }
}
