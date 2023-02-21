package exercise01;

/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


/**
 * Code for end-of-chapter exercises on asymptotics.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
class Exercises {

  /** The sum of the integers in the given array is returned.
   * 
   *  1) Answer : O(n)
   *   	 Running time depends on the size of arr[] array, which is n and increases linearly. 
   *   
   *   2n+5 is O(n)
   *   f(n) = 2n+5 and g(n) = n
   *   2n+5 <= cn
   *   cn - 2n >= 5
   *   n(c-2) >= 5
   *   n >= 5/(c-2)
   *   Picking c=3 , n >= 5
   *  
   *  */
  public static int example1(int[] arr) {
    int n = arr.length, total = 0;  //3 primitive operations
    for (int j=0; j < n; j++)   //n+1 primitive operations    // loop from 0 to n-1
      total += arr[j];  //n primitive operations 
    return total; // 1 primitive operation 
  }
  

  /** Returns the sum of the integers in the given array with an even index.
   * 
   *  2) Answer : O(n)     
   *  			  Running time is linear 
   *  
   *  n+6 is O(n)
   *  f(n) = n+6 and g(n) = n
   *  n+6 <= cn
   *  cn - n >= 6
   *  n(c - 1) >= 6
   *  n >= 6/(c-1)
   *  Picking c=2 , n >= 6
   *  
   *  */
  public static int example2(int[] arr) {
    int n = arr.length, total = 0; //3 primitive operations
    for (int j=0; j < n; j += 2)  // n/2 + 2 primitive operations ,ie, (1+ n/2+1+ n/2+2) // note the increment of 2
      total += arr[j]; // n/2 primitive operations
    return total; // 1 primitive operation
  }

  /** The sum of the prefix sums of the given array is returned.
   *  3) Answer : O(n^2)
   *  			  Runtime is quadratic
   *  
   *  
   *  2n^2+2n+5 is O(n^2)
   *  f(n) = 2n^2+2n+5 and g(n) = n
   *  2n^2+2n+5 <= cn
   *  5 <= n(c-2-2n)
   *  Picking c=10 and n=1
   *  
   *  For any given number of elements in arr[], 2 loops execute, hence running time is quadratic.
   *  */
  public static int example3(int[] arr) {
    int n = arr.length, total = 0; // 3 primitive operations
    for (int j=0; j < n; j++)    // n+1 primitive operations     // loop from 0 to n-1
      for (int k=0; k <= j; k++)  //n(n+1) primitive operations        // loop from 0 to j
        total += arr[j]; // n*n primitive operations
    return total; // 1 primitive operation
  }

  /** The sum of the prefix sums of the given array is returned.
   * 
   *  4) Answer : O(n)
   *  			  Runtime is linear 
   *  
   *  f(n) =  3n + 6 and g(n) = n
   *  3n +6 <= cn
   *  n(c-3) >= 6
   *  n >= 6/(c-3)
   *  Picking c = 4 , n>=6
   *  
   * */
  public static int example4(int[] arr) {
    int n = arr.length, prefix = 0, total = 0; // 4 primitive operations
    for (int j=0; j < n; j++) {  //n+1 primitive operations   // loop from 0 to n-1
      prefix += arr[j]; // n primitive operations
      total += prefix; //n primitive operations
    }
    return total; // 1 primitive operations
  }

  /** The number of times the second array stores the sum of the prefix sums from the first array is returned.
   *  5) Answer : O(n^3)
   *  Runtime is cubic 
   * 
   * f(n) = 2n^3+2n^2+5n+5  and g(n) = n
   * 2n^3+2n^2+5n+5 <= cn
   * 5 <= n(c-2n^2 -2n -5)
   * Picking c =15 and n = 1
   * 
   * For a given number of elements in first[] array, 3 loops execute, hence running time is cubic. 
   * */
  public static int example5(int[] first, int[] second) { // assume equal-length arrays
    int n = first.length, count = 0; // 3 primitive operations 
    for (int i=0; i < n; i++) {    //n+1 primitive operations    // loop from 0 to n-1
      int total = 0;  //n primitive operations
      for (int j=0; j < n; j++)   //n(n+1)  primitive operations    // loop from 0 to n-1
        for (int k=0; k <= j; k++) //n*n*(n+1) primitive operations      // loop from 0 to j
          total += first[k]; //n*n*n primitive operations
      if (second[i] == total) //n primitive operations
    	  count++;//n primitive operations
    }
    return count;// 1 primitive operation
  }

}

