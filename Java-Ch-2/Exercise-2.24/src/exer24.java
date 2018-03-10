import java.util.Scanner;

public class exer24 {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	int min,max;
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
	
	min=max=num1;
	
	if(num2<min)
		min=num2;
	if(num3<min) 
		min=num3;
	if(num4<min) 
		min=num4;
	if(num5<min) 
		min=num5;
	
	if(num2>max) max=num2;
	if(num3>max) max=num3;
	if(num4>max) max=num4;
	if(num5>max) max=num5;
	System.out.println(min+" is minimum number");
	System.out.println(max+" is maximum number");
	input.close();
}
}
