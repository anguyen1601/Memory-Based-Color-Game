//Jenny Jung and Amy Nguyen

import java.awt.*;
import javax.swing.JPanel;


// JPanels are useful as components to draw on
// allows panel to be displayed 

public class Lab7DisplayPanel extends JPanel {

	private Color col;
	private Color col2;

	public Lab7DisplayPanel() {
		// set size, otherwise Java will assume 0 x 0 and component may disappear
		setPreferredSize(new Dimension(300,300));
		col2 = makeRandomColor();

	}


	public void randomSet() {

		col = makeRandomColor();

	}
	/*
	 * This method is called whenever java wants to draw the panel
	 * Change this to change the appearance of the panel
	 * 
	 */
	public void paintComponent(Graphics g) {

		col = makeRandomColor();	
		g.setColor(col);

		g.drawString("One of these is unlike the other...",20,20);
		col2 = makeRandomColor();
		g.setColor(col2);


		g.fillArc(5,30,40,40, 30, 500); //1
		
		//sets points for pentagon
		Polygon pentagon = new Polygon();

		for (int i = 0; i < 5; i++)

		//addPoint(int x, int y) appends specified coordinates to this Polygon
		  pentagon.addPoint((int) (150 + 20 * Math.cos(i * 2 * Math.PI / 5)), 
			  (int) (50 + 20 * Math.sin(i * 2 * Math.PI / 5))); //this general algorithm found from 
			  													//http://www.java2s.com/Code/Java/2D-Graphics-GUI/DrawaPolygon.htm
	

		g.drawRoundRect(1,7,300,20,10,10); //2 
		
		g.fillPolygon(pentagon); //3

		g.translate(50,0); //4

		int[] x2  = {42,52,72,52,60,40,15,28,9,32,42};
		int[] y2 = {38,62,68,80,105,85,102,75,58,60,38};
		g.fillPolygon(x2,y2, 11);

	}

	// Math.random() returns a number between 0 and 1

	private Color makeRandomColor() {
		int red = (int) (Math.random()*255);
		int green = (int) (Math.random()*255);
		int blue = (int) (Math.random()*255);

		Color col = new Color(red,green,blue);
		return col;
	}

}
