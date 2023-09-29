import java.util.*;
public class LinkedListDemo2 {
     public static void main(String args[]) {
             LinkedList <String> l=new LinkedList<String>();
             l.add("U");
             l.add("P");
             l.add("I");
             l.add("E");
             l.add("B");
             LinkedList<String> l2=new LinkedList<String>();
             l2.addAll(l);
             System.out.println(l2+"\n");
     
             l2.removeAll(l);
             System.out.println(l2+"\n");
             
             //sort() Collection.sort(collection)
          
             System.out.println("Before sorting LL:"+l+"\n");
             Collections.sort(l);
              System.out.println("After sorting LL:"+l+"\n");
 
            // reverse order
             Collections.sort(l,Collections.reverseOrder());
             System.out.println("Reverse order:"+ l+"\n");

            //shuffling
            Collections.shuffle(l);
            System.out.println("After shuffling:"+l);


     }

}