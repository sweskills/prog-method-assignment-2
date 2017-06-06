/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	private static int SENTINEL = 0;
	
	public void run(){
		 println("This program finds the largest and smallest numbers.");
         
         //initializes the minimum value
         int min = 0;
        
         //intializes the maximum value
         int max = 0;
    
         //iterates using while loop when the condition is true
         while(true){
    
         //prompts the user to enter a value
             int val = readInt("enter val: ");
    
         //checks if the first value entered is 0
             if(val == SENTINEL) {
                 break;
             }
    
         //checks if the value is greater than the maximum value
         //and then assigns it as the largest
             if(val > max){
             max = val;
         //checks if the value is less than the minimum value
         //and then assign it as the smallest
             } else if (val < min) {
                 min = val;
             }
         }


//prints out the smallest value
println("smallest: " + min);

//prints out the largest value
println("largest: " + max);
     }
    
    


		
		
		
		
		
	
	
}

