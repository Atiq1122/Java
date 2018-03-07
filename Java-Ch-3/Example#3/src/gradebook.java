
public class gradebook {
	private String coursename;
	public void setcoursename(String name) {
		coursename=name;
	}
public String getcoursename() {
	return coursename;
}
public void displaymessage() {
	System.out.println("welcome to the gradebook for "+ getcoursename());
}
}
