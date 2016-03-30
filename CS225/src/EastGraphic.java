/*
 * Written by: Jun Ma Student ID:1740019 section: 01
 * CS 225 fall 2011
 * Final Project
 * Class Name: EastGraphic
 * Class Description: This class is just for containing the three buttons on the east of 
 * the whole frame.
*/
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class EastGraphic extends JPanel
{
	protected void paintComponent(Graphics g) 
	{
		//this class just make the main frame more beautiful 
		super.paintComponent(g);
		setBackground(Color.BLACK);
		g.setColor(Color.white);
		g.drawLine(0, 0, 0,450);
	}
}
