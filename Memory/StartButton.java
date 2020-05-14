//Jenny Jung and Amy Nguyen

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class StartButton extends JButton implements ActionListener {
	private DiamondButton db;

	private static Font sanSerifFont = new Font("SanSerif", Font.PLAIN, 12);

	private Color c = Color.BLUE;
	private DiamondButton[] bs;

	public StartButton(DiamondButton button) {
		this.db = button;
	}

	public StartButton(Color c, DiamondButton[] bs) {
		this.c = c;
		this.addActionListener(this);
		this.bs = bs;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setFont(sanSerifFont);
		FontMetrics fm = g.getFontMetrics();
		int w = fm.stringWidth("Start");
		int h = fm.getAscent();
		g.drawString("Start", 120 - (w / 2), 120 + (h / 4));

		g.setColor(c);

	}

	public void makeGray() {
		c = Color.gray;

		this.setEnabled(false);
		for (DiamondButton b : bs)
			b.setColor(c);
	}

	public void actionPerformed(ActionEvent e) {
		makeGray();
	}

}
