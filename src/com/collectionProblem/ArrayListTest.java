package com.collectionProblem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mbiswas on 4/19/18.
 */
public class ArrayListTest {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Malabika");
        arrayList.add("Dipankar");
        arrayList.add("Mridul");
        arrayList.add(0, "Dublu");

        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("Malabika"));

        Iterator<String> arrayListIterator = arrayList.iterator();
        while(arrayListIterator.hasNext()){
            String str = arrayListIterator.next();
            System.out.println(str);
        }
    }
}
