
//Jenny Jung and Amy Nguyen

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Frame;

public class Lab7Frame extends JFrame{

	private JLabel message;
	private int buttonCount;
	private DiamondButton[] buttons;
	private JButton start;
	private Container ct;
	

	public void setUpFrame() {

		// Exit when window is closed
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		ct = getContentPane();
		

		// set the layout manager to a grid 4 rows by 3 columns 
		// (0 means however many you need)
		ct.setLayout(new GridLayout(4,0)); 

		TheGame game1 = new TheGame(7);

		buttonCount = game1.howManyButtons();

		GoodSpotHandler goodHand = new GoodSpotHandler(game1,this);
		UniqueSpotHandler uniqueHand = new UniqueSpotHandler(game1, this);

		Lab7DisplayPanel panel = new Lab7DisplayPanel();

		buttons = new DiamondButton[buttonCount];

		Color red = new Color(204, 0, 0);
		Color blue = new Color( 0, 0, 204);
		Color green = new Color(0, 153, 0);
		Color yellow = new Color(255, 204, 0);
		Color purple = new Color(102, 0, 153);
		Color orange = new Color(255, 165, 0);


		for (int i=0; i< buttonCount; i++) {
			// create a button  (DiamondButton is part of Lab 7)
			if( i == 0 || i == 7){
				DiamondButton rb = new DiamondButton(red);
				ct.add(rb);
				buttons[i] = rb;
				rb.addActionListener(goodHand);
			} else if ( i == 1 || i == 8){
				DiamondButton bb = new DiamondButton(blue);
				ct.add(bb);
				buttons[i] = bb;
				bb.addActionListener(goodHand);
			} else if ( i == 2 || i == 9){
				DiamondButton gb = new DiamondButton(green);
				ct.add(gb);
				buttons[i] = gb;
				gb.addActionListener(goodHand);
			} else if ( i == 3 || i == 6){
				DiamondButton pb = new DiamondButton(purple);
				ct.add(pb);
				buttons[i] = pb;
				pb.addActionListener(goodHand);
			} else if ( i == 4 || i == 10){
				DiamondButton yb = new DiamondButton(yellow);
				ct.add(yb);
				buttons[i] = yb;
				yb.addActionListener(goodHand);
			} else {
				DiamondButton ob = new DiamondButton(orange);
				ct.add(ob);
				buttons[i] = ob;
				ob.addActionListener(uniqueHand);
			}

			if (i==2) {
				panel.randomSet();
				ct.add(panel);
			}

		}

		start = new StartButton(Color.BLUE, buttons);
		ct.add(start);

		message = new JLabel("Keep pressing buttons");
		ct.add(message);

		Lab7DisplayPanel two = new Lab7DisplayPanel();
		ct.add(two);

	}


	public void setDoneMessage(String message1) {
		message.setText(message1);

		for (JButton b : buttons) {
			b.setEnabled(false);
		}

	}

}
