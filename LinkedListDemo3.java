import java.util.*;
public class LinkedListDemo3 {
      public static void main(String args[]) {
          LinkedList <String> l=new LinkedList <String>();
          
         l.add("shivani");
         l.add("arun");
         l.add("chandana");
         l.add("rashmitha");
         l.add("vaseeem");
         
         System.out.println(l);
         l.addFirst("rahul");
         l.addLast("sony");

         System.out.println(l);
         
      // display specific element
         System.out.println(l.getFirst());
         System.out.println(l.getLast());

     //removing specific element
        l.removeFirst();
        l.removeLast();
        System.out.println("after removing elements:"+l);
         

      }

}