import java.util.Scanner;

public class exercise {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int num1,num2,sum,sub,mul,div;
		System.out.println("Enter first number");
		num1=input.nextInt();
		System.out.println("Enter second number");
		num2=input.nextInt();
		sum=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=num1/num2;
		System.out.println("sum is :"+ sum);
		System.out.println("Difference is :"+ sub);
		System.out.println("Product is :"+ mul);
		System.out.println("Division is :"+ div);
		
	}

}
