package lab8.com.cg.eis.bean;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	private String designation;
	private String insuranceSchema;
	
	public Employee() {
	}

	public Employee(int empId, String name, int salary, String designation, String insuranceSchema) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceSchema = insuranceSchema;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary2) {
		this.salary = salary2;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceSchema() {
		return insuranceSchema;
	}

	public void setInsuranceSchema(String insuranceSchema) {
		this.insuranceSchema = insuranceSchema;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceSchema=" + insuranceSchema + "]";
	}
	
}
