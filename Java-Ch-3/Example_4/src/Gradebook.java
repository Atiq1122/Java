
public class Gradebook {
	private String coursename;
	public Gradebook(String name) {
		coursename=name;
	}
	public void setcoursename(String name) {
		coursename=name;
	}
	public String getcoursename(String name) {
		return coursename;
	}
	public void displaymessage() {
		System.out.printf("welcome to the gradebook for \n%s!\n", getCourseName());

	}
	public String getCourseName() {
		
		return coursename;
	}


}
