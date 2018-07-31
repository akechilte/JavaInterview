package com.leetcode;

/**
 * Created by mbiswas on 7/30/18.
 */
//7. Reverse Integer
public class ReverseInteger {
    public int reverse(int x) {

        long rev = 0; // here catch is the long
        while(x !=0){
            //num = 12345
            // rev = 0*10 + 5 = 5
            // rev = 5*10 + 4 = 54
            // rev = 54*10 + 3 = 543
            // rev = 543*10 + 2 = 5432
            // rev = 5432*10 + 1 = 54321
            rev = rev*10 + x % 10;
            x = x / 10;
        }


        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){ // if rev is not long then this condition will have issue
            return 0;
        }else{
            return (int)rev;
        }

    }
}
