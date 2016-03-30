/*
 * Written by: Jun Ma Student ID:1740019 section: 01
 * CS 225 fall 2011
 * Final Project
 * Class Name: DataGraphic
 * Class Description: This class is for drawing every thing in the user interface and to fulfill
 * some settings' functionality. Acturely, this class is really significant among the project.
*/
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import javax.swing.JPanel;

public class DataGraphic extends JPanel
{
	
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		setBackground(Color.black);
		
		//ECG
		g.setColor(new Color(50,120,170));
		g.drawString(new String("ECG"),35,25);
		
		g.setColor(Color.white);
		g.drawRect(30, 10, 705, 210);
		g.fillRect(70, 15, 660, 200);
		
		g.setColor(Color.gray);
		for(int i = 0;i<210;i+=10)
		{
			g.drawLine(70, 15+i, 730, 15+i);
			
		}
		for(int j = 0;j<670;j+=10)
		{
			g.drawLine(70+j, 15, 70+j, 215);
		}
		
		//heart rate
		g.setColor(Color.white);
		g.drawRect(30, 230, 140, 100);
		g.setColor(Color.yellow);
		g.drawString(new String("Heart Rate"),35,245);
		
		//Respiratory
		g.setColor(Color.white);
		g.drawRect(195,230,140,100);
		g.setColor(new Color(50,190,170));
		g.drawString(new String("Respiratory"),200,245);
		
		//SpO2
		g.setColor(Color.white);
		g.drawRect(360,230,140,100);
		g.setColor(Color.pink);
		g.drawString(new String("SpO2"),365,245);
		
		//blood presure-BP Systolic
		g.setColor(Color.white);
		g.drawRect(30,340,140,100);
		g.setColor(Color.red);
		g.drawString(new String("BP Systolic"),35,355);
		
		//blood presure-BP Diastolic
		g.setColor(Color.white);
		g.drawRect(195, 340, 140, 100);
		g.setColor(Color.red);
		g.drawString(new String("BP Diastolic"),200,355);
		
		//temperature
		g.setColor(Color.white);
		g.drawRect(360, 340, 140, 100);
		g.setColor(Color.green);
		g.drawString(new String("Temperature"),365,355);
		
		g.setColor(Color.white);
		g.drawLine(0, 450, 1020, 450);
		g.drawLine(760, 0, 760, 450);
		g.drawLine(760, 120, 1020, 120);
		g.drawLine(760, 180, 1020, 180);
	
		
		//alarm parameter
		g.setFont(new Font("SansSerif", Font.BOLD, 15));
		String alarm = "Alarm";
		String para = "Parameter";
		g.setColor(Color.green);
		g.drawString(alarm,10, 480);
		g.drawString(para,10, 500);
		
		g.setFont(new Font("SansSerif", Font.PLAIN, 10));
		g.setColor(Color.lightGray);
		g.drawString(new String("High"),90, 485);
		g.drawString(new String("Low"),90, 505);
		g.drawString(new String("Heart Rate"),115, 465);
		g.drawString(new String("Respiratory"),225, 465);
		g.drawString(new String("SpO2"),335, 465);
		g.drawString(new String("BP Systolic"),445, 465);
		g.drawString(new String("BP Diastolic"),555, 465);
		g.drawString(new String("Temperature"),665, 465);
		
		g.setColor(Color.white);
		g.fillRect(115,470,660,40);
		g.setColor(Color.gray);
		g.drawRect(115,470,660,40);
		g.drawLine(115, 490, 775, 490);
		g.drawLine(225, 470, 225, 510);
		g.drawLine(335, 470, 335, 510);
		g.drawLine(445, 470, 445, 510);
		g.drawLine(555, 470, 555, 510);
		g.drawLine(665, 470, 665, 510);
		
		//user information
		 
		String id = read.getIDnum();
		String name = read.getName();
		String age = read.getAge();
		String gender = read.getGender();
		String room = read.getRoomNo();
		g.setColor(Color.blue);
		g.setFont(new Font("Serif", Font.BOLD, 18));
		
		g.drawString(new String("ID -"), 765, 20);
		g.drawString(new String(" "+id), 800, 20);//user ID
		
		g.drawString(new String("Name -"), 765, 40);
		g.drawString(new String(" "+name), 825, 40);//user age
		
		g.drawString(new String("Age -"), 765, 60);
		g.drawString(new String(" "+age), 805, 60);//user age
		
		g.drawString(new String("Gender -"), 765, 80);
		g.drawString(new String(" "+gender), 835, 80);//user gender
	
		g.drawString(new String("Room -"), 765, 100);
		g.drawString(new String(" "+room), 825, 100);//user room
		
		
		//parameter display
		g.setColor(Color.cyan);
		g.setFont(new Font("SansSerif", Font.BOLD, 15));
		g.drawString(new String("Heart Rate"),810,230);
		g.drawString(new String("Respiratory"),810, 260);
		g.drawString(new String("SpO2"),810, 290);
		g.drawString(new String("BP Systolic"),810, 320);
		g.drawString(new String("BP Diastolic"),810, 350);
		g.drawString(new String("Temperature"),810, 380);
		
		
		//alarm range
		g.setFont(new Font("SansSerif", Font.PLAIN, 15));
		g.setColor(Color.black);
		
		String ah = String.valueOf(setAlarmHigh.getHeartRate_Data_h());
		g.drawString(ah, 120, 485);
		String bh = String.valueOf(setAlarmHigh.getRespiratory_Data_h());
		g.drawString(bh, 230, 485);
		String ch = String.valueOf(setAlarmHigh.getSpO2D_Data_h());
		g.drawString(ch, 340, 485);
		String dh = String.valueOf(setAlarmHigh.getBPSystolic_Data_h());
		g.drawString(dh, 450, 485);
		String eh = String.valueOf(setAlarmHigh.getBPDiastolic_Data_h());
		g.drawString(eh, 560, 485);
		String fh = String.valueOf(setAlarmHigh.getTemperature_Data_h());
		g.drawString(fh, 670, 485);
		
		String al = String.valueOf(setAlarmLow.getHeartRate_Data_h());
		g.drawString(al, 120, 505);
		String bl = String.valueOf(setAlarmLow.getRespiratory_Data_h());
		g.drawString(bl, 230, 505);
		String cl = String.valueOf(setAlarmLow.getSpO2D_Data_h());
		g.drawString(cl, 340, 505);
		String dl = String.valueOf(setAlarmLow.getBPSystolic_Data_h());
		g.drawString(dl, 450, 505);
		String el = String.valueOf(setAlarmLow.getBPDiastolic_Data_h());
		g.drawString(el, 560, 505);
		String fl = String.valueOf(setAlarmLow.getTemperature_Data_h());
		g.drawString(fl, 670, 505);
		
		//vital data
		g.setFont(new Font("SansSerif", Font.BOLD, 50));
		g.setColor(Color.yellow);
		String a = String.valueOf(setData.getHeartRate_Data());
		
		g.drawString(a, 75, 300);
		g.setColor(new Color(50,190,170));
		String b = String.valueOf(setData.getRespiratory_Data());
		
		g.drawString(b, 240, 300);
		g.setColor(Color.pink);
		String c = String.valueOf(setData.getSpO2D_Data());
		
		g.drawString(c, 405, 300);
		g.setColor(Color.red);
	    String d = String.valueOf(setData.getBPSystolic_Data());
		
		g.drawString(d, 75, 410);
		g.setColor(Color.red);
		String e = String.valueOf(setData.getBPDiastolic_Data());
		
		g.drawString(e, 240, 410);
		g.setColor(Color.green);
		String f = String.valueOf(setData.getTemperature_Data());
		
		g.drawString(f, 405, 410);
		
		String on = "   ON";
		String off = "   OFF";
		//Status
		g.setColor(Color.green);
		g.drawRect(530,230,205,210);
		g.setFont(new Font("SansSerif", Font.BOLD, 20));
		g.setColor(Color.pink);
		g.drawString(new String("Status"), 535, 250);
				
		g.drawString(new String("Heart Rate:"), 535, 290);
		if(FinalProject.clear == false)//to support the clear alarm button
		{
			//display alarm status
		if(((setData.getHeartRate_Data()>setAlarmLow.getHeartRate_Data_h())||(setData.getHeartRate_Data()==setAlarmLow.getHeartRate_Data_h()))&&(setData.getHeartRate_Data()<setAlarmHigh.getHeartRate_Data_h()||setData.getHeartRate_Data()==setAlarmHigh.getHeartRate_Data_h()))
		{
			g.drawString(new String(off), 660, 290);
			g.setColor(Color.green);
			g.fillRect(790, 217, 15, 15);
			g.setColor(Color.black);
			g.fillRect(792, 219, 11, 11);
		}
		else
		{
			g.drawString(new String(on), 660, 290);
			g.setColor(Color.red);
			g.fillRect(790, 217, 15, 15);
		}
				
		g.setColor(Color.pink);
		g.drawString(new String("Respiratory:"),535, 315);
		if(((setData.getRespiratory_Data()>setAlarmLow.getRespiratory_Data_h())||(setData.getRespiratory_Data()==setAlarmLow.getRespiratory_Data_h()))&&(setData.getRespiratory_Data()<setAlarmHigh.getRespiratory_Data_h()||setData.getRespiratory_Data()==setAlarmHigh.getRespiratory_Data_h()))
		{
			g.drawString(new String(off), 660, 315);
			g.setColor(Color.green);
			g.fillRect(790, 247, 15, 15);
			g.setColor(Color.black);
			g.fillRect(792, 249, 11, 11);
			
		}
		else
		{
			g.drawString(new String(on), 660, 315);
		    g.setColor(Color.red);
			g.fillRect(790, 247, 15, 15);
		}
				
		g.setColor(Color.pink);
	    g.drawString(new String("SpO2:"),535, 340);
	    if(((setData.getSpO2D_Data()>setAlarmLow.getSpO2D_Data_h())||(setData.getSpO2D_Data()==setAlarmLow.getSpO2D_Data_h()))&&(setData.getSpO2D_Data()<setAlarmHigh.getSpO2D_Data_h()||setData.getSpO2D_Data()==setAlarmHigh.getSpO2D_Data_h()))
		{
			g.drawString(new String(off), 660, 340);
			g.setColor(Color.green);
			g.fillRect(790, 277, 15, 15);
			g.setColor(Color.black);
			g.fillRect(792, 279, 11, 11);
		}
		else
		{
			g.drawString(new String(on), 660, 340);
	        g.setColor(Color.red);
		    g.fillRect(790, 277, 15, 15);
		}
				
	    g.setColor(Color.pink);
		g.drawString(new String("BP Systolic:"),535, 365);
		if(((setData.getBPSystolic_Data()>setAlarmLow.getBPSystolic_Data_h())||(setData.getBPSystolic_Data()==setAlarmLow.getBPSystolic_Data_h()))&&(setData.getBPSystolic_Data()<setAlarmHigh.getBPSystolic_Data_h()||setData.getBPSystolic_Data()==setAlarmHigh.getBPSystolic_Data_h()))
		{
			g.drawString(new String(off), 660, 365);
			g.setColor(Color.green);
			g.fillRect(790, 307, 15, 15);
			g.setColor(Color.black);
			g.fillRect(792, 309, 11, 11);
		}
		else
		{
			g.drawString(new String(on), 660, 365);
		    g.setColor(Color.red);
	        g.fillRect(790, 307, 15, 15);
		}
		
		g.setColor(Color.pink);
		g.drawString(new String("BP Diastolic:"),535, 390);
		if(((setData.getBPDiastolic_Data()>setAlarmLow.getBPDiastolic_Data_h())||(setData.getBPDiastolic_Data()==setAlarmLow.getBPDiastolic_Data_h()))&&(setData.getBPDiastolic_Data()<setAlarmHigh.getBPDiastolic_Data_h()||setData.getBPDiastolic_Data()==setAlarmHigh.getBPDiastolic_Data_h()))
		{
			g.drawString(new String(off), 660, 390);
			g.setColor(Color.green);
			g.fillRect(790, 337, 15, 15);
			g.setColor(Color.black);
			g.fillRect(792, 339, 11, 11);
		}
		else
		{
			g.drawString(new String(on), 660, 390);
		    g.setColor(Color.red);
            g.fillRect(790, 337, 15, 15);
		}
				
		g.setColor(Color.pink);
		g.drawString(new String("Temperature:"),535, 415);
		if(((setData.getTemperature_Data()>setAlarmLow.getTemperature_Data_h())||(setData.getTemperature_Data()==setAlarmLow.getTemperature_Data_h()))&&(setData.getTemperature_Data()<setAlarmHigh.getTemperature_Data_h()||setData.getTemperature_Data()==setAlarmHigh.getTemperature_Data_h()))
		{
			g.drawString(new String(off), 660, 415);
			g.setColor(Color.green);
			g.fillRect(790, 367, 15, 15);
			g.setColor(Color.black);
			g.fillRect(792, 369, 11, 11);
		}
		else
		{
			g.drawString(new String(on), 660, 415);
		    g.setColor(Color.red);
            g.fillRect(790, 367, 15, 15);
		}
		}
		//here clear alarm button pressed
		else if (FinalProject.clear == true&&FinalProject.cc == true)
		 {
			 g.setColor(Color.pink);
			 g.drawString(new String("Status"), 535, 250);			
			 g.drawString(new String("Heart Rate:"), 535, 290);
			 g.drawString(new String(off), 660, 290);
			 g.setColor(Color.green);
			 g.fillRect(790, 217, 15, 15);
			 g.setColor(Color.black);
			 g.fillRect(792, 219, 11, 11);
				
			 g.setColor(Color.pink);
		     g.drawString(new String("Respiratory:"),535, 315);
			 g.drawString(new String(off), 660, 315);
			 g.setColor(Color.green);
			 g.fillRect(790, 247, 15, 15);
			 g.setColor(Color.black);
			 g.fillRect(792, 249, 11, 11);	
			 
			 g.setColor(Color.pink);
			 g.drawString(new String("SpO2:"),535, 340);
			 g.drawString(new String(off), 660, 340);
			 g.setColor(Color.green);
			 g.fillRect(790, 277, 15, 15);
			 g.setColor(Color.black);
			 g.fillRect(792, 279, 11, 11);
			 
			 g.setColor(Color.pink);
			 g.drawString(new String("BP Systolic:"),535, 365);
			 g.drawString(new String(off), 660, 365);
			 g.setColor(Color.green);
			 g.fillRect(790, 307, 15, 15);
			 g.setColor(Color.black);
			 g.fillRect(792, 309, 11, 11);
			 
			 g.setColor(Color.pink);
			 g.drawString(new String("BP Diastolic:"),535, 390);
			 g.drawString(new String(off), 660, 390);
			 g.setColor(Color.green);
			 g.fillRect(790, 337, 15, 15);
			 g.setColor(Color.black);
			 g.fillRect(792, 339, 11, 11);
			 
			 g.setColor(Color.pink);
			 g.drawString(new String("Temperature:"),535, 415);
			 g.drawString(new String(off), 660, 415);
			 g.setColor(Color.green);
			 g.fillRect(790, 367, 15, 15);
			 g.setColor(Color.black);
			 g.fillRect(792, 369, 11, 11);
			 
			 
		 }
		
		 g.setColor(Color.blue); 
		 //draw the ECG 
		 Graphics2D g2=(Graphics2D)g;
		 Path2D.Double path = new Path2D.Double();
		 
		 double[] currentVal = new double [12] ;
				 
		 for(int i = 0; i < 12; i++) 
		 {
			 currentVal [i]=Math.random();
		 }
		// loop through ECG values draw ECG line with the path
		 path.moveTo(70,215-(currentVal[0]*200));
		 for(int i = 0; i < currentVal.length; i++) 
		 {
			 path.lineTo((i+1)*60+10, 215 - (currentVal[i]*200));	                                                 
		 }
		 g2.draw(path);
		 
		 
	}
}
