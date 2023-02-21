package exercise1;
import java.util.*;

	/* 
	 * File Name: TesminePoulose_COMP254_Lab3_Ex1
	 * Student Name: Tesmine Poulose
	 * Student ID: 301151876
	 * Date: 20-Feb-2022 
*/

public class RecurssiveMultiplication {

	  // Function to multiply two numbers
    public static int multiply(int m, int n)
    {
            int result;

            if (n == 1)
                    result =  m;
            else
                    result =  m + multiply(m, n-1);
            return(result);
    }
    // driver program to test above functions
    public static void main(String args[])

    {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int m=s.nextInt();
            System.out.println("Enter the second number: ");
            int n=s.nextInt();
            System.out.println("Result: "+ multiply(m, n)); // function calls
            s.close();

    }
}
