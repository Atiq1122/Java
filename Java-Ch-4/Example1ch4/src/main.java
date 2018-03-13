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
		System.out.println("Welcome to the grade book for \n"+getCourseName());
	}
	public void determineClassAvg() {
		Scanner input = new Scanner(System.in);
		int total , gradeCounter , grade , average ;
		total = 0;
		gradeCounter = 1;
		while (gradeCounter <= 10) {
			System.out.print("Enter grade : ");
			grade = input.nextInt();
			total = total+grade;
			gradeCounter = gradeCounter+1;
		}
	average = total / 10;
	System.out.println("\nTotal of all 10 grades is  \n"+ total);
	System.out.println("Class average is \n"+ average);
	}
}
