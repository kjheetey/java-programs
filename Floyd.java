package Homework;

import java.util.Scanner;

public class Floyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, num = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of rows:");
		n = input.nextInt();
		System.out.println("floyd's triangle:");
	
		for (int i = 1; i <= n; i++)
		{
			
			for (int j = 1; j <= i; j++) {
				
				if ((num % 2) == 0) {
					System.out.print(0 + " ");
				}

				else {

					System.out.print(1 + " ");
				}
				num++;
			}
			System.out.println();
		}

	}
}