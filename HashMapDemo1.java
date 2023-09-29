import java.util.*;
 public class HashMapDemo1 {
       public static void main( String args[]) {
         HashMap <Integer,String> m=new HashMap <Integer,String>();
         
         m.put(101,"shivani");
         m.put(103,"arun");
         m.put(105,"chandana");
         m.put(107,"rashmitha");
         m.put(109,"arun");

         System.out.println(m);

         //return a value
          System.out.println(m.get(105));

         //removing a value
        //  m.remove(105);
        //  System.out.println(m);
   
           System.out.println(m.containsKey(101));
           System.out.println(m.containsKey(106));

           System.out.println(m.containsValue("arun"));
           System.out.println(m.containsValue("vasem"));
     
           System.out.println(m.isEmpty()+"\n");

           System.out.println(m.keySet());

            for(int i:m.keySet()){
            System.out.println(i);
            } 

           System.out.println(m.values());
            for(String i:m.values()){
            System.out.println(i);
            } 

         // System.out.println(m.entrySet());
            for(Object i:m.keySet()){
            System.out.println(i+"     "+m.get(i));
            } 
            //ENTRY METHODS
            System.out.println("****************");
           for(Map.Entry entry :m.entrySet()){
           System.out.println(entry);
            }
           System.out.println("****************");
           Set s=m.entrySet();
            Iterator it=s.iterator();
            while(it.hasNext()){
            Map.Entry entry=(Entry) it.next();
            System.out.println(entry.getKey()+"        "+entry.getValue());
             
            }



    }
  }