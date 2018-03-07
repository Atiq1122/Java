import java.util.Scanner;

public class gradebooktest {
public static void main(String[] args) {
	gradebook obj=new gradebook("name","Insname");
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your Course Name: ");
	String name=input.next();
	System.out.println("Enter Instructor name:");
	String insname=input.next();
	obj.setcoursename(name);
	obj.setname(insname);
	obj.displayMessage();
	input.close();
}
}
