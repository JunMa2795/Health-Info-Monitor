/*
 * Written by: Jun Ma Student ID:1740019 section: 01
 * CS 225 fall 2011
 * Final Project
 * Class Name: FinalProject
 * Class Description: This class is for the main frame of user interface and also 
 * contains the main method, banch of listeners, the panels and timer. This class 
 * is regarded as the soul of this project. 
 * 
 * 
 * 
 * Lalalalalalalalalalalahahahahahahahahah
 * 
 * Today, I am using it for testing GitHub
*/
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.Timer;
public class FinalProject extends JFrame
{
	//to get the demenssion of the current screen
	Toolkit kit = Toolkit.getDefaultToolkit() ;
	Dimension screenSize = kit.getScreenSize() ;
	//to set the size of the main frame
	int screenWidth = screenSize.width ;
	int screenHeight = screenSize.height ;
	int width = screenWidth*3/4 ;
	int height = screenHeight*3/4 ;
	//to contrl the clear button 
	public static boolean clear = false;
	public static boolean cc = false;
	public JPanel p1 = new JPanel(new BorderLayout());
	public JPanel p2 = new JPanel(new BorderLayout());
	public JPanel p3 = new JPanel(new BorderLayout());
	public JButton b1 = new JButton("Clear Alarm");
    public JButton b2 = new JButton("Set Alarm-H");
    public JButton b3 = new JButton("Set Alarm-L");	
	public FinalProject()
	{	
		//to add some panels on the main frame
	    p2.add(b1,BorderLayout.NORTH);
        p2.add(b2,BorderLayout.CENTER);
        p2.add(b3,BorderLayout.SOUTH);
        p3.add(p2,BorderLayout.SOUTH);
        p3.add(new EastGraphic(),BorderLayout.CENTER);
        p1.add(new DataGraphic(),BorderLayout.CENTER);
        p1.add(p3,BorderLayout.EAST);
        add(p1,BorderLayout.CENTER);

        //to add menu bar on the top of the window
		JMenuBar menuBar = new JMenuBar();
      
        // Add the menubar to the frame
        setJMenuBar(menuBar);
        
        // Define and add two drop down menu to the menubar
        JMenu fileMenu = new JMenu("File");
        JMenu opMenu = new JMenu("Option");
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(opMenu);
        menuBar.add(helpMenu);
        
        // Create and add simple menu item to one of the drop down menu
        JMenuItem exitAction = new JMenuItem("Close");
        JMenuItem setDataAction = new JMenuItem("Set Vital Data");
        JMenuItem saveDataAction = new JMenuItem("Save Vital Data");
        JMenuItem setAlarmHAction = new JMenuItem("Set Alarm High");
        JMenuItem setAlarmLAction = new JMenuItem("Set Alarm Low");
        JMenuItem clearAlarmAction = new JMenuItem("Clear Alarms");
        JMenuItem saveAlarmStatusAction = new JMenuItem("Save Alarm Status");
 
        // Create a ButtonGroup and add both radio Button to it. Only one radio
        // button in a ButtonGroup can be selected at a time.
        fileMenu.add(exitAction);
        opMenu.add(setDataAction);
        opMenu.add(saveDataAction);
        opMenu.add(setAlarmHAction);
        opMenu.add(setAlarmLAction);
        opMenu.add(setDataAction);
        opMenu.add(clearAlarmAction);
        opMenu.add(saveAlarmStatusAction);
  
        //set listener of the File->Close
        exitAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	System.exit(0);
            }
        });

        //set listener of the button Set Alarm-H 
        ActionListener SetAHighListener = new alarmHighListener();
        b2.addActionListener(SetAHighListener);
        setAlarmHAction.addActionListener(SetAHighListener);
        
        //set listener of the button Set Alarm-L
        ActionListener SetALowListener = new alarmLowListener();
        b3.addActionListener(SetALowListener);
        setAlarmLAction.addActionListener(SetALowListener);
        
        //set listener of the button Set Vital Data
        ActionListener SetVitalListener = new vitalListener();
        setDataAction.addActionListener(SetVitalListener);
        
        //set listener of the button Save Vital Data
        ActionListener SaveVitalDataListener = new saveVitaDataListener();
        saveDataAction.addActionListener(SaveVitalDataListener);
        
        //set listener of the button Save Alarm Status
        ActionListener SavaAlarmStatusListener= new saveAlarmStatusListener();
       saveAlarmStatusAction.addActionListener(SavaAlarmStatusListener);
        
        //set listener of the timer 
        Timer timer = new Timer(300, new TimerListener1());
        timer.start();
        
        Timer mytimer = new Timer(3000, new TimerListener2());
		mytimer.start();
        
		//set listener of the button Clear Alarms
		ActionListener ClearAlarmListener = new clearAlarmListener();
		clearAlarmAction.addActionListener(ClearAlarmListener);
		b1.addActionListener(ClearAlarmListener);
		
    }
	
	public static void main(String[] args) throws Exception
	{
		//generate the object of the main frame
		FinalProject frame = new FinalProject(); 
		frame.setUndecorated(true);
		frame.setTitle("Healthy Vision Monitor (HVM)");
		frame.setSize(frame.width,frame.height);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
	    frame.setResizable(false);
	    read r = new read();
	    
	    //assign the data to the variables
		setData.setHeartRate_Data(Integer.parseInt(read.getHeart())); 
		setData.setRespiratory_Data(Integer.parseInt(read.getRespiratory())); 
		setData.setSpO2D_Data(Integer.parseInt(read.getSpO2()));
		setData.setBPSystolic_Data(Integer.parseInt(read.getBP_s())); 
		setData.setBPDiastolic_Data(Integer.parseInt(read.getBP_d()));
		setData.setTemperature_Data(Integer.parseInt(read.getTemp()));
	}
	
	 private class alarmHighListener implements ActionListener
     {
     	public void actionPerformed(ActionEvent e)
     	{
     		//generate a new frame to set the alarm high
     		clear = false;
     		cc = false;
     		setAlarmHigh frame1 = new setAlarmHigh();
     		frame1.setUndecorated(true);
     		frame1.setTitle("Set Alarm High");
     		frame1.setSize(800,600);
     		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     		frame1.setLocationRelativeTo(null);
     		frame1.setVisible(true);
     		frame1.getRootPane().setWindowDecorationStyle(JRootPane.COLOR_CHOOSER_DIALOG);
     		repaint();
     	}
     }
	
	 private class alarmLowListener implements ActionListener
     {
     	public void actionPerformed(ActionEvent e)
     	{
     		//generate a new frame to set the alarm low
     		//to hold the contrl of the Clear button
     		clear = false;
     		cc = false;
     		setAlarmLow frame2 = new setAlarmLow();
     		frame2.setUndecorated(true);
     		frame2.setTitle("Set Alarm Low");
     		frame2.setSize(800,600);
     		frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     		frame2.setLocationRelativeTo(null);
     		frame2.setVisible(true);
     		frame2.getRootPane().setWindowDecorationStyle(JRootPane.COLOR_CHOOSER_DIALOG);
     		repaint();
     	}
     }
	 
	 private class vitalListener implements ActionListener
	 {
		 public void actionPerformed(ActionEvent e)
		 {
			//generate a new frame to set the vital data
			//to hold the contrl of the Clear button
			clear = false;
	     	cc = false;
			setData frame3 = new setData();
	     	frame3.setUndecorated(true);
	     	frame3.setTitle("Set Vital Data");
	     	frame3.setSize(800,600);
	     	frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	     	frame3.setLocationRelativeTo(null);
	     	frame3.setVisible(true);
	     	frame3.getRootPane().setWindowDecorationStyle(JRootPane.COLOR_CHOOSER_DIALOG);
	     	repaint();
		 }
	 }
	 

	 private class clearAlarmListener implements ActionListener
	 {
		 public void actionPerformed(ActionEvent e)
		 {
		     //to release the contrl of the Clear button
			 clear = true;
			 cc = true;
			 repaint();
		 }
	 }
	 
	 private class saveVitaDataListener implements ActionListener
	 {
		 public void actionPerformed(ActionEvent e)
		 {
			//to save the data and invoke the save class to generate files for vital data
			 try {
				save.saveVitalData();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 String output1 = "Current Vital Data is saved in file \"saveVitalData.txt\" !";
			 JOptionPane.showMessageDialog(null,output1);
		 }
	 }
	 
	 private class saveAlarmStatusListener implements ActionListener
	 {
		 public void actionPerformed(ActionEvent e)
		 {
			//to save the data and invoke the save class to generate files for alarm status
			 try {
				save.saveAlarmStatus();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 String output2 = "Current Alarm Status is saved in file \"saveAlarmStatus.txt\" !";
			 JOptionPane.showMessageDialog(null,output2);
		 }
	 }
	 
	 private class TimerListener1 implements ActionListener 
	 {
		  /** Handle the action event */
		 public void actionPerformed(ActionEvent e) 
		 {
             repaint();
		 }
	 }
	 
	 private class TimerListener2 implements ActionListener 
	 {
		  /** Handle the action event */
		 public void actionPerformed(ActionEvent e) 
		 {
             repaint();
		 }
	 }
	     	
}
