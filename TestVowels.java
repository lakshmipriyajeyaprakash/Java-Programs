package pack4;
import java.util.Scanner;

public class TestVowels {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter your Input String:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int result=testVowels(s1);
		if(result==1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		System.out.println("Program Ends");
		
		
	}
	public static int testVowels(String s1) {
		int i=0;
		if(s1.contains("a")||s1.contains("e")||s1.contains("i")
				||s1.contains("o")||s1.contains("u")) {
			i=1;
			}
		return i;
		
	}

}

