package pack6;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ReversedSortElement {
	public static void main(String[] args) {
	System.out.println("Program Starts.....");
    System.out.println("Enter the number of Strings to be added");
    Scanner sc1=new Scanner(System.in);
    int n=sc1.nextInt();
    System.out.println("Enter the String to be Searched:");
	Scanner sc2=new Scanner(System.in);
	String s1=sc2.nextLine();
    TreeSet<String> t1=new TreeSet<String>(new MyComparator());
	System.out.println("Enter the Strings to be added");
	Scanner sc3=new Scanner(System.in);
	while(sc3.hasNext()) {
		t1.add(sc3.next());
        List<String> list=new ArrayList<String>(t1);
        if(list.contains(s1))
        System.out.println(list.indexOf(s1));
        else
        	System.out.println("-1");
		}
	System.out.println("Program Ends......");
	
	
}
	

}
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=(String)obj1;
		String s2=(String)obj2;
		return s2.compareTo(s1);
	}
}


