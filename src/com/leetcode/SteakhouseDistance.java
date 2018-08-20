package com.company.Amazon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by mbiswas on 8/19/18.
 */
public class SteakhouseDistance {

    class Locations{
        double dis;
        int index;

        public Locations(double dis, int index){
            this.dis = dis;
            this.index = index;
        }

    }

    public List<List<Integer>> getCoordinate( List<List<Integer>> allLocations, int totalSteakhouses, int numSteakhouses){

        PriorityQueue<Locations> pq = new PriorityQueue<>(new Comparator<Locations>() {
            @Override
            public int compare(Locations o1, Locations o2) {
                if(o1.dis < o2.dis){
                    return -1;
                }
                if(o1.dis > o2.dis){
                    return 1;
                }
                return 0;
            }
        });

        int i = 0;
        for(List<Integer> list : allLocations){
            double dis = getDistance(list.get(0),list.get(1));
            Locations loc = new Locations(dis,i);
            pq.offer(loc);
            i++;

        }

        List<List<Integer>> result = new ArrayList<>();
        for(int j = 0; j<numSteakhouses; j++){
            Locations l = pq.poll();
            result.add(allLocations.get(l.index));
        }

        return result;
    }

    public double getDistance(int x, int y){
        return Math.sqrt(x*x + y*y);
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list.add(list1);


        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list.add(list2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(-1);
        list.add(list3);


        List<Integer> list4 = new ArrayList<>();
        list4.add(-1);
        list4.add(1);
        list.add(list4);

        SteakhouseDistance s = new SteakhouseDistance();
        System.out.println(s.getCoordinate(list,3,2));

    }
}
