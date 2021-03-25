package com.ltts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
 
//Implement Comparable to sort Employee on basis of Name, Salary and joining Date
class Employee implements Comparable<Employee> {
	 int id;
	 String name;
	 int salary;
	 
    public Employee() {
    }
 
    public Employee( int i,String n, int f) {
           name = n;
           salary = f;
           id = i;
    }
 
    public String toString() {
    	return "\n  id=" + id + ", name=" + name + ", salary=" + salary ;
    }
 
    public int compareTo(Employee e) {
           return this.name.compareTo(e.name);
    }

 
 
    public static void main(String[] args) {
 
           Employee emp1 = new Employee(1,"zoro", 2000);
           Employee emp2 = new Employee(2,"nami", 500);
           Employee emp3 = new Employee(3,"robin", 1000);
           Employee emp4 = new Employee(4,"luffy", 9000);
           Employee emp5 = new Employee(5,"sanji", 1000);
 
           List<Employee> l = new ArrayList<Employee>();
           l.add(emp1);
           l.add(emp2);
           l.add(emp3);
           l.add(emp4);
           l.add(emp5);
 
           Collections.sort(l); // SORT
 
           System.out.println(l); // Display list
 
    }
 
}