public class application {
private static String operatingsystem;
private static String name;
private static int osversion;

public application(String appname,String os, int osver){
	operatingsystem=os;
	name=appname;
	osversion=osver;
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


