
public class gradebook {
	private String coursename="OOP";
	private String InsName="Sir Nafees";
public gradebook(String name,String insName) {
	coursename=name;
	InsName=insName;
}
public void setcoursename(String name) {
	
	coursename=name;
}
public String getcoursename() {
	return coursename;
}
public void setname(String insname) {
	InsName=insname;
	}
public String getname() {
	return InsName;
}
public void displayMessage() {
	System.out.println("Welcome to Portal. Your Course name is "+getcoursename()
			+" and this course is presented by "+getname());
	
}
}
