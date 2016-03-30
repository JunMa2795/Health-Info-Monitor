/*
 * Written by: Jun Ma Student ID:1740019 section: 01
 * CS 225 fall 2011
 * Final Project
 * Class Name: read
 * Class Description: This class is for reading the patient's vital data and patient 
 * information from the two files repectively.
 */
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class read
{
	private static String IDnum = "";
	private static String name = "";
	private static String age = "";
	private static String gender = "";
	private static String roomNo = "";
	private static String heart = "";
	private static String respiratory = "";
	private static String SpO2 = "";
	private static String BP_s = "";
	private static String BP_d = "";
	private static String temp = "";
	read()throws IOException
	{
		//to create File objects
		File userInfo = new File("userCondition.txt");
		File userCon = new File("vitalData.txt");
		//to create Scanner objects
		Scanner scan1 = new Scanner(userInfo);
		Scanner scan2 = new Scanner(userCon);
		//to read data from the file 
		this.IDnum = scan1.next();
		this.name = scan1.next();
		this.age = scan1.next();
		this.gender = scan1.next();
		this.roomNo = scan1.next();
		scan1.close();
		this.heart = scan2.next();
		this.respiratory = scan2.next();
		this.SpO2 = scan2.next();
		this.BP_s = scan2.next();
		this.BP_d = scan2.next();
		this.temp = scan2.next();
		scan2.close();
	}
	
	public static String getIDnum() {
		return IDnum;
	}
	public static void setIDnum(String iDnum) {
		IDnum = iDnum;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		read.name = name;
	}
	public static String getAge() {
		return age;
	}
	public static void setAge(String age) {
		read.age = age;
	}
	public static String getGender() {
		return gender;
	}
	public static void setGender(String gender) {
		read.gender = gender;
	}
	public static String getRoomNo() {
		return roomNo;
	}
	public static void setRoomNo(String roomNo) {
		read.roomNo = roomNo;
	}
	public static String getHeart() {
		return heart;
	}
	public static void setHeart(String heart) {
		read.heart = heart;
	}
	public static String getRespiratory() {
		return respiratory;
	}
	public static void setRespiratory(String respiratory) {
		read.respiratory = respiratory;
	}
	public static String getSpO2() {
		return SpO2;
	}
	public static void setSpO2(String spO2) {
		SpO2 = spO2;
	}
	public static String getBP_s() {
		return BP_s;
	}
	public static void setBP_s(String bP_s) {
		BP_s = bP_s;
	}
	public static String getBP_d() {
		return BP_d;
	}
	public static void setBP_d(String bP_d) {
		BP_d = bP_d;
	}
	public static String getTemp() {
		return temp;
	}
	public static void setTemp(String temp) {
		read.temp = temp;
	}
}
