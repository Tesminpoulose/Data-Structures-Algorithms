package exercise2;
import java.util.*;

	/* 
	 * File Name: TesminePoulose_COMP254_Lab3_Ex1
	 * Student Name: Tesmine Poulose
	 * Student ID: 301151876
	 * Date: 20-Feb-2022 
*/

public class RecurssivePalindrome {
	public static boolean compare(String s)
	{   
		//If length is 0 or 1 then String is palindrome
		if(s.length() == 0 || s.length() == 1) 
			return true;
		
		//Check whether the first and last character of the string is same or not
		if(s.charAt(0) == s.charAt(s.length()-1)) 
		/*
		 *  if true, then checks whether the next and last but previous character of the string 
		 *  is same or not by calling the function again
		 */
			return compare(s.substring(1, s.length()-1)); 
		
		//If they don't match
		return false; 
	}

	public static void main(String[]args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the String:");
	   String string = sc.nextLine();
	   if(compare(string))
		   System.out.println(string + " is a palindrome");
	   else
		   System.out.println(string + " is not a palindrome");
	   sc.close();
	}
}