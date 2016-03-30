/*
 * Written by: Jun Ma Student ID:1740019 section: 01
 * CS 225 fall 2011
 * Final Project
 * Class Name: save
 * Class Description: This class is for saving the current data and patient information
 * which are displaying on the main user interface. The data that saved will generate 
 * 2 files: one is for the current vital data the other is for the current alarm status. 
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class save
{
	save() throws IOException{
	}
	//to generate a new file to save the current alarm status
	public static void saveAlarmStatus() throws FileNotFoundException
	{
	    File saveAS = new File("saveAlarmStatus.txt");
	    PrintWriter outAlarmStatus = new PrintWriter(saveAS);
	    String on = "ON";
	    String off = "OFF";
	    String heartStatus = "";
	    String resStatus = "";
	    String SpO2Status = "";
	    String BPSStatus = "";
	    String BPDStatus = "";
	    String tempStatus = "";
	    //those if statements are for determine the  status
	    if(((setData.getHeartRate_Data()>setAlarmLow.getHeartRate_Data_h())||(setData.getHeartRate_Data()==setAlarmLow.getHeartRate_Data_h()))&&(setData.getHeartRate_Data()<setAlarmHigh.getHeartRate_Data_h()||setData.getHeartRate_Data()==setAlarmHigh.getHeartRate_Data_h()))
		{
            heartStatus = off;
		}
		else
		{
			heartStatus = on;
		}
	    if(((setData.getRespiratory_Data()>setAlarmLow.getRespiratory_Data_h())||(setData.getRespiratory_Data()==setAlarmLow.getRespiratory_Data_h()))&&(setData.getRespiratory_Data()<setAlarmHigh.getRespiratory_Data_h()||setData.getRespiratory_Data()==setAlarmHigh.getRespiratory_Data_h()))
		{
			resStatus = off;	
		}
		else
		{
			resStatus = on;
		}
	    if(((setData.getSpO2D_Data()>setAlarmLow.getSpO2D_Data_h())||(setData.getSpO2D_Data()==setAlarmLow.getSpO2D_Data_h()))&&(setData.getSpO2D_Data()<setAlarmHigh.getSpO2D_Data_h()||setData.getSpO2D_Data()==setAlarmHigh.getSpO2D_Data_h()))
		{
            SpO2Status = off;
		}
		else
		{
			SpO2Status = on;
		}					
	    if(((setData.getBPSystolic_Data()>setAlarmLow.getBPSystolic_Data_h())||(setData.getBPSystolic_Data()==setAlarmLow.getBPSystolic_Data_h()))&&(setData.getBPSystolic_Data()<setAlarmHigh.getBPSystolic_Data_h()||setData.getBPSystolic_Data()==setAlarmHigh.getBPSystolic_Data_h()))
		{
			BPSStatus = off;
		}
		else
		{
			BPSStatus = on;
		}			
		if(((setData.getBPDiastolic_Data()>setAlarmLow.getBPDiastolic_Data_h())||(setData.getBPDiastolic_Data()==setAlarmLow.getBPDiastolic_Data_h()))&&(setData.getBPDiastolic_Data()<setAlarmHigh.getBPDiastolic_Data_h()||setData.getBPDiastolic_Data()==setAlarmHigh.getBPDiastolic_Data_h()))
		{
			BPDStatus = off;
		}
		else
		{
			BPDStatus = on;
		}				
		if(((setData.getTemperature_Data()>setAlarmLow.getTemperature_Data_h())||(setData.getTemperature_Data()==setAlarmLow.getTemperature_Data_h()))&&(setData.getTemperature_Data()<setAlarmHigh.getTemperature_Data_h()||setData.getTemperature_Data()==setAlarmHigh.getTemperature_Data_h()))
		{
			tempStatus = off;
		}
		else
		{
			tempStatus = on;
		}
	    outAlarmStatus.println("        Heart Rate    Respiratory    SpO2       BP Systolic  BP Diastolic  Temperature\n");
	    outAlarmStatus.println("Status  "+heartStatus+"            "+resStatus+"             "+SpO2Status+"         "+BPSStatus+"          "+BPDStatus+"            "+tempStatus);
	    outAlarmStatus.close();
	}
	//to generate a new file to save the current vital data
	public static void saveVitalData() throws FileNotFoundException
	{
	    File saveVital = new File("saveVitalData.txt");
	    PrintWriter outVital = new PrintWriter(saveVital);
	    outVital.println("Heart Rate    Respiratory    SpO2       BP Systolic  BP Diastolic  Temperature\n");
	    outVital.println(setData.getHeartRate_Data()+"            "+setData.getRespiratory_Data()+"             "+
	    setData.getSpO2D_Data()+"         "+setData.getBPSystolic_Data()+"          "+setData.getBPDiastolic_Data()+
	    "            "+setData.getTemperature_Data());
	    outVital.close();
	}
}
