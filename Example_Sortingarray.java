package Pack5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Example_Sortingarray {
	public static void main(String[] args) {
		System.out.println("Program Stsrts");
		/*Enter the First ArrayList*/
		System.out.println("Enter the First list:");
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> number1=new ArrayList<Integer>();
		
				while(sc.hasNext()) {
					
					Integer i=sc.nextInt();
						number1.add(i);
						if(number1.size()>=5)break;
					}
				
		System.out.println(number1);
		/*Enter the Second ArrayList*/
		System.out.println("Enter the Second list:");
		Scanner sc1=new Scanner(System.in);
		ArrayList<Integer> number2=new ArrayList<Integer>();
		
				while(sc1.hasNext()) {
					
					Integer i=sc1.nextInt();
						number2.add(i);
						if(number2.size()>=5)break;
					}
				
		System.out.println(number2);
		/* Merge the 2 ArrayLists*/
		System.out.println("Merge of 2 Arraylists");
		number1.addAll(number2);
		System.out.println(number1);
		/* Sorting the merged ArrayList*/
		System.out.println("Sorting the merged ArrayList");
		Collections.sort(number1);
		System.out.println(number1);
		System.out.println("Program Ends");
		}
		
		
		
	}


