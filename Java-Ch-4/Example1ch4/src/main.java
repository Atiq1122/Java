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
<<<<<<< HEAD
		System.out.println("Welcome to the grade book for "+ getCourseName());
=======
		System.out.println("Welcome to the grade book for \n"+getCourseName());
>>>>>>> 7bde7b775d68618fe8055522c5e927ef2e528211
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
<<<<<<< HEAD
	System.out.println("Total of all 10 grades is :" + total);
	System.out.println("Class average is "+ average);
=======
	System.out.println("\nTotal of all 10 grades is  \n"+ total);
	System.out.println("Class average is \n"+ average);
>>>>>>> 7bde7b775d68618fe8055522c5e927ef2e528211
	}
}
