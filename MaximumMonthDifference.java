package Pack8;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MaximumMonthDifference {
	public static void main(String[] args) {
		System.out.println("Program Starts......");
		System.out.println("Enter the First Input String:");
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		System.out.println("Enter the Second Input String:");
		Scanner sc1=new Scanner(System.in);
		String input2=sc1.nextLine();
		getMonthDifference(input1,input2);
		System.out.println("Program Ends......");
	}
	public static void getMonthDifference(String s1,String s2) {
		LocalDate date1=LocalDate.parse(s1);
		int year1=date1.getYear();
		date1=date1.minusMonths(1);
		LocalDate date2=LocalDate.parse(s2);
		int year2=date2.getYear();
		date2=date2.minusMonths(1);
		if(year1==year2) {
		Period p=Period.between(date1,date2);
		System.out.println(p);
		}
		else {
			Period p=Period.between(date1,date2);
			int i=p.getMonths()+12;
			System.out.println(i);
		}
			
		}

}
