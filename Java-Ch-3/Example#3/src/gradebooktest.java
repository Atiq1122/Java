import java.util.Scanner;

public class gradebooktest {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		gradebook mygradebook=new gradebook();
		System.out.printf("intial coursename is:%s\n\n",mygradebook.getcoursename());
		System.out.println("please enter the coursename");
		String thename=input.nextLine();
		mygradebook.setcoursename(thename);
		System.out.println();
		mygradebook.displaymessage();
		input.close();
	}

}
