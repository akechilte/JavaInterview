package com.company.ebay.BFS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mbiswas on 7/26/18.
 */
public class Node {
    int data;
    List<Node> neighbours;

    Node(int data)
    {
        this.data = data;
        this.neighbours=new ArrayList<>();

    }

    //Utility methods
    public void addneighbours(Node neighbourNode)
    {
        this.neighbours.add(neighbourNode);
    }
}
