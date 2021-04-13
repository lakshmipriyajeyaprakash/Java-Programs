package pack9;
import java.util.Scanner;

public class FileExtension {
	public static void main(String[] args) {
		System.out.println("Program Starts.......");
		System.out.println("Enter the File Name:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String result=fileIdentifier(input);
		System.out.println("Extension of the file is:"+result);
		System.out.println("Program Ends.........");
	}
	public static String fileIdentifier(String s1) {
		char[] c1=s1.toCharArray();
		String s2=" ";
		int i=0;
		for(i=0;i<c1.length;i++) {
			if(c1[i]=='.') {
				System.out.println(c1[i]);
				System.out.println(i);
			    s2=s1.substring(i+1,s1.length());
				break;
				}
			}
		return s2;
		
	}
	
}
		
