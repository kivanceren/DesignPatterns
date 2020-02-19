package com.designpatterns.prototype;

public class EmployeeFactory {
	public Employee deepCopy(Employee anEmployee) {
		return (Employee) anEmployee.deepCopy();
	}
	
	public Employee shallowCopy(Employee anEmployee) {
		Employee copyEmployee = anEmployee;
		return copyEmployee;
	}
	
	
}
