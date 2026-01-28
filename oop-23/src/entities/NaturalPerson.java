package entities;

public class NaturalPerson extends Person {

	private Double healthExpenses;
	
	public NaturalPerson() {
	}

	public NaturalPerson(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double incomeTax() {
		if (getAnnualIncome() < 20000) {
			return (getAnnualIncome() * 0.15) - (healthExpenses * 0.5);
		}
		else {
			return (getAnnualIncome() * 0.25) - (healthExpenses * 0.5);
		}
	}
}
	