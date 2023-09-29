import java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;
public class collectionMethods {
    public static void main(String args[]) {
        Collection<String> list=new ArrayList<String>();
        list.add("shivani");
        list.add("learning");
        list.add("collections");
        for(String i :list){}
        System.out.println(list);

        //addAll method  public boolean addAll(int index, Collection<? extends E> c)
        // boolean a=Collections.addAll(list,"in","java");
        // System.out.println(list);

        // boolean b=list.contains("shivani");
        // System.out.println(b);

        // Collection<Integer> l1=new ArrayList<>();
        // for(int i=0;i<5;i++){
        //     l1.add(i);
        // }
        // Collection<Integer> l2=new ArrayList<>();
        // for(int i=0;i<3;i++){
        //     l2.add(i);
        // }


        //ContainsAll
        // boolean c=l1.containsAll(l2);System.out.println(c);



        //remove
        // list.remove("shivani");
        // System.out.println(list);

        // l1.removeAll(l2);
        // for(int i=0;i<l1.size();i++){
        //     System.out.println(l1);
        // }
        


        //retainAll
        Collection <Integer> col=new ArrayList<>();
       for(int i=0;i<20;i++){
          col.add(i);
       }
       System.out.println(col);
       Collection <Integer> col1=new ArrayList<>();
       for(int i=0;i<20;i++){
           if(i%2==0){
            col1.add(i);
           }
         
       }
       col.retainAll(col1);
       System.out.println(col);


       //size
       System.out.println(col.size());

       //iterator
       int i=1;
       Iterator<String> iterator=list.iterator();
       while(iterator.hasNext())
       {
           System.out.println(i++ +"."+iterator.next());
       }

       //hashode
       int d=col.hashCode();
       System.out.println("HashCode="+d);
       
       //equals
       boolean e=col1.equals(col);
       System.out.println(e);

     //spltterator
     Spliterator<Integer> f=col.spliterator();
     while(f.tryAdvance((n)->System.out.print(n+",")));
     System.out.println();

    // toarray
    //  Object[] g=col.toArray();
    //  for(int j=0;j<g.length;j++){
    //     System.out.println("element:"+g[j]);
     
    //  }

    //removeIf
    //  Predicate<Integer> pr=h->(h%4!=0);
    //  col.removeIf(pr);
    //  System.out.println(col);
     
    //foreach
       list.forEach(new Consumer<String>(){
       public  void accept(String t){
            System.out.print(t+" ");
            System.out.println();
        }
    });
    
    list.clear();
    System.out.println(list);
    
    System.out.println(list.isEmpty());
   }

}

