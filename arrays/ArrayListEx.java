package arrays;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

    
        System.out.println(list.contains(1));

        System.out.println(list);

        list.set(0, 2);

        System.out.println(list);

        list.remove(5);

        System.out.println(list);

        System.out.println(list.get(4));

        
        
        
        
    }
     
}
