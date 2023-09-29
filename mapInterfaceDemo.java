import java.util.*;
public class mapInterfaceDemo {
    public static void main(String args[]){
        
        Map<String,String> map=new HashMap<>();
        map.put("name","shiv");
        map.put("gen","female");
        map.put("actor","ranveer");

        Set<String> keys=map.keySet();
        for(String i:keys){
            System.out.println(i+"\t" +" "+map.get(i));
        }
       

    }
}
