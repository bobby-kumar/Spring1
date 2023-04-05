package com.example.demo;

public class Employee {
	private int empId;
	private String name;
	private String degination;
	public int getEmpId() {
		return empId;
	}
	
	
	//Constructor with argument
	public Employee(int empId, String name, String degigination) {
		super();
		this.empId = empId;
		this.name = name;
		this.degination = degigination;
	}



	//getter setter
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegigination() {
		return degination;
	}
	public void setDegigination(String degigination) {
		this.degination = degigination;
	}

}
