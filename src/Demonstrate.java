//Matthew G. Mershon (CSIS.293.9240) 2014/4/25 (LabAssignment11): Write a class named TestScores. Demonstrate the class in a program.
import javax.swing.JOptionPane;	// For dialog boxes

public class Demonstrate
{
	public static void main(String[] args)
	{ 	
		String word = JOptionPane.showInputDialog("Enter all test values values spaced apart.");
		String[] vals = (word.split("\\s+")); // split the sting by whitespace
		int[] results = new int[vals.length];
		// creates integer array with given length of user input
		for (int i = 0; i < vals.length; i++) {
		    try {
		        results[i] = Integer.parseInt(vals[i]);
		    } catch (NumberFormatException nfe) {};
		}
		// vals[1] cast to int
		// vals[2] cast to int
		// ...
		// vals[n] cast to int
		Integer.parseInt(vals[0]); // throws NumberFormatException
		TestScores Scores = new TestScores((results)); // passes entire array to TestScores constructor
		JOptionPane.showMessageDialog(null, "The average test score is: " + Scores.getAverage());
		// displays average of all inputed test scores. 
		}
	
	}
	
