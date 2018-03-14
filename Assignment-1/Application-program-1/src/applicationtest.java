public class applicationtest {
	public static void main(String[] args) {
		application objA = new application("3D-paint", "Win10", 2010);
		application objB = new application("Calculator", "Win7", 2007);
		application objC = new application("IExplorer", "XP", 2000);
		System.out.println(objA.getoperatingsystem()+":"+objA.getversion()+":"+objA.getname());
		System.out.println(objB.getoperatingsystem()+":"+objB.getversion()+":"+objB.getname());
		System.out.println(objC.getoperatingsystem()+":"+objC.getversion()+":"+objC.getname());
		application[] objary=new application[10];
		for(int i=0;i<=9;i++) {
			String name="name:"+i;
			objary[i]=new application(name,"XP",i);
			System.out.println(objary[i].getname());
		}
	}
}
