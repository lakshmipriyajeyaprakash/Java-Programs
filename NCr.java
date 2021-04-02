package pack7;
import java.util.Scanner;

public class NCr {
	public static void main(String[] args) {
		System.out.println("Program Starts........");
		System.out.println("Enter the n Value:");
		Scanner sc=new Scanner(System.in);
		int ninput=sc.nextInt();
		System.out.println("Enter the r Value:");
		Scanner sc1=new Scanner(System.in);
		int rinput=sc1.nextInt();
		calculateNCr(ninput,rinput);
		System.out.println("Program Ends...........");
		
	}
	public static void calculateNCr(int a,int b) {
		int t=0;
		int nprod=1;
		int rprod=1;
		int nrprod=1;
		double ncr=0.0;
		int nfact=0;
		int rfact=0;
		int nrfact=0;
		int r=a;
		int s=b;
		int rnrprod=0;
		if(b>a) {
		 t=b-a;
		}
		else {
			t=a-b;
		}
		int u=t;
		if(a!=0 && b!=0) {
		
		System.out.println("N factorial Elements......");
		for(int i=0;i<a;i++) {
			nfact=r--;
			nprod=nprod*nfact;
			System.out.print(nfact+" ");
			}
		System.out.println();
		System.out.println("N Factorial Elements product.......");
		System.out.println(nprod);
		System.out.println("R factorial Elements......");
		for(int i=0;i<b;i++) {
			rfact=s--;
			rprod=rprod*rfact;
			System.out.print(rfact+" ");
		}
		System.out.println();
		System.out.println("R Factorial Elements Product......");
		System.out.println(rprod);
		System.out.println("N-R Factorial Elements........");
		for(int i=0;i<t;i++) {
			nrfact=u--;
			nrprod=nrprod*nrfact;
			System.out.print(nrfact+" ");
		}
		System.out.println();
		System.out.println("N-R Factorial Elements Product.......");
		System.out.println(nrprod);
		System.out.println("Ncr Result is.......");
		rnrprod=rprod*nrprod;
		ncr=nprod/rnrprod;
		System.out.println(ncr);
		}
		else if(a==0) {
			nprod=1;
			System.out.println("N factorial Element Product:"+nprod);
			System.out.println("R factorial Elements......");
			for(int i=0;i<b;i++) {
				rfact=s--;
				rprod=rprod*rfact;
				System.out.print(rfact+" ");
			}
			System.out.println();
			System.out.println("R Factorial Elements Product......");
			System.out.println(rprod);
			System.out.println("N-R Factorial Elements........");
			for(int i=0;i<t;i++) {
				nrfact=u--;
				nrprod=nrprod*nrfact;
				System.out.print(nrfact+" ");
			}
			System.out.println();
			System.out.println("N-R Factorial Elements Product.......");
			System.out.println(nrprod);
			System.out.println("Ncr Result is.......");
			rnrprod=rprod*nrprod;
			ncr=nprod/rnrprod;
			System.out.println(ncr);
			
			}
		
		else if(b==0) {
			rprod=1;
			System.out.println("R factorial Element Product:"+rprod);
			System.out.println("N factorial Elements......");
			for(int i=0;i<a;i++) {
				nfact=r--;
				nprod=nprod*nfact;
				System.out.print(nfact+" ");
				}
			System.out.println();
			System.out.println("N Factorial Elements product.......");
			System.out.println(nprod);
			System.out.println("Ncr Result is.......");
			rnrprod=rprod*nrprod;
			ncr=nprod/rprod*nrprod;
			System.out.println(ncr);
			}
		
		
	}

}
