package java_basics;
public class main2 {

		public static String printSomeJunk(String argument) {
			//System.out.println("Any thing is here" + argument);
			return argument;
		}
		public static void printSomeJunk(int argument) {
			System.out.println("Integer passed in int " + argument);
		}
		public static void sum2Numbers(int first , int second) {
			System.out.println(first+second);
		}
		public static int add10(int someArgument) {
			int result = someArgument + 10;
			return result;
		}

}
