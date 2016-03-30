/*
 * Written by: Jun Ma Student ID:1740019 section: 01
 * CS 225 fall 2011
 * Final Project
 * Class Name: setData
 * Class Description: This class is for setting the vital data by using the JSlider.
 * When the set Vital Data button is pressed, a new frame will be generated and user 
 * can slide the slider. In a word, this class is the supporting class for the class 
 * FinalProject.
*/
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class setData extends JFrame
{
	JLabel label;
	JButton button;
	private static int heartRate_Data = 40; 
	private static int Respiratory_Data = 0; 
	private static int SpO2D_Data = 0;
	private static int BPSystolic_Data = 10; 
	private static int BPDiastolic_Data = 10;
	private static int Temperature_Data = 90;
	
	

	public setData()
	{	
		JPanel p1 = new JPanel(new GridLayout(12,1));
		//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JSlider heartRate = new JSlider(JSlider.HORIZONTAL,40,120,heartRate_Data);
		JSlider Respiratory = new JSlider(JSlider.HORIZONTAL,0,120,Respiratory_Data);
		JSlider SpO2 = new JSlider(JSlider.HORIZONTAL,0,120,SpO2D_Data);
		JSlider BPSystolic = new JSlider(JSlider.HORIZONTAL,10,180,BPSystolic_Data);
		JSlider BPDiastolic = new JSlider(JSlider.HORIZONTAL,10,140,BPDiastolic_Data);
		JSlider Temperature = new JSlider(JSlider.HORIZONTAL,90,120,Temperature_Data);
		
		//to initialize and modify the 6 sliders 
		heartRate.setMajorTickSpacing(5);         
		heartRate.setMinorTickSpacing(1);         
		heartRate.setPaintTicks(true);         
		heartRate.setPaintLabels(true);
		
		Respiratory.setMajorTickSpacing(10);         
		Respiratory.setMinorTickSpacing(1);         
		Respiratory.setPaintTicks(true);         
		Respiratory.setPaintLabels(true);
		
		SpO2.setMajorTickSpacing(10);         
		SpO2.setMinorTickSpacing(1);         
		SpO2.setPaintTicks(true);         
		SpO2.setPaintLabels(true);
		
		BPSystolic.setMajorTickSpacing(10);         
		BPSystolic.setMinorTickSpacing(1);         
		BPSystolic.setPaintTicks(true);         
		BPSystolic.setPaintLabels(true);
		
		BPDiastolic.setMajorTickSpacing(10);         
		BPDiastolic.setMinorTickSpacing(1);         
		BPDiastolic.setPaintTicks(true);         
		BPDiastolic.setPaintLabels(true);
		
		Temperature.setMajorTickSpacing(2);         
		Temperature.setMinorTickSpacing(1);         
		Temperature.setPaintTicks(true);         
		Temperature.setPaintLabels(true);
		
		//to add some instruction on the slider frame
		p1.add(new JLabel("     Heart Rate"));
		p1.add(heartRate);
		p1.add(new JLabel("     Respiratory"));
		p1.add(Respiratory);
		p1.add(new JLabel("     SpO2"));
		p1.add(SpO2);
		p1.add(new JLabel("     BP Systolic"));
		p1.add(BPSystolic);
		p1.add(new JLabel("     BP Diastolic"));
		p1.add(BPDiastolic);
		p1.add(new JLabel("     BP Temperature"));
		p1.add(Temperature);
		
		add(p1);
		
		//to handle the slider listener for the 6 vital sliders
		heartRate.addChangeListener(new ChangeListener() {
        public void stateChanged(ChangeEvent e) {
        	JSlider source = (JSlider)e.getSource();
        	heartRate_Data = (int)source.getValue();
        	repaint();
        }
		});
		Respiratory.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
	        	JSlider source = (JSlider)e.getSource();
	        	Respiratory_Data = (int)source.getValue();
	        }
			});
		SpO2.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
	        	JSlider source = (JSlider)e.getSource();
	        	SpO2D_Data = (int)source.getValue();
	        }
			});
		BPSystolic.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
	        	JSlider source = (JSlider)e.getSource();
	        	BPSystolic_Data = (int)source.getValue();
	        }
			});
		BPDiastolic.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
	        	JSlider source = (JSlider)e.getSource();
	        	BPDiastolic_Data = (int)source.getValue();
	        }
			});
		Temperature.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
	        	JSlider source = (JSlider)e.getSource();
	        	Temperature_Data = (int)source.getValue();
	        }
			});

	}
	
	public static int getHeartRate_Data() {
		return heartRate_Data;
	}

	public static void setHeartRate_Data(int heartRate_Data) {
		setData.heartRate_Data = heartRate_Data;
	}

	public static int getRespiratory_Data() {
		return Respiratory_Data;
	}

	public static void setRespiratory_Data(int respiratory_Data) {
		Respiratory_Data = respiratory_Data;
	}

	public static int getSpO2D_Data() {
		return SpO2D_Data;
	}

	public static void setSpO2D_Data(int spO2D_Data) {
		SpO2D_Data = spO2D_Data;
	}

	public static int getBPSystolic_Data() {
		return BPSystolic_Data;
	}

	public static void setBPSystolic_Data(int bPSystolic_Data) {
		BPSystolic_Data = bPSystolic_Data;
	}

	public static int getBPDiastolic_Data() {
		return BPDiastolic_Data;
	}

	public static void setBPDiastolic_Data(int bPDiastolic_Data) {
		BPDiastolic_Data = bPDiastolic_Data;
	}

	public static int getTemperature_Data() {
		return Temperature_Data;
	}

	public static void setTemperature_Data(int temperature_Data) {
		Temperature_Data = temperature_Data;
	}

}
