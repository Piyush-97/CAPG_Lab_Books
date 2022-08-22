package lab5;

import java.util.Scanner;

import lab5.com.cg.eis.exception.EmployeeException;

public class Exercise6 {
	
	public void checkSalary(double salary) throws EmployeeException {
		if (salary < 3000) {
			throw new EmployeeException("Salary below 3000.");
		}
	}

	public static void main(String[] args) throws EmployeeException {
		Exercise6 ex6 = new Exercise6();
		System.out.print("Enter Salary: ");
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		try {
			ex6.checkSalary(salary);
		}catch (EmployeeException e) {
			e.printStackTrace();
		}
		System.out.println("End");
		sc.close();
	}
}
