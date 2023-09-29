import java.util.*;
public class LISTINTERFACEMETHODS {
    public static void main(String args[]){
        List<Integer> list=new ArrayList<>();
        list.add(0,50);
        list.add(1,60);
        list.add(2,30);
        list.add(3,40);
        System.out.println(list);

        List<Integer> l=new ArrayList<>();
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        System.out.println(l);

        list.addAll(l);
        System.out.println(list);


        
    }
    
    
}
