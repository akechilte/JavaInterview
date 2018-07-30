package com.company.ebay.BFS;

import java.util.*;

/**
 * Created by mbiswas on 7/26/18.
 */
public class BFSUsingNeighbourList {

    public static boolean bfsUsingQueue(Node startNode, Node goalNode) {
        if (startNode == null || goalNode == null) {
            return false;
        }

        Queue<Node> queue = new LinkedList<>();


        // To Retain Order
        Set<Node> visitedSet = new LinkedHashSet<>();

        queue.add(startNode);

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            //System.out.println("Node being looked at : " + node.data);

            if (!visitedSet.contains(node)) {
                visitedSet.add(node);
                if (node.data == goalNode.data) {
                    //printRoutes(visitedSet);
                    return true;
                }
                List<Node> neighbours = node.neighbours;
                queue.addAll(neighbours);
            }
        }

        System.out.println("Goal Node Not Found");
        return false;
    }


    public static void printRoutes(Set<Node> visitedSet) {
        for (Node node : visitedSet) {
            System.out.println("Visited : " + node.data);
        }

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


        System.out.println(bfsUsingQueue(start, end));


    }
}
