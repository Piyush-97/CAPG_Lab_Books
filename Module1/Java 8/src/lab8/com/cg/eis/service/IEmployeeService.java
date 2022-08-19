package lab8.com.cg.eis.service;

import lab8.com.cg.eis.bean.Employee;

public interface IEmployeeService {
	Employee addEmployee(Employee emp);
	void deleteEmployeeById(int empId);
	Employee updateEmployee(int empId, Employee emp);
	String viewInsurancePolicy(int empId);
	double updateSalary(int empId, double salary);
	String updateEmpName(int empId, String newName);
}
