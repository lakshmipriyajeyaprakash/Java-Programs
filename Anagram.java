package pack9;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		System.out.println("Enter the First String:");
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		System.out.println("Enter the Second String:");
		Scanner sc1=new Scanner(System.in);
		String input2=sc1.nextLine();
		int result=getAnagrams(input1,input2);
		if(result==1) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
		
	}
	public static int getAnagrams(String s1,String s2) {
		int i=0;
		int count=0;
		int count1=0;
		int k=-1;
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
			k=1;
			
		}
		else {
			k=-1;
		}
	}
		return k;
	}
	}
