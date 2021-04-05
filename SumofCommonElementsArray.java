package pack7;
import java.util.Scanner;

public class SumofCommonElementsArray {
	public static void main(String[] args) {
		System.out.println("Program Starts........");
		System.out.println("Enter the number of Elements in FirstArray:");
		Scanner sc1=new Scanner(System.in);
		int n1=sc1.nextInt();
		int[] a=new int[n1];
		System.out.println("Enter the Elements of First Array:");
		Scanner sc2=new Scanner(System.in);
		for(int i=0;i<n1;i++) {
			a[i]=sc2.nextInt();
			}
		System.out.println("Enter the number of Elements in SecondArray:");
		Scanner sc3=new Scanner(System.in);
		int n2=sc3.nextInt();
		int[] b=new int[n1];
		System.out.println("Enter the Elements of Second Array:");
		Scanner sc4=new Scanner(System.in);
		for(int j=0;j<n1;j++) {
			b[j]=sc3.nextInt();
			}
		int result=getSumOfIntersection(a,b);
		if(result!=-1) {
			System.out.println(result);
		}
		else {
			System.out.println("No Common Elements");
		}
		System.out.println("Program Ends.......");
	}
	public static int getSumOfIntersection(int[] x,int[] y) {
	    int sum = 0;
	    for (int i = 0; i < x.length; i++) {
	      for (int j = 0; j < y.length; j++) {
	        if (x[i] == y[j])
	          sum = sum + x[i];
	      }
	    }
	    if (sum == 0)
	      return -1;
	    else
	      return sum;
		
	}

}
