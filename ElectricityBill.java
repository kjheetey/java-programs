package Homework;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double unit, bill;
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
bill = 0.75 * unit;
System.out.println("user has to pay:" + "$ "+ bill);
}
else if(unit>300 && unit <=500)
{
bill = 0.50 * unit;
System.out.println("user has to pay:" + "$ "+ bill);
}
else
{
	bill = 0.25 * unit;
	System.out.println("user has to pay:" + "$ "+ bill);
}
	}

}
