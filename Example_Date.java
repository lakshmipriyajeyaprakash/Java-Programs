package Pack5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Example_Date {
public static void main(String[] args) {
	System.out.println("Program starts");
	System.out.println("Enter your DateInput:");
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    int result = validatedate(s1);
  
    if(result==1){
    System.out.println("Valid date format");
  }
  else{
    System.out.println("Invalid date format");
  }
    System.out.println("Program Ends");
  
}
public static int validatedate(String s1) {
    if(s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")) {
    SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");

    try {
    Date parsedate=dateformat.parse(s1);
    return 1;
  } 
   catch (ParseException e) {
    return -1;
}
}
else
  return -1;
}
}