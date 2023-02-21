package exercise02;

import exercise02.heap.HeapPriorityQueue;

public class Main {
    public static void main(String[] args) {
        //Without Recursive
        HeapPriorityQueue<String, String> heapQ = new HeapPriorityQueue<String, String>();
        heapQ.insert("71", "A");
        heapQ.insert("45", "C");
        heapQ.insert("36", "B");
        heapQ.insert("98", "D");
        heapQ.insert("17", "F");
        heapQ.insert("26", "G");
        heapQ.insert("55", "H");
       
        // Print all Entries
        System.out.println("First Heap");
        heapQ.printHeap();

        //Recursive
        heapQ = new HeapPriorityQueue<String, String>();
        heapQ.insert("23", "W");
        heapQ.insert("65", "C");
        heapQ.insert("13", "Q");
        heapQ.insert("46", "F");
        heapQ.insert("98", "G");
        heapQ.insert("66", "H");
        heapQ.insert("81", "J");
        
        // Print all Entries
        System.out.println("\nSecond Heap");
        heapQ.printHeap();
    }
}