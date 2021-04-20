package pack10;
import java.util.Scanner;

public class Anagrams2 {
	public static void main(String[] args) {
		System.out.println("Program Starts..............");
		System.out.println("Enter the First String:");
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		System.out.println("Enter the Second String:");
		Scanner sc1=new Scanner(System.in);
		String input2=sc1.nextLine();
		input1=input1.replaceAll("\\s", "");
		input2=input2.replaceAll("\\s", "");
		boolean result=getAnagrams2(input1,input2);
		if(result==true) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
		System.out.println("Program Ends...............");
		
	}
	public static boolean getAnagrams2(String s1,String s2) {
		int i=0;
		int count=0;
		int count1=0;
		boolean k=false;
		if(s1.length()==s2.length()) {
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			for( i=0;i<c1.length;i++) {
				for(int j=0;j<c2.length;j++) {
					if(c1[i]==c2[j]) {
					count++;
						}
					else {
					count1++;
					}
				}
			}
		if(count!=count1) {
			k=true;
			
		}
		else {
			k=false;
		}
	}
		return k;
	}
	}


