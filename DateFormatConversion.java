package Pack8;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatConversion {
	public static void main(String[] args) {
		System.out.println("Program Starts........");
		System.out.println("Enter the Input String:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		convertDateFormat(input);
		System.out.println("Program Ends.........");
	}
	public static void convertDateFormat(String s1) {
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date=format.parse(s1);
			SimpleDateFormat format1=new SimpleDateFormat("dd-MM-yy");
			String date1=format1.format(date);
			System.out.println(date1);
			
		}
		catch(ParseException e) {
			System.out.println("Invalid Format");
		}
	}
	

}
