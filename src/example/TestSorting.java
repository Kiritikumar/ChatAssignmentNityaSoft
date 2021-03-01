package example;

import java.util.ArrayList;
import java.util.Collections;

public class TestSorting extends Employee{

	public TestSorting(int id, String fname, String lname, int age) {
		super(id, fname, lname, age);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Employee e1=new Employee(01, "aaa", "bbb", 12);
		Employee e2=new Employee(02, "ccc", "ddd", 24);
		Employee e3=new Employee(03, "eee", "fff", 15);
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(e3);
		emp.add(e2);
		emp.add(e1);
		System.out.println(emp);
		Collections.sort(emp);
		
	}

}
