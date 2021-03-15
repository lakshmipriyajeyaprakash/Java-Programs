package pack2;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
	System.out.println("Program Starts");
	
	System.out.println("Enter ArraySize:");
	Scanner sc1=new Scanner(System.in);
	int n=sc1.nextInt();
	int a[]=new int[n];
	System.out.println("Enter numbers:");
	Scanner sc=new Scanner(System.in);
	for(int x=0;x<a.length;x++) {
		int d=sc.nextInt();
		a[x]=d;
	}
	 reversenumber(a,n);
	 System.out.println("Program ends");
	}
	public static void reversenumber(int[] a1,int n1) {
		int i, k, t; 
        for (i = 0; i<n1/2;i++) { 
            t = a1[i]; 
            a1[i] = a1[n1-i-1]; 
            a1[n1-i-1] = t; 
        } 
  
        
        System.out.println("Reversed array is:"); 
        for (k = 0; k < n1; k++) { 
            System.out.println(a1[k]); 
        } 
			
			
		}
		
		 
		
		
		}
		
		
		
	
	

