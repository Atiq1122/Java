public class application {
private String operatingsystem;
<<<<<<< HEAD
private String name;
private int osversion;
public application()
{
	
}
=======
private  String name;
private  int osversion;

>>>>>>> 7bde7b775d68618fe8055522c5e927ef2e528211
public application(String appname,String os, int osver){
	operatingsystem=os;
	name=appname;
	osversion=osver;
}
public application() {
	
}
public String getoperatingsystem() {
	return operatingsystem;
}
public String getname() {
	return name;
}
	public int getversion() {
		return osversion;
	}
	
}


