package com.lumwn.stream;

public class Employee implements Comparable<Employee>{
	private String name;
	private String city;
	private int empId;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String city, int empId) {
		super();
		this.name = name;
		this.city = city;
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", empId=" + empId + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.city.compareTo(o.city);
		
	}

}
