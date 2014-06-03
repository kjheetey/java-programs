package Homework;

public class Number_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			int number = 1;
		        int square = number * number; 
		        int fourthPower = square * square; 

			System.out.print("First five powers of " + number + ": "); 

			System.out.println( number              + " " + 
		                            square              + " " +
		                            number * square     + " " + 
		                            fourthPower         + " " + 
					    number * fourthPower );
			//one power
			number += 1;
	        square = number * number; 
	        fourthPower = square * square; 

		System.out.print("First five powers of " + number + ": "); 

		System.out.println( number              + " " + 
	                            square              + " " +
	                            number * square     + " " + 
	                            fourthPower         + " " + 
				    number * fourthPower );
		//two powers
		number += 1;
        square = number * number; 
        fourthPower = square * square; 

	System.out.print("First five powers of " + number + ": "); 

	System.out.println( number              + " " + 
                            square              + " " +
                            number * square     + " " + 
                            fourthPower         + " " + 
			    number * fourthPower );
	//three powers
	number += 1;
    square = number * number; 
    fourthPower = square * square; 

System.out.print("First five powers of " + number + ": "); 

System.out.println( number              + " " + 
                        square              + " " +
                        number * square     + " " + 
                        fourthPower         + " " + 
		    number * fourthPower );
//four powers
number += 1;
square = number * number; 
fourthPower = square * square; 

System.out.print("First five powers of " + number + ": "); 

System.out.println( number              + " " + 
                    square              + " " +
                    number * square     + " " + 
                    fourthPower         + " " + 
	    number * fourthPower );
//five powers
	}

}
