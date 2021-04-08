package Pack8;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Validdate {
	public static void main(String[] args) {
		System.out.println("Program Starts........");
		System.out.println("Enter the Input String:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int result=validateDate(input);
		if(result==1) {
			System.out.println("Valid Date");
		}
		else {
			System.out.println("InValid Date");
		}
		System.out.println("Program Ends........");
	}
	public static int validateDate(String s1) {
		int i=-1;
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format1=new SimpleDateFormat("dd.MM.yyyy");
		SimpleDateFormat format2=new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date date=format.parse(s1);
			i=1;
			}
		catch(ParseException e) {
			
			
		}
		try {
			Date date=format1.parse(s1);
			i=1;
			}
		catch(ParseException e) {
		}
		try {
			Date date=format2.parse(s1);
			i=1;
			}
		catch(ParseException e) {
		}
		return i;
	}

}
