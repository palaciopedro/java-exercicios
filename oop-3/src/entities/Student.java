package entities;

public class Student {

	public String name;
	public double score1;
	public double score2;
	public double score3;
	
	public double finalScore() {
		
		return score1 + score2 + score3;
	}
	
	public double missingPoints() {	
		if (finalScore() < 60.0) {
			return 60 - finalScore();
		} else {
			return 0.0;
		}
	}
}
