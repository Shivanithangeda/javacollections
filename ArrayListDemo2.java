import java.util.*;

class ArrayListDemo2 {
    public static void main(String args[]) {
      ArrayList <String> al=new ArrayList<String>();
    
        al.add("Z");
       al.add("X");
       al.add("Y");
       al.add("A");
       al.add("B");
       al.add("C");
    
       ArrayList<String> al_dup=new ArrayList<String>();
      al_dup.addAll(al);
      System.out.println(al_dup);
   
      al_dup.removeAll(al);
       System.out.println("after removing :"+al_dup);
    
      
      System.out.println("elements in arraylist:"+al);
      Collections.sort(al);
      System.out.println("elements in arraylist after sorting:"+al);
    
      Collections.sort(al,Collections.reverseOrder());
     System.out.println("elements in arraylist after sorting in reverse order:"+al);

     Collections.shuffle(al);
     System.out.println("elements in arraylist after shuffling :"+al);


    }
}