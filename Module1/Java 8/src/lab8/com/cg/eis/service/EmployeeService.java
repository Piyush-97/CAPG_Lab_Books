package lab8.com.cg.eis.service;

import java.util.HashMap;
import java.util.Map;

import lab8.com.cg.eis.bean.Employee;

public class EmployeeService implements IEmployeeService{
	
	Map<Integer, Employee> employees = new HashMap<Integer, Employee>();

	@Override
	public Employee addEmployee(Employee emp) {
		employees.put(emp.getEmpId(), emp);
		return emp;
	}

	@Override
	public void deleteEmployeeById(int empId) {
		employees.remove(empId);
		
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		employees.put(empId, emp);
		return emp;
	}

	@Override
	public String viewInsurancePolicy(int empId) {
		return employees.get(empId).getInsuranceSchema();
	}

	@Override
	public double updateSalary(int empId, double salary) {
		employees.get(empId).setSalary(salary);
		return salary;
	}

	@Override
	public String updateEmpName(int empId, String newName) {
		employees.get(empId).setName(newName);
		return newName;
	}
	
}
