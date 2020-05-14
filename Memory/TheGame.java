//Jenny Jung and Amy Nguyen

/*//////////////////////////////////////// GAME DESCRIPTION ////////////////////////////////////////

	Our game creates a display of diamond button pairs. However, one of these buttons actually 
	does not have a pair. Inititally, the user does not know this fact aside from the print 
	message "One of these is unlike the other..." This hints at the type of game this is. We 
	make the assumption the user is not going to think too much about this hint prior to hitting
	the start button. (we are also dependent on the fact people tend to push start first...)
	When the start button is pressed, the previously colored diamonds turn gray. Based on memory
	the user must find the unique diamond (the one without a pair). We allow the user to have 
	3 guesses before they "lose." If they are able to find the unique diamond, they win!

/////////////////////////////////////////// GAME DESCRIPTION ////////////////////////////////////*/


public class TheGame {

	// Notice that the Game does not know about the GUI interface to the game

	private int howManyPushed = 4;
	private int limit;
	private String doneMessage = null;
	private int howMany = 11;
	private int[] uniqueButton = {5}; 
	
	public TheGame(int i) {
		limit = i;
	}

	public void uniqueSpot() {
		System.out.println("WINNER, Nguyener! Jenny Jung Dinner!!!"); //print this to system lol...
		doneMessage = "WINNER!!! Unique button found!";  //its cute...cause it's our names...
		
	}
	
	public void spot() {
		howManyPushed++;
		if (howManyPushed == limit)
			doneMessage = "LOSER!!! You have no more guesses. Better luck next time!";
	}

	public boolean isButtonUnique(int c) {
		for (int a : uniqueButton)
			if (c==a) return true;
		return false;
	}
	
	public String getDoneMessage() {
		return doneMessage;
	}

	public int howManyButtons() {
		return howMany;
	}
	
	
}
