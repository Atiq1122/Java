import java.util.Scanner;

public class exercise1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter first number");
		num1 = input.nextInt();
		System.out.println("Enter Second number");
		num2 = input.nextInt();
		if (num1 > num2) {
			System.out.println(num1 + " is larger");
		} else if (num1 < num2) {
			System.out.println(num2 + " is larger");
		} else {
			System.out.println("These numbers are Equal");
		}
		input.close();
	}
}
