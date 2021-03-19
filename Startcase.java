package pack3;
import java.util.Scanner;
import java.time.*;

public class Startcase {
	public static void main(String[] args) {
	System.out.println("Program Starts");
	System.out.println("Enter String:");
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String sb1=startcase(s1);
	System.out.println(sb1);
	System.out.println("Program Ends");
	
	
	
	}
	public static String startcase(String s2) {
	String []s3=s2.split("//s");
	StringBuilder sb=new StringBuilder();

    for (String s: s3) {
        if (!s.equals("")) {
            sb.append(Character.toUpperCase(s.charAt(0)));
            sb.append(s.substring(1));
        }
        sb.append(" ");
    }
    return sb.toString().trim();

     
	
		 
		     
		
	}
	

}
