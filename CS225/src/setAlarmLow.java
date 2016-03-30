/*
 * Written by: Jun Ma Student ID:1740019 section: 01
 * CS 225 fall 2011
 * Final Project
 * Class Name: setAlarmLow
 * Class Description: This class is for setting the low alarm parameters by using the JSlider.
 * When the setAlarmLow button is pressed, a new frame will be generated and user can slide the 
 * slider. In a word, this class is the supporting class for the class FinalProject.
*/
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class setAlarmLow extends JFrame
{
	JLabel label;
	JButton button;
	private static int heartRate_Data_h = 50; 
	private static int Respiratory_Data_h = 60; 
	private static int SpO2D_Data_h = 80;
	private static int BPSystolic_Data_h = 90; 
	private static int BPDiastolic_Data_h = 60;
	private static int Temperature_Data_h = 90;
	
	public setAlarmLow()
	{
		JPanel p1 = new JPanel(new GridLayout(12,1));
		//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JSlider heartRateh = new JSlider(JSlider.HORIZONTAL,40,80,heartRate_Data_h);
		JSlider Respiratoryh = new JSlider(JSlider.HORIZONTAL,0,120,Respiratory_Data_h);
		JSlider SpO2h = new JSlider(JSlider.HORIZONTAL,0,120,SpO2D_Data_h);
		JSlider BPSystolich = new JSlider(JSlider.HORIZONTAL,10,100,BPSystolic_Data_h);
		JSlider BPDiastolich = new JSlider(JSlider.HORIZONTAL,10,80,BPDiastolic_Data_h);
		JSlider Temperatureh = new JSlider(JSlider.HORIZONTAL,90,100,Temperature_Data_h);
		
		//to initialize and modify the 6 sliders
		heartRateh.setMajorTickSpacing(10);         
		heartRateh.setMinorTickSpacing(1);         
		heartRateh.setPaintTicks(true);         
		heartRateh.setPaintLabels(true);
		
		Respiratoryh.setMajorTickSpacing(10);         
		Respiratoryh.setMinorTickSpacing(1);         
		Respiratoryh.setPaintTicks(true);         
		Respiratoryh.setPaintLabels(true);
		
		SpO2h.setMajorTickSpacing(10);         
		SpO2h.setMinorTickSpacing(1);         
		SpO2h.setPaintTicks(true);         
		SpO2h.setPaintLabels(true);
		
		BPSystolich.setMajorTickSpacing(10);         
		BPSystolich.setMinorTickSpacing(1);         
		BPSystolich.setPaintTicks(true);         
		BPSystolich.setPaintLabels(true);
		
		BPDiastolich.setMajorTickSpacing(10);         
		BPDiastolich.setMinorTickSpacing(1);         
		BPDiastolich.setPaintTicks(true);         
		BPDiastolich.setPaintLabels(true);
		
		Temperatureh.setMajorTickSpacing(1);         
		Temperatureh.setMinorTickSpacing(1);         
		Temperatureh.setPaintTicks(true);         
		Temperatureh.setPaintLabels(true);
		
		//add some instruction on the slider frame
		p1.add(new JLabel("     Heart Rate"));
		p1.add(heartRateh);
		p1.add(new JLabel("     Respiratory"));
		p1.add(Respiratoryh);
		p1.add(new JLabel("     SpO2"));
		p1.add(SpO2h);
		p1.add(new JLabel("     BP Systolic"));
		p1.add(BPSystolich);
		p1.add(new JLabel("     BP Diastolic"));
		p1.add(BPDiastolich);
		p1.add(new JLabel("     Temperature"));
		p1.add(Temperatureh);
		add(p1);
		//to handle the slider listener for the 6 vital sliders
		heartRateh.addChangeListener(new ChangeListener() {
        public void stateChanged(ChangeEvent e) {
        	JSlider source = (JSlider)e.getSource();
        	heartRate_Data_h = (int)source.getValue();
        }
		});
		Respiratoryh.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
	        	JSlider source = (JSlider)e.getSource();
	        	Respiratory_Data_h = (int)source.getValue();
	        }
			});
		SpO2h.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
	        	JSlider source = (JSlider)e.getSource();
	        	SpO2D_Data_h = (int)source.getValue();
	        }
			});
		BPSystolich.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
	        	JSlider source = (JSlider)e.getSource();
	        	BPSystolic_Data_h = (int)source.getValue();
	        }
			});
		BPDiastolich.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
	        	JSlider source = (JSlider)e.getSource();
	        	BPDiastolic_Data_h = (int)source.getValue();
	        }
			});
		Temperatureh.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
	        	JSlider source = (JSlider)e.getSource();
	        	Temperature_Data_h = (int)source.getValue();
	        }
			});
	}
	
	//banch of getters and setters
	public static int getHeartRate_Data_h() {
		return heartRate_Data_h;
	}

	public static void setHeartRate_Data_h(int heartRate_Data_h) {
		setAlarmLow.heartRate_Data_h = heartRate_Data_h;
	}

	public static int getRespiratory_Data_h() {
		return Respiratory_Data_h;
	}

	public static void setRespiratory_Data_h(int respiratory_Data_h) {
		Respiratory_Data_h = respiratory_Data_h;
	}

	public static int getSpO2D_Data_h() {
		return SpO2D_Data_h;
	}

	public static void setSpO2D_Data_h(int spO2D_Data_h) {
		SpO2D_Data_h = spO2D_Data_h;
	}

	public static int getBPSystolic_Data_h() {
		return BPSystolic_Data_h;
	}

	public static void setBPSystolic_Data_h(int bPSystolic_Data_h) {
		BPSystolic_Data_h = bPSystolic_Data_h;
	}

	public static int getBPDiastolic_Data_h() {
		return BPDiastolic_Data_h;
	}

	public static void setBPDiastolic_Data_h(int bPDiastolic_Data_h) {
		BPDiastolic_Data_h = bPDiastolic_Data_h;
	}

	public static int getTemperature_Data_h() {
		return Temperature_Data_h;
	}

	public static void setTemperature_Data_h(int temperature_Data_h) {
		Temperature_Data_h = temperature_Data_h;
	}
}
