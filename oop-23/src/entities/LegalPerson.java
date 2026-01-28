package entities;

public class LegalPerson extends Person {

	private Integer employeesNumber;
	
	public LegalPerson() {
	}
	
	public LegalPerson(String name, Double annualIncome, Integer employeesNumber) {
		super(name, annualIncome);
		this.employeesNumber = employeesNumber;
	}

	public Integer getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public double incomeTax() {
		if (employeesNumber > 10) {
			return getAnnualIncome() * 0.14;
		}
		else {
			return getAnnualIncome() * 0.16;
		}
	}

}
