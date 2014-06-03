package Homework;

import java.util.Scanner;

public class Cumulative {

	public static void main(String[] args) {

		double unit, unitCost, bill;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of units consumed:");
		unit = input.nextDouble();	
		if(unit> 0 && unit<=100)
		{
			bill = 1 * unit;
			System.out.println("user has to pay:" + "$ "+ bill);
		}
		else if(unit>100 && unit<=300)
		{
			unitCost = 0.75;
		bill = 100*1 + (unitCost* (unit-100));
		System.out.println("user has to pay:" + "$ "+ bill);
		}
		else if(unit>300 && unit <=500)
		{
			unitCost = 0.50;
		bill = 100*1 + 200*0.75+  (unitCost * (unit-300));
		System.out.println("user has to pay:" + "$ "+ bill);
		}
		else
		{
			unitCost = 0.25;
			bill = 100*1+ 200*0.75 + 200*0.50 + (unitCost * (unit-500));
			System.out.println("user has to pay:" + "$ "+ bill);
		}
	}

}
