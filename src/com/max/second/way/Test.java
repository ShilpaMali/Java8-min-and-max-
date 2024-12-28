package com.max.second.way;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "vinit", 7000));
		al.add(new Employee(102, "akash", 8000));
		al.add(new Employee(103, "suresh", 7500));
		Comparator<Employee> c=(emp1, emp2) -> {
			if (emp1.getEmpSalary() == emp2.getEmpSalary()) {
				return 0;
			} else if (emp1.getEmpSalary() > emp2.getEmpSalary()) {
				return 1;
			} else {
				return -1;
			}
		};

		Employee emp=al.stream().min(c).get();
		System.out.println(emp);
		
	}

}
