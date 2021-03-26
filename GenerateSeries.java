package pack6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateSeries {
	public static void main(String[] args) {
		System.out.println("Program Starts.....");
		System.out.println("Enter the N Value:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=addSeries(n);
		System.out.println(result);
		System.out.println("Program Ends......");
	}
	public static int addSeries(int n1) {
		 List<Integer> l1 = new ArrayList<Integer>();
		 for (int i = 1; i <= n1; i++)
		      if (i % 2 != 0)
		        l1.add(i);
		    int n2 = l1.get(0);
		    for (int i = 1; i < l1.size(); i++)
		      if (i % 2 != 0)
		        n2 = n2 + l1.get(i);
		      else
		        n2 = n2 - l1.get(i);
		    return n2;
	}

}
