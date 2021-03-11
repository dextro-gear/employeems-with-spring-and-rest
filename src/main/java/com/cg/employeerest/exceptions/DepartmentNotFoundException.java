package com.cg.employeerest.exceptions;

public class DepartmentNotFoundException extends RuntimeException {

	public DepartmentNotFoundException() {
		super("Department with given ID was not found in the repository.");
	}
	
	public DepartmentNotFoundException(String msg){
		super(msg);
	}
	
}
