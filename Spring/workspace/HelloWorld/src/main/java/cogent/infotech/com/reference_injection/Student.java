package cogent.infotech.com.reference_injection;

public class Student {

	private Scores scores;

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

	public String toString() {
		return "Scores = " + scores;
	}
}
