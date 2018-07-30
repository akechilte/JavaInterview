package com.Interview.thales;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by mbiswas on 6/1/18.
 */



        /*
        11.123.34.191
         0*10^1 + 3*10^4 + 4*10^3 + 1*10^2 + 9*10^1 + 1*10^0

         10101010.10101010.10101010.10101010 => 2 base system

         10101011
         10101010
         10101010
         10101010

         (10101011*2^24) + 10101010*2^16

         1.2.3.4 => 10 base system
         1
         2
         3
         4
         1*10^3 + 2*10^2 +3*10^1 + 4*10^0


         134


         1011
         1101

         and &
         1001

         or |
         1111

         xor
         0110

         2
         0010

         8 => 2*4 => 2*2^2
         1000

         13
         1101



         */
public class IPSorting {

    static Long toNumeric(String ip) {
        Scanner sc = new Scanner(ip).useDelimiter("\\.");
        Long l = (sc.nextLong() << 24) + (sc.nextLong() << 16) + (sc.nextLong() << 8)
                + (sc.nextLong());

        sc.close();

        return l;
    }


    static Long getNumeric(String ip){
        String[] str = ip.split("\\.");
        Long l = (Long.parseLong(str[0]) << 24) + (Long.parseLong(str[1]) << 16)
                    + (Long.parseLong(str[2]) << 8) + Long.parseLong(str[3]);

        return l;
    }

    public static void main(String[] args) {
        String[] strIps = new String[]{"192.168.0.1", "192.168.0.2", "192.168.0.9",
                "9.9.9.9","127.0.0.1"};

        Comparator<String> ipComparator = new Comparator<String>() {
            @Override
            public int compare(String ip1, String ip2) {
//                return toNumeric(ip1).compareTo(toNumeric(ip2));
                return getNumeric(ip1).compareTo(getNumeric(ip2));
            }
        };
        SortedSet<String> ips = new TreeSet<String>(ipComparator);
        for(String ip : strIps){
            ips.add(ip);
        }
//        ips.addAll(Arrays.asList("192.168.0.1", "192.168.0.2", "192.168.0.9",
//                "9.9.9.9","127.0.0.1"));
        System.out.println(ips);
    }
}
