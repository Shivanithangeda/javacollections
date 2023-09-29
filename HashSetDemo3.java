import java.util.*; 
  public class HashSetDemo3 {
             public static void main(String args[]) {
            
             //union,Intersection,difference
           
             HashSet <Integer> set1=new HashSet <Integer> ();
 
             set1.add(1);
             set1.add(2);
             set1.add(3);
             set1.add(4);
             set1.add(5);
             set1.add(6);
 
             System.out.println("\nHashset set1:"+set1);
 
             HashSet <Integer> set2=new HashSet <Integer> ();

             set2.add(6);
             set2.add(7);
             
            System.out.println("\nHashset set2:"+set2);

            //union 
            set1.addAll(set2);  
            System.out.println("\nUNion:"   +set1);
           
           //intersection
            //set1.retainAll(set2);
            //System.out.println("\nIntersection:"   +set1);
            
            //difference
            set1.removeAll(set2);
            System.out.println("\nDifference:"  + set1);             
          
            //subset
            System.out.println(set1.containsAll(set2));
            //System.out.println("\ndoes set1 contains set2 elements:"   +set2);

          }
}




              