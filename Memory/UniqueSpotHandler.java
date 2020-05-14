//Jenny Jung and Amy Nguyen 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;


public class UniqueSpotHandler implements ActionListener {

	private TheGame g;
	private Lab7Frame frame;
	
	
	public UniqueSpotHandler(TheGame game1,Lab7Frame fr) {
		g = game1;
		frame = fr;
	}


	public void actionPerformed(ActionEvent e) {
		g.uniqueSpot();
		if (g.getDoneMessage() != null)
			frame.setDoneMessage(g.getDoneMessage());

		// ask for the Lab7Frame to be repainted
		frame.repaint();
	}

}
