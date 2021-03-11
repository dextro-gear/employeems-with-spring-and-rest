package com.cg.employeerest.repository;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cg.employeerest.entities.Employee;
import com.cg.employeerest.exceptions.EmployeeNotFoundException;

@Repository
public class EmployeeRepository {

	private final Map<Integer, Employee> employeeStore = StoreHolder.getInstance().getEmployeeStore();

	private int generateID() {
		return employeeStore.size() + 1;
	}
	
	
	public void addEmployeeIntoStore(Employee e) {
		employeeStore.put(generateID(), e);
	}
	
	public Employee removeEmployeeByID(Integer id) {
		return employeeStore.remove(id);
	}

	public Employee findEmployeeByID(Integer id){
		Employee emp = employeeStore.get(id);
		if(emp != null)
			return emp;
		else 
			throw new EmployeeNotFoundException();
	}
}
