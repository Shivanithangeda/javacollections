import java.util.*;
    public class QueueDemo1 {
          public static void main(String args[]) {
               
             PriorityQueue <String> q=new PriorityQueue <String>();

             //adding elements add() offer()

             q.add("A");
             q.add("S");
             q.add("R");
             q.add("Y");
             q.offer("100"); 
             System.out.println(q);
 
             //get head elemnet
             //System.out.println(q.element()); //returns exception if queue is empty
            // System.out.println(q.peek());     //returns null if queue is empty

              //return and remove elements
           //  System.out.println(q.remove());             
            // System.out.println(q);
    
    //         System.out.println(q.poll());
      //       System.out.println(q);
              
              //read all elements
          /*    Iterator it=q.iterator();
              while(it.hasNext()){
              System.out.println(it.next());
              } */

             for(String s:q){
             System.out.println(s);
             }

              }
      }