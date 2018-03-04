
public class Gradebooktest {
	public static void main(String[] args) {

		Gradebook gradebook1 =new Gradebook("cs101 introduction to java programming");
		Gradebook gradebook2 =new Gradebook("cs102 data structure in java");
		System.out.printf( "gradeBook1 course name is: %s\n",gradebook1.getCourseName() );
	 
		System.out.printf( "gradeBook2 course name is: %s\n",gradebook2.getCourseName() );

	}
}
