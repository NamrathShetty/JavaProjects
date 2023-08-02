package com.lumwn.stream;

import java.util.Arrays;
import java.util.List;



public class EmpMain {

	public static void main(String[] args) {
		List<Employee> employees=Arrays.asList(new Employee("Bheem","Bengluru",200),
				new Employee("Raju","Mangluru",201),
				new Employee("Jaggu","Mysore",202),
				new Employee("Kalia","Delhi",203));
		employees.stream().forEach(emp->System.out.println(emp));
		
		System.out.println();
		String city="Bengluru";
		
		employees.stream()
				.filter(emp->emp.getCity().equals(city))
				.forEach(emp->System.out.println(emp));
		
		System.out.println();
		System.out.println("Sorted by city");
		employees.stream()
				.sorted((emp1,emp2)->emp1.compareTo(emp2))
				.forEach(emp->System.out.println(emp));
		
		System.out.println();
		String empName="Bheem";
		Employee result=employees.stream()
						.filter(name->name.getName().equals(empName))
						.findFirst()
						.orElseThrow(()->new RuntimeException("Employee name not found"));
		System.out.println(result);
		
		System.out.println();
		String namechar=employees.stream()
				.filter(name->name.getName().startsWith("A"))
				.map(Employee::getName)
				.findFirst()
				.orElse("Name not in first place");
		
		System.out.println(namechar);
	}

}
