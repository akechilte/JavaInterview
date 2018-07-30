package com.datastructure.queue;

/**
 * Created by mbiswas on 3/22/18.
 *
 */
public class Queue {
    private int maxsize; // Initializer the set number of slots
    private long[] queueArray; // slot to store the data
    private int front; //this will be the index position for the element of the front
    private int rare; // going to be index position of the element of the back in the line
    private int nItems; // number of items stores in the queue

    public static void main(String[] args){

    }

    public Queue(int size) {
        this.maxsize = size;
        this.queueArray = new long[size];
        this.front = 0; //Index position of the first slot of the array
        this.rare = -1; // there is no items in the array yet to be considered as last item
        this.nItems = 0;
    }

    public void insert(long item){
        rare++;
        queueArray[rare] = item;
        nItems++;

    }


    public long remove(){ //remove item from front
        long temp = queueArray[front];
        front++;
         if(front == maxsize){
             front = 0; // we can set front to 0th index so that we can use the whole array again.
         }

         nItems--;
        return temp;
    }


    public long peekFront(){
        return queueArray[front];
    }

    public boolean isQueueEmpty(){
        return (nItems == 0);
    }

    public boolean isQueueFull(){
        return (nItems == maxsize);
    }

    public void view(){
        System.out.print("[ ");
        for(int i = 0; i<queueArray.length; i++){
            System.out.print(queueArray[i]+" ");
        }
        System.out.println(" ]");
    }








}
