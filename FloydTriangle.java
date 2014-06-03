package Homework;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n, num=1;
Scanner input = new Scanner(System.in);
System.out.println("please enter the number of rows for the triangle :");
n = input.nextInt();
System.out.println("floyd's triangle:");
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)	
{
System.out.print(num + " ");	
num++;
}
System.out.println();
}
		
	}

}
