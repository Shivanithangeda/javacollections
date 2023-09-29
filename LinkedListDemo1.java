import java.util.*;
public class LinkedListDemo1 {
       public static void main(String args[]) {
       //declare linked list
       //LinkedList <Integer> l=new LinkedList<Integer>();
       
       LinkedList <String> l=new LinkedList<String>();
      l.add("welcome");
       l.add("shivani to");
        l.add("java");
        l.add("collection");
        l.add("linkdelist");
        l.add("null");
      //display
      System.out.println(l);
      //size
      System.out.println(l.size());

     //remove
      l.remove(3);
     System.out.println("After removing,new ist:"+l);
     
     //insert/adding element in middle of linked list
     l.add(1,"arun");
    System.out.println("after insert in 1st position:"+l);
 
     //retrive value/object
    System.out.println(l.get(3));

     //change or replace the value
     l.set(4,"list");
     System.out.println("after repacing the object:"+l);

     //contains()
      System.out.println(l.contains("java"));
    System.out.println(l.contains("collection"));

     //isEmpty
     System.out.println(l.isEmpty());
      
    //read the values or elements using for-loop

     for(int i=0;i<l.size();i++)
    {
      System.out.println("\t"+l.get(i));
    }

   //for-each loop
   for(String e:l){
     System.out.println(e);
    }

  //iterator method 
   Iterator it=l.iterator();
    while(it.hasNext()){
     System.out.println("\t"+it.next());
   }

  }
}






































































       
            
  