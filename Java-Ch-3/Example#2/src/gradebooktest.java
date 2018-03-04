import java.util.Scanner;

public class gradebooktest {
	public static void main( String[] args ) {
		Scanner input= new Scanner(System.in);
		gradebook mygradebook= new gradebook();
		System.out.println("please enter the coursename");
		String nameofcourse=input.nextLine();
		System.out.println();
		mygradebook.displaymessage(nameofcourse);
		input.close();
		
	}


}
