package pack7;
import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		System.out.println("Program Starts.......");
		System.out.println("Enter the Input String:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		maxVowelWord(input);
		System.out.println("Program Ends.........");
	}
	public static void maxVowelWord(String s1) {
		int count=0;
		int temp=0;
		int temp1=0;
		String[] s2=s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			String a1=s2[i];
			if(a1.contains("a")||a1.contains("A")) {
				temp=++count;
				
				
			}
			if(a1.contains("e")||a1.contains("E")) {
				temp=++count;
				
				
			}
			if(a1.contains("i")||a1.contains("I")) {
				temp=++count;
				
				
			}
			if(a1.contains("o")||a1.contains("O")) {
				temp=++count;
				
			}
			if(a1.contains("u")||a1.contains("U")) {
				temp=++count;
			}
			System.out.println(a1+":"+temp);
			count=0;
			
		}
		 temp1=temp;
		    if(temp1>temp) {
		    	System.out.println(temp1);
		    }
		    else {
		    	System.out.println(temp);
		    	}
		
	}

}
