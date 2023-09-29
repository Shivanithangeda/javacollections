 
import java.util.*;
public class ArrayListDemo3{
   public static void main(String args[]){
      String array[]={"Dog","cat","elephant"};
   
      for(String value:array)
      {
           System.out.println(value);
      }
  
  List <String> al=Arrays.asList(array);
   System.out.println(al);

   }
}