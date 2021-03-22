package Pack5;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePAN {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		validatePAN(s);
		System.out.println("Program Ends");
		
	}
	public static void validatePAN(String s1) {
		
		String s3=s1.substring(3,7);
		boolean result=validatenumber(s3);
		if(result==true) {
			patternmatching(s1,s3);
		}
	    
		
	}
	public static boolean validatenumber(String y){
		try {
		
			int i=Integer.parseInt(y);
			}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
		return true;
		
	}
	public static void patternmatching(String z,String w) {
		String s2=z.substring(0,3).toUpperCase();
		String s4=z.substring(z.length()-1).toUpperCase();
		String s5=s2+w+s4;
		Pattern pattern = Pattern.compile(s5);
	    Matcher matcher = pattern.matcher(z);
	    if(matcher.find()==true) {
	    	System.out.println("valid format");
	    }
	    else {
	    	System.out.println("Invalid format");
	    }
	    
		
	}

}
