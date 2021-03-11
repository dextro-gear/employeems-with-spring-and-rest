package com.cg.employeerest.repository;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cg.employeerest.entities.Department;
import com.cg.employeerest.exceptions.DepartmentNotFoundException;

@Repository
public class DepartmentRepository {

	private final Map<Integer, Department> departmentStore = StoreHolder.getInstance().getDepartmentStore();
	
	private int generateID() {
		return departmentStore.size() + 1;
	}
	
	
	public void addEmployeeIntoStore(Department department) {
		departmentStore.put(generateID(), department);
	}
	
	public Department removeDepartmentByID(Integer id) {
		return departmentStore.remove(id);
	}

	public Department findDepartmentByID(Integer id){
		Department dept = departmentStore.get(id);
		if(dept != null)
			return dept;
		else 
			throw new DepartmentNotFoundException();
	}
	
}
