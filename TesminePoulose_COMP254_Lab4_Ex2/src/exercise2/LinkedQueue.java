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
package exercise2;

/**
 * Realization of a FIFO queue as an adaptation of a SinglyLinkedList.
 * All operations are performed in constant time.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 * @see SinglyLinkedList
 */
public class LinkedQueue<E> implements exercise2.Queue<E> {

  /** The primary storage for elements of the queue */
  private SinglyLinkedList<E> list = new SinglyLinkedList<>();   // an empty  list

  /** Constructs an initially empty queue. */
  public LinkedQueue() { }                  // new queue relies on the initially empty list

  /**
   * Returns the number of elements in the queue.
   * @return number of elements in the queue
   */
  @Override
  public int size() { return list.size(); }

  /**
   * Tests whether the queue is empty.
   * @return true if the queue is empty, false otherwise
   */
  @Override
  public boolean isEmpty() { return list.isEmpty(); }

  /**
   * Inserts an element at the rear of the queue.
   * @param element  the element to be inserted
   */
  public void enqueue(E element) { list.addLast(element); }

  /**
   * Returns, but does not remove, the first element of the queue.
   * @return the first element of the queue (or null if empty)
   */
  public E first() { return list.first(); }

  /**
   * Removes and returns the first element of the queue.
   * @return element removed (or null if empty)
   */
  public E dequeue() { return list.removeFirst(); }

  /** Produces a string representation of the contents of the queue.
   *  (from front to back). This exists for debugging purposes only.
   */
  public String toString() {
    return list.toString();
  }
  
  public void concat(LinkedQueue<E> q2)
  {
	  if (q2.first()!=null) // something is in the queue
	  {
		  this.enqueue(q2.dequeue()); // concatenate first element
		  concat(q2); // repeat until the queue is empty
	  }
  }
  
  public static void  main(String[] args) 
  {
	  //2 Queue Creation
	  LinkedQueue<Integer> sourceQ = new LinkedQueue<Integer>();
      LinkedQueue<Integer> targetQ = new LinkedQueue<Integer>();
      
      sourceQ.enqueue(3);
      sourceQ.enqueue(4);
      System.out.println("Source Queue:");
      System.out.println(sourceQ.toString());
      
      targetQ.enqueue(1);
      targetQ.enqueue(2);
      System.out.println("\nTarget Queue:");
      System.out.println(targetQ.toString());
      
      targetQ.concat(sourceQ);
      
      System.out.println("\nSource Queue After Concatination:");
      System.out.println(sourceQ.toString());
      System.out.println("\nTarget Queue After Concatination:");
      System.out.println(targetQ.toString());
  }
}
