package com.puzzle;

import java.util.Random;

/**
 * Created by dbiswas on 7/15/18.
 */
public class ShuffleCards {

    public static int[] shuffle(int[] cards, int n) {
        Random random = new Random();
        for(int i = 0; i< n; i++){
            int r = i + random.nextInt(n-i);
            int temp = cards[i];
            cards[i] = cards[r];
            cards[r] = temp;
        }
        return cards;
    }

    public static void main(String[] args) {
        int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52};

        shuffle(cards, 52);
        for (int k = 0; k < 52; k++) {
            System.out.print(cards[k] + " ");
        }

        int[] person1 = new int[13];
        int[] person2 = new int[13];
        int[] person3 = new int[13];
        int[] person4 = new int[13];

        int i = 0;
        int j = 0;

        while (i < 52) {
            person1[j] = cards[i];
            person2[j] = cards[i + 1];
            person3[j] = cards[i + 2];
            person4[j] = cards[i + 3];
            j++;
            i = i + 4;
        }
        System.out.println("");
        for(int m = 0; m < 13; m++){
            System.out.print(person1[m] +" ");
        }
        System.out.println("");
        for(int m = 0; m < 13; m++){
            System.out.print(person2[m]+" ");
        }

        System.out.println("");
        for(int m = 0; m < 13; m++){
            System.out.print(person3[m]+" ");
        }

        System.out.println("");
        for(int m = 0; m < 13; m++){
            System.out.print(person4[m]+" ");
        }
    }




}
