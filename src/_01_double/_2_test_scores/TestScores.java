package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What is your score?");
		double score_double = Double.parseDouble(score);
		if (score_double > 85) {
			JOptionPane.showMessageDialog(null, "Good job");
		}
		else {
			JOptionPane.showMessageDialog(null, "Do better next time");
		}
	}
}
