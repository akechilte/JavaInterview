package com.company.ebay.DFS;


import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * Created by mbiswas on 7/26/18.
 */
public class DFSUsingNeighbourList {

    public static boolean dfsUsingStack(Node startNode, Node goalNode){

        if(startNode == null || goalNode == null){
            return false;
        }

        Stack<Node> stack = new Stack<>();
        Set<Node> visitedSet = new LinkedHashSet<>();
        stack.add(startNode);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            if(!visitedSet.contains(node)){
                visitedSet.add(node);
                if(node.data == goalNode.data){
                    return true;
                }
            }

            List<Node> neighbour = node.neighbours;
            stack.addAll(neighbour);
        }

        return false;
        
    }



    public static void main(String[] args) {
        Node node40 = new Node(40);
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node50 = new Node(50);
        Node node60 = new Node(60);
        Node node70 = new Node(70);

        Node node99 = new Node(99);


        node40.addneighbours(node10);
        node40.addneighbours(node20);
        node10.addneighbours(node30);
        node20.addneighbours(node10);
        node20.addneighbours(node30);
        node20.addneighbours(node60);
        node20.addneighbours(node50);
        node30.addneighbours(node60);
        node30.addneighbours(node70);
        node60.addneighbours(node70);
        node50.addneighbours(node70);


        Node start = node40;
        Node end = node70;


        System.out.println(dfsUsingStack(start, end));
    }
    }



