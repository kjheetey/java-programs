package Homework;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int i;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number to check if it is prime or not");
		num = input.nextInt();
		for (i = 2; i < num; i++) {
			int n = num % i;
			if (n == 0) {
				System.out.println("not Prime!");
				break;

			}

		}
		if (i == num) {
			System.out.println("Prime number!");
		}

	}

}
