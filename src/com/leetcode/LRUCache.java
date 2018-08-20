package com.company.Yahoo;

import java.util.HashMap;

/**
 * Created by mbiswas on 8/19/18.
 */
//146. LRU Cache
//https://www.youtube.com/watch?v=z30ek7LaYno&t=15s
//https://www.programcreek.com/2013/03/leetcode-lru-cache-java/
public class LRUCache {

    class Node{
        int key;
        int value;
        Node next;
        Node pre;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    int capacity;
    HashMap<Integer, Node> map = new HashMap<>();
    Node head = null;
    Node end = null;


    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    //remove node from DoublyLinkedList
    public void remove(Node node){
        if(node.pre!= null){
            node.pre.next = node.next;
        }else{//head node
            head = node.next;
        }

        if(node.next != null){
            node.next.pre = node.pre;
        }else{//tail node
            end = node.pre;
        }

    }

    //adding node in starting position in DoublyLinkedList
    public void setHead(Node node){
        node.next = head;
        node.pre = null;

        if(head != null){ // if head is already there
            head.pre = node;
        }

        head = node;
        if(end == null){//1stt ime adding node in the List
            end = head;
        }

    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            setHead(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node old = map.get(key);
            old.value = value;
            remove(old);
            setHead(old);
        }else{
            Node newNode = new Node(key,value);
            if(map.size()>=capacity){
                map.remove(end.key);
                remove(end);
                setHead(newNode);
            }else{
                setHead(newNode);
            }
            map.put(key,newNode);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
