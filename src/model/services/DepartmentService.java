package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll() {
		// mocked data
		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Books"));
		list.add(new Department(2, "Games"));
		list.add(new Department(3, "Films"));
		list.add(new Department(4, "Electronics"));
		return list;
	}

}
