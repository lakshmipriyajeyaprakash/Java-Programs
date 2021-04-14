package pack9;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NextYearDay {
	public static void main(String[] args) {
		System.out.println("Program Starts.........");
		System.out.println("Enter the Input Date:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		nextYearDay(input);
		System.out.println("Program Ends...........");
	}
	public static void nextYearDay(String s1) {
		SimpleDateFormat dateformat=new SimpleDateFormat("dd/mm/yyyy");
		try {
			Date date=dateformat.parse(s1);
			int year=date.getYear();
			int nextyear=year+1;
			SimpleDateFormat dateformat1=new SimpleDateFormat("EEEE");
			Date date1=new Date();
			date1.setDate(date.getDate());
			date1.setMonth(date.getMonth());
			date1.setYear(nextyear);
		    System.out.println(dateformat1.format(date1));
		  }
		catch(ParseException e) {
			System.out.println("Invalid Format");
			
		}
		
	}

}
