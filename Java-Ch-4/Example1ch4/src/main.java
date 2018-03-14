import java.util.Scanner;

public class main {

	private String courseName;
	public main(String name) {
		courseName = name;
	}
	public void setcourseName(String name) {
		courseName = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void displayMessage() {
		System.out.println("Welcome to the grade book for "+ getCourseName());
	}
	public void determineClassAvg() {
		Scanner input = new Scanner(System.in);
		int total , i , grade , average ;
		total = 0;
		i = 1;
		System.out.println("Grades mean Marks:");
		while (i <= 10) {
			System.out.print("Enter Grade : ");
			grade = input.nextInt();
			total = total+grade;
			i++;
		}
		input.close();
	average = total / 10;
	System.out.println("Total of all 10 grades is :" + total);
	System.out.println("Class average is "+ average);
	}

}
