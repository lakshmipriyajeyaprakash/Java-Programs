package pack9;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Differencebetweentwodays {
	public static void main(String[] args) {
		System.out.println("Program Starts.........");
		System.out.println("Enter the First Input String:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("Enter the Second Input String: ");
		Scanner sc1=new Scanner(System.in);
		String input1=sc1.nextLine();
		differencebetweentwodays(input,input1);
		System.out.println("Program Ends...........");
		}
	public static void differencebetweentwodays(String s1,String s2) {
		LocalDate date=LocalDate.parse(s1);
		LocalDate date1=LocalDate.parse(s2);
		long day=date.getDayOfMonth();
		long day1=date1.getDayOfMonth();
		LocalDate resultday=date.minusDays(day1);
		System.out.println(resultday.getDayOfMonth());
		
	}

}
