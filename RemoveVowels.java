package pack4;
import java.util.Scanner;

public class RemoveVowels {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter the Input String");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String result=removevowels(s1);
		System.out.println(result);
		System.out.println("Program Ends");
	}
	public static String removevowels(String s2) {
    StringBuffer sb1=new StringBuffer();
     for(int i=0;i<s2.length();i++)
      if((i%2)==0)
      sb1.append(s2.charAt(i));
      else if((i%2)!=0)
       if(s2.charAt(i)!='a' && s2.charAt(i)!='e' && s2.charAt(i)!='i' && s2.charAt(i)!='o' && s2.charAt(i)!='u')
       if(s2.charAt(i)!='A' && s2.charAt(i)!='E' && s2.charAt(i)!='I' && s2.charAt(i)!='O' && s2.charAt(i)!='U')
        sb1.append(s2.charAt(i));
        return sb1.toString();
	}

}
