import java.util.*;
public class HashSetDemo1 {
         public static void main(String args[]) {
             //HashSet hs= new HashSet();  //default capacity 16 load factor 0.75
             //HashSet hs= new HashSet(100); // initial capacity 100
             
             HashSet<Integer> hs=new HashSet<Integer>();
        
             //add objects into hashset
             hs.add(7);
             hs.add(4);
             hs.add(21);
             hs.add(45);
             hs.add(9);

             System.out.println(hs);

            //remove
            hs.remove(21);
            System.out.println("After removing elements:"+hs);

           //contains()
            System.out.println(hs.contains(45));
            System.out.println(hs.contains(10));

            //isEmpty()
            System.out.println(hs.isEmpty());

            //reading objects/elements from hashset using for loop
            for(Object e:hs){
            System.out.println(e);
            }

            Iterator it=hs.iterator();
            while(it.hasNext()){
            System.out.println("\t"+it.next());
            }

            
         }
}            
       