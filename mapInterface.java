import java.util.*;

public class mapInterface {
    public static void main(String args[]){
       Map<String,Integer> m=new HashMap<>();
   m.put("A",10);
   m.put("B",20);
   m.put("C",30);
   m.put("D",40);
//    //OLD STYLE (NON-GENERIC)
//    //Converting to Set so that we can traverse  
//    Set set=m.entrySet();
//    Iterator it=set.iterator();
//    while(it.hasNext()){
//        //Converting to Map.Entry so that we can get key and value separately  
//     Map.Entry entry=(Map.Entry)it.next();
//     System.out.println(entry.getKey()+" "+entry.getValue());
//    }

//NEW(GENERIC)
// for(Map.Entry map:m.entrySet())  {
//  System.out.println(map.getKey()+" "+map.getValue());
// } 
System.out.println(m);

//clear()
// System.out.println("initial map:"+m);
// m.clear();
// System.out.println("after clearing:"+m);
// }


//containsKey()
System.out.println(m.containsKey("u"));
System.out.println(m.containsKey("A"));
//containsValue()
System.out.println(m.containsValue(20));



   
}

}
