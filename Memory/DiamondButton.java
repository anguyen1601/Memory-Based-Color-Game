//Jenny Jung and Amy Nguyen

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class DiamondButton extends JButton implements ActionListener {

	private static Font sanSerifFont = new Font("SanSerif", Font.PLAIN, 12);
	private Color c = Color.BLUE;

	public DiamondButton(Color c) {
		this.c = c;
		this.addActionListener(this);
	}

	public void setColor(Color d) {
		c = d;
		repaint();
	}

	/*
	 * The method paintComponent(Graphics g) is called when java needs to draw the
	 * component
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int[] xPoints = new int[4]; // 4
		int[] yPoints = new int[4];

		// manipulate values and see what it does!

		xPoints[0] = 50; // 50
		yPoints[0] = 60; // 60
		xPoints[1] = 75; // 75
		yPoints[1] = 10; // 10
		xPoints[2] = 100; // 100
		yPoints[2] = 60; // 60
		xPoints[3] = 75; // 75
		yPoints[3] = 110; // 110

		g.setColor(c);
		g.fillPolygon(xPoints, yPoints, xPoints.length);

	}

	public void beenHere() {
		c = Color.gray;
		ImageIcon x = new ImageIcon("X.gif");
		// setIcon adds an image to a button
		this.setIcon(x);
		this.setEnabled(false);
	}

	public void actionPerformed(ActionEvent e) {
		beenHere();
	}

}
