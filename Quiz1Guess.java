// Quiz 1 review RandomGuess add-on
import javax.swing.JOptionPane;

public class Quiz1Guess
{
	public static void main(String[] args) 
	{
		//variables and Constants
		int userGuess;
		int magicNumber;
		String msg;
		int attempts = 1;
		final int LOW = 1;
		final int HIGH = 10;

		//input phase
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number between " + LOW + " and " + HIGH+ "."));

		//Processing Phase
		magicNumber = (int) (Math.random()*HIGH)+LOW;

		while(userGuess != magicNumber)
		{
			if(userGuess > magicNumber)
			{
				msg = "Sorry, your guess was too high!";
			} else {
				msg = "Sorry, your guess was too low!";
			}//end of else statement

			userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, msg +"\nPlease enter a number between " + LOW + " and " + HIGH + "."));
			//increment the number of attemts before the userGuess is checked again
			++attempts;
		}//end of while loop

		//Output Phase
		JOptionPane.showMessageDialog(null, "Congratulations! You have won the game!\nThe magic number was: "+magicNumber+ "\nYou guessed it in: "+attempts+ " attempt(s)!");

	}
}