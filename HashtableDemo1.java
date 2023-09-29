import java.util.*;
public class HashtableDemo1 {
        public static void main(String args[]) {
              //Hashtable t=new Hashtable();    //capacit is 11.loadfactor is 0.75
                
         //     Hashtable t=new(initial capacity);

        //      Hashtable t=new Hashtable(intial capacity,fill ratio/load factor);
                Hashtable <Integer,String> t=new Hashtable<Integer,String>();
         
                t.put(101,"varun");
                t.put(102,"manish");
                t.put(103,"siddharth");
                t.put(104,"varun");
                                 
                System.out.println(t);
 
                System.out.println(t.get(103));

                t.remove(103);
                System.out.println(t);
 
                System.out.println(t.containsKey(102));
                System.out.println(t.containsKey(106));

                System.out.println(t.isEmpty());

                System.out.println(t.keySet());
                System.out.println(t.values());

                for(int k:t.keySet()){
                System.out.println(k+"             "+t.get(k));

                }




           }
}