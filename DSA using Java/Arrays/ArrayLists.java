//package DSA using Java;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add elements
        list.add(0);   //we take elements
        list.add(2);
        list.add(3);
        list.add(8);

        System.out.println(list);
        //get elements
        int element = list.get(0); //when we are getting the elements from array we take index
        System.out.println(element);

        //add elements in between
        list.add(2, 10);
        System.out.println(list);

        //set the elements
        list.set(0,5);
        System.out.println(list);

        //delete the element from array
        list.remove(2);
        System.out.println(list);

        //size of the array
        int size = list.size();
        System.out.println(size);

        //loops

        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i));
        }
        System.out.println(" ");

        //sorting
        Collections.sort(list);
        System.out.println(list);


    }
}