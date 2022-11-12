//Write a program to divide, multiply, subtract and addition of two numbers - Day 3 assignment
import java.util.*;
// import java.io.*;

public class day3
{
	public static void main(String args[])
	{
	int num1, num2, total=0;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter 1st number:: ");
		num1=sc.nextInt();
		System.out.print("Enter 2nd number:: ");
		num2=sc.nextInt();
	}
	total = num1 + num2;
	System.out.println("Addition is :: "+total);
	total = num1 - num2;
	System.out.println("Subtraction is :: "+total);
	total = num1 * num2;
	System.out.println("Multiplication is :: "+total);
	total = num1 / num2;
	System.out.println("Division is :: "+total);
	}
}