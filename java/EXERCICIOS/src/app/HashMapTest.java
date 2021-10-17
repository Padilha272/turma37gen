package app;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import entities.Demo;


public class HashMapTest {
public static void main(String[] args) {
    Map<Integer,Demo> map=new HashMap<Integer, Demo>();
    Demo d1= new Demo("MOUSE ", "G6-0 ", 50.00 , 10,0);
    Demo d2= new Demo("TECLADO  ", "G6-1 ", 150.00 , 20,1);
    Demo d3= new Demo("MONITOR ", "G6-2 ", 1500.00 , 30,2);
    Demo d4= new Demo("CABO USB ", "G6-3 ", 20.00 , 40,3);
    //adding values to map
    map.put(d1.getKey(), d1);
    map.put(d2.getKey(), d2);
    map.put(d3.getKey(), d3);
    map.put(d4.getKey(), d4);
    
    
    //retrieving values from map
    Set<Integer> keySet= map.keySet();
    for(int i:keySet){
        System.out.println(map.get(i));
        
    }
    System.out.println(map.get(0).getvalor());
    //searching key on map
    System.out.println(map.containsKey(d1.getKey()));
    //searching value on map
    System.out.println(map.containsValue(d1));
    
    
    
}
}
