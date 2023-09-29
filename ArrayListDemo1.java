import java.util.*;
class ArrayListDemo1 {
      public static void main(String args[]){
       //   ArrayList <integer> al=new ArrayList <Interger>();
       ArrayList <String> al=new ArrayList <String>();
    //   List al=new ArrayList();
     // ArrayList al=new ArrayList();
       

    //add new elements to arraylist
       al.add("welcome");
       al.add("shivani to");
       al.add("java");
       al.add("collections");
       al.add("arraylist");

      System.out.println(al);

      //size
      System.out.println("Number of elements in array list:"+al.size());
    
      //remove
         al.remove(1);
   //  al.remove("shivani");
       System.out.println("After removing element in arrayist:"+al);
      
     //insert a new element
     //add(index, object)
      al.add(2,"chandana");
      System.out.println("After insertion:"+al);
      
    //retrive specific element
    System.out.println(al.get(2));
    
   //change/replace elemnt
     al.set(2,"shivani");
     System.out.println("After replacing element:"+al);
   
   //search-contains()-returns true/false
    System.out.println(al.contains("shivani"));
    System.out.println(al.contains("c#"));

   //isempty()
   System.out.println(al.isEmpty());
    
   //we can read data using for loop,foreach loop,iterator
   /**for(int i=0;i<=al.size();i++)
  {
   System.out.println(al.get(i));
  }**/
 
    for(String str:al)
   {
       System.out.println(str);
   

    }
   System.out.println("REDAING ELEMETS USING ITERATOR METHOD");
   Iterator it=al.iterator();
  while(it.hasNext())  
   {
       System.out.println(it.next());
    }
    

}
}






   
























   
    