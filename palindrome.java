
//Write a program to check if a even number is palindrome or not - Day 3 Assignment
import java.util.*;
// import java.io.*;

public class palindrome {
	public static void main(String args[]) {
		int temp = 0,num,check=0,tmp=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number to check palindrome or not?: ");
			num = sc.nextInt();
			temp=num;
			while(num!=0) {
				check=num%10;
				tmp=tmp*10+check;
				num=Math.floorDiv(num,10);
			}
			if(tmp==temp) {
				System.out.print("The number " +temp+ " is palindrome");
			}
			else {
				System.out.print("The number " +temp+ " is not palindrome");
			}
		}
	}
}