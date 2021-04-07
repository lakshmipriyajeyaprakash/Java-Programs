package Pack8;
import java.util.Scanner;

public class AllVowels {
	public static void main(String[] args) {
		System.out.println("Program Starts......");
		System.out.println("Enter the Input String:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int count=testOrderVowels(input);
		if(count==5) {
			System.out.println("Valid");
		}
		else {
		System.out.println("InValid");
		}
		System.out.println("Program Ends.......");
	}
	public static int testOrderVowels(String s1) {
		int count=0;
		if(s1.contains("a")){
			count++;
		}
		if(s1.contains("e")){
			count++;
		}
		if(s1.contains("i")){
			count++;
		}
		if(s1.contains("o")){
			count++;
		}
		if(s1.contains("u")){
			count++;
		}
		System.out.println(count);
		return count;
	}

}
