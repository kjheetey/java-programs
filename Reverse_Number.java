package Homework;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		int original, reverse = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number to print its reverse:");
original = input.nextInt();
//int length = original.length();
while( original != 0 )
{
    reverse = reverse * 10;
    reverse = reverse + original%10;
    original = original/10;
}

          System.out.println("Reverse of entered number is "+ reverse);

	}

}
