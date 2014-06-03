package Homework;

import java.util.Scanner;

public class NumberIsOddOrEven {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number:");
		n = input.nextInt();
		if(n == 0)
		{
			System.out.println(n + " "+ "is a whole number");
		}
		else if(n%2 == 0)
		{
			System.out.println(n + " "+" is an even number");
		}
		else if(n%2 != 0)
		{
			System.out.println(n + " "+ "is an odd number");
		}

	}

}
