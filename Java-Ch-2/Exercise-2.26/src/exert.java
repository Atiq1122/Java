import java.util.Scanner;

public class exert {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int num1;
	int num2;
	System.out.println("Enter 1st num");
	num1 = input.nextInt();
	System.out.println("enter 2nd num");
	num2= input.nextInt();
	if(num1%num2 == 0)
		System.out.println(num1+" is multiple of" +num2+ " number");
	else
		System.out.println("not multiple");
	input.close();
}
}

