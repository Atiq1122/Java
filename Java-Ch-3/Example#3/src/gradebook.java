
public class gradebook {
	private String coursename;
	public void setcoursename(String name) {
		coursename=name;
	}
public String getcoursename() {
	return coursename;
}
public void displaymessage() {
	System.out.printf("welcome to the gradebook for \n%s!\n", getcoursename());
}
}
