package com.company.Yahoo;

import java.util.Arrays;

/**
 * Created by mbiswas on 8/19/18.
 */
public class SortColors {

    public int[] sortColors(int[] nums) {
        if(nums==null||nums.length<2){
            return new int[]{0};
        }

        int[] countArray = new int[3];
        for(int i=0; i<nums.length; i++){
            countArray[nums[i]]++;
        }

        int j = 0;
        int k = 0;
        while(j<=2){
            if(countArray[j]!=0){
                nums[k++]=j;
                countArray[j] = countArray[j]-1;
            }else{
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        SortColors s = new SortColors();
        int[] array = {2,0,1,0,1,0};
        System.out.println(Arrays.toString(s.sortColors(array)));
    }
}
