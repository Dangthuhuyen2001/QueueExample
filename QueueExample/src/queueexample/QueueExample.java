/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample;
import java.util.Queue;

/**
 *
 * @author ASUS
 */
public class QueueExample {

   
    // Queue implementation in java
    public static void main (String[] args)
    {
         
        // create a queue of capacity 5
        ArrayQueue q = new ArrayQueue(5);
 
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("The first person to take the ticket: " + q.peek());
        q.dequeue();
        System.out.println("The next person takes the ticket: " + q.peek());
 
        System.out.println("Queue size is " + q.size());
 
        q.dequeue();
        q.dequeue();
         q.dequeue();
        if (q.isEmpty())
            System.out.println("Out of people waiting to buy tickets");
        else
            System.out.println("There are still people waiting for tickets");
        
    }
    }

    

