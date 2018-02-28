import java.util.Scanner;

public class exer24 {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	System.out.println("enter 1st integer");
	num1=input.nextInt();
	System.out.println("enter 2nd integer");
	num2=input.nextInt();
	System.out.println("enter 3rd integer");
	num3=input.nextInt();
	System.out.println("enter 4th integer");
	num4=input.nextInt();
	System.out.println("enter 5th integer");
	num5=input.nextInt();
	if(num1<num2&&num1<num3&&num1<num4&&num1<num5)
		System.out.println(num1+" is smaller integer");
	else if(num2<num1&&num2<num3&&num2<num4&&num2<num5)
		System.out.println(num2+" is smaller integer");
	else if(num3<num1&&num3<num2&&num3<num4&&num3<num5)
		System.out.println(num3+" is smaller integer");
	else if(num4<num1&&num4<num2&&num4<num3&&num4<num5)
		System.out.println(num4+" is smaller integer");
	else if(num5<num1&&num5<num2&&num5<num3&&num5<num4)
		System.out.println(num5+" is smaller integer");
	
	if(num1>num2&&num1>num3&&num1>num4&&num1>num5)
		System.out.println(num1+" is larger integer");
	else if(num2>num1&&num2>num3&&num2>num4&&num2>num5)
		System.out.println(num2+" is larger integer");
	else if(num3>num1&&num3>num2&&num3>num4&&num3>num5)
		System.out.println(num3+" is larger integer");
	else if(num4>num1&&num4>num2&&num4>num3&&num4>num5)
		System.out.println(num4+" is larger integer");
	else if(num5>num1&&num5>num2&&num5>num3&&num5>num4)
		System.out.println(num5+" is larger integer");
	input.close();
}
}
