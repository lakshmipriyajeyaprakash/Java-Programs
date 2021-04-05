package pack7;
import java.util.Scanner;

public class MaxVowels {
	public static void main(String[] args) {
		System.out.println("Program Starts.....");
        System.out.println("Enter the Input String:");
        Scanner sc1=new Scanner(System.in);
        String a =sc1.nextLine();
        if(a.length()<=100) {
        getWordWithMaximumVowels(a);
        }
        else {
        	System.out.println("Input String Exceeded");
        }
        System.out.println("Program Ends......");
	}
	public static void getWordWithMaximumVowels(String b) {
		String a1=null;
		String b1=null;
		int count=0;
		int temp=0;
		int temp1=0;
		String[] s1=b.split(" ");
		for(int i=0;i<s1.length;i++) {
		    a1=s1[i];
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
			if(temp>temp1) {
			temp1=temp;
			b1=a1;
			}
			count=0;
			temp=0;
			}
		System.out.println("Word with Maximum Vowels="+b1+":"+temp1);
		
	}
	}
  

