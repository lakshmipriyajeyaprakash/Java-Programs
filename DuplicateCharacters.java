package pack3;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class DuplicateCharacters {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Enter the input String:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		duplicatecharacter(input);
		System.out.println("Program Ends");
	}
	public static void duplicatecharacter(String s1) {
		char a1[] = s1.toCharArray();
		StringBuffer sb = new StringBuffer();
		LinkedHashSet<Character> hashset = new LinkedHashSet<Character>();
		for (int i = 0; i < a1.length; i++) {
		hashset.add(a1[i]);
		}
		Iterator<Character> itr = hashset.iterator();
		while (itr.hasNext()) {
		char c = itr.next();
		if (c!=' ')
		;
		{
		sb.append(c);
		}
		}
		System.out.println(sb);
			
	}

}
