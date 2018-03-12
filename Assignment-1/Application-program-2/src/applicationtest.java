public class applicationtest {
	public static void main(String[] args) {
		application objA = new application("3D-paint", "Win10", 2010);
		application objB = new application("Calculator", "Win7", 2007);
		application objC = new application("IExplorer", "XP", 2000);
		System.out.println(objA.getoperatingsystem()+":"+objA.getversion()+":"+objA.getname());
		System.out.println(objB.getoperatingsystem()+":"+objB.getversion()+":"+objB.getname());
		System.out.println(objC.getoperatingsystem()+":"+objC.getversion()+":"+objC.getname());
	}
}
