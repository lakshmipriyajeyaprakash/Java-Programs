package pack10;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DayOfWeek2 {
	public static void main(String[] args) {
		System.out.println("Program Starts..............");
		System.out.println("Enter the Input String:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		getDayOfWeek(input);
		System.out.println("Program Ends................");
	}
	public static void getDayOfWeek(String s1) {
		SimpleDateFormat dateformat=new SimpleDateFormat("DD/MM/YYYY");
		try {
			Date date=dateformat.parse(s1);
			SimpleDateFormat dateformat1=new SimpleDateFormat("EEEE");
			String day=dateformat1.format(date.getDay());
			String firstletterofday=day.substring(0,1);
			firstletterofday=firstletterofday.toLowerCase();
			String formattedday=day.substring(1,day.length());
			System.out.println(firstletterofday.concat(formattedday));
			
		}
		catch(ParseException e) {
			System.out.println("Invalid Format");
		}
	}

}
