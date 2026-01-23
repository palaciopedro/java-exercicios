package entities;

import java.time.LocalDate;

public class HourContract {

	private LocalDate date;
	private	Double valuePerhour;
	private Integer hours;
	
	public HourContract() {
	}

	public HourContract(LocalDate date, Double valuePerhour, Integer hours) {
		this.date = date;
		this.valuePerhour = valuePerhour;
		this.hours = hours;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getValuePerhour() {
		return valuePerhour;
	}

	public void setValuePerhour(Double valuePerhour) {
		this.valuePerhour = valuePerhour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double totalValue() {
		return valuePerhour * hours;
	}
}
