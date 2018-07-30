package com.company.ebay.DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mbiswas on 7/26/18.
 */
public class Node {

    int data;
    List<Node> neighbours;

    public Node(int data){
        this.data = data;
        this.neighbours = new ArrayList<>();
    }

    public void addneighbours(Node node){
        this.neighbours.add(node);
    }
}
