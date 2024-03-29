package com.task2;

public class EmployeeDetails {
	int emp_id, salary;  
	String name;
	public int getEmp_id() {  
	    return emp_id;  
	}  
	public void setEmp_id(int emp_id) {  
	    this.emp_id = emp_id;  
	}  
	public int getSalary() {  
	    return salary;  
	}  
	public void setSalary(int salary) {  
	    this.salary = salary;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	@Override  
	public String toString() {  
	    return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name+"]";  
	    }  
}
