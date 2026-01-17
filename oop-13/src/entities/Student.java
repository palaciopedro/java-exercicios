package entities;

public class Student {

	private String name;
	private double grade1;
	private double grade2;
	
	public Student(String name, double grade1, double score2) {
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = score2;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade1() {
		return grade1;
	}
	public void getGrade1(double grade1) {
		this.grade1 = grade1;
	}
	public double getGrade2() {
		return grade2;
	}
	public void seetGrade2(double grade2) {
		this.grade2 = grade2;
	}
}
