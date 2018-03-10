import java.util.Scanner;

public class exercise17 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int num1,num2,num3,sum,avg,prod;
	System.out.println("Enter first integer");
	num1=input.nextInt();
	System.out.println("Enter second integer");
	num2=input.nextInt();
	System.out.println("Enter third integer");
	num3=input.nextInt();
	sum=num1+num2+num3;
	prod=num1*num2*num3;
	avg=(sum)/3;
	System.out.println("Sum is:"+sum);
	System.out.println("Product is:"+prod);
	System.out.println("Average is:"+avg);
	if(num1<num2&&num1<num3)
		System.out.println(num1+" is minimum integer");
	else if(num2<num1&&num2<num3)
		System.out.println(num2+" is minimum integer");
	else if(num3<num1&&num3<num2)
		System.out.println(num3+" is minimum integer");
	else
		System.out.println("repeating same values");
	
	if(num1>num2&&num1>num3)
		System.out.println(num1+" is maximum integer");
	else if(num2>num1&&num2>num3)
		System.out.println(num2+" is maximum integer");
	else if(num3>num1&&num3>num2)
		System.out.println(num3+" is maximum integer");
	else
		System.out.println("repeating same values");
	input.close();
}
}
