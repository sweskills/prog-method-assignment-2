import acm.program.*;
class FindRange extends ConsoleProgram{
     public static int SENTINEL = 0;
    public void run(){
        System.out.println("The program finds the largest and smallest values");
        
        int firstNumber = readInt("Enter first number");
        int smallestNmber = firstNumber;
        int largestNumber = firstNumber;
        
        if (firstNumber == SENTINEL)
            System.out.print("You did not enter a valid value");
        else
            System.out.println("you can now enter others");
        
        int otherNumber = readInt("Enter other integers");                         
        while(true){
            
        if(otherNumber <= SENTINEL){
            System.out.println(firstNumber+ "is the largest as well as th smallst");
        }
        else{
           largestNumber = otherNumber;
           if(otherNumber > largestNumber)
            largestNumber = otherNumber;    
        }
        System.out.print("Largest number: "+largestNumber);
        }
    }
}
