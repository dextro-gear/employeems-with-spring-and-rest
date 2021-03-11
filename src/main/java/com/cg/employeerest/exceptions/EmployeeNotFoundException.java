package com.cg.employeerest.exceptions;

public class EmployeeNotFoundException extends RuntimeException {

	public EmployeeNotFoundException() {
		super("Employee with given ID was not found in the repository.");
	}
	
	public EmployeeNotFoundException(String msg) {
		super(msg);
	}
	
}
