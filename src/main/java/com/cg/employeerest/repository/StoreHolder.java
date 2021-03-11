package com.cg.employeerest.repository;

import java.util.HashMap;

import com.cg.employeerest.entities.Department;
import com.cg.employeerest.entities.Employee;

public class StoreHolder {

	private static final StoreHolder INSTANCE = new StoreHolder();
	
	HashMap<Integer, Employee> employeeStoreMap = new HashMap<Integer, Employee>();
	HashMap<Integer, Department> departmentStoreMap = new HashMap<Integer, Department>();
	
	public static StoreHolder getInstance() {
		return INSTANCE;
	}
	
	public HashMap<Integer,	Employee> getEmployeeStore(){
		return employeeStoreMap;
	}
	
	public HashMap<Integer, Department> getDepartmentStore(){
		return departmentStoreMap;
	}
	
}
