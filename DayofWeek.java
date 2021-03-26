package pack6;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayofWeek {
	public static void main(String[] args) {
		System.out.println("Program Starts......");
		System.out.println("Enter the Input String:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		getday(s1);
		System.out.println("Program Ends........");
		
	}
	public static void getday(String s2) {
		if(s2.matches("[0-9]{2}[-]{1}[0-9]{2}[-][0-9]{4}")){
			SimpleDateFormat date=new SimpleDateFormat("MM-dd-yyyy");
			SimpleDateFormat dateformat=new SimpleDateFormat("EEEE");
		    try {
			    Date parsedate=date.parse(s2);
			    System.out.println(dateformat.format(parsedate));
			    } 
			catch (ParseException e) {
			   System.out.println("Exception");
			}
			}
			else 
			  System.out.println("Invalid Format");
			
			}
	}


