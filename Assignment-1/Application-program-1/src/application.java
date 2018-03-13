public class application {
private String operatingsystem;
private  String name;
private  int osversion;

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


