package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node rightChild;
    private Node leftChild;

    public Node(String name) {
        this.name = name;
        this.rightChild = null;
        this.leftChild = null;
    }

    // if string does not exist in tree, make new node
    // add in appropriate location by comparing to the current node's name
    public void add(String nameOfNewNode) {
        if (nameOfNewNode.compareTo(name) < 0) {
            if (leftChild == null) {
                Node newNode = new Node(nameOfNewNode);
                this.leftChild = newNode;
            } else {
                this.leftChild.add(nameOfNewNode);
            }
        } else if (nameOfNewNode.compareTo(name) > 0) {
            if (rightChild == null) {
                Node newNode = new Node(nameOfNewNode);
                this.rightChild = newNode;
            } else {
                this.rightChild.add(nameOfNewNode);
            }
        } else {
            // equal to string so no addition
        }
    }

    // this method return a list of the entire tree's nodes in order from leftmost node to rightmost node
    public List<String> names() {
        List returnList = new ArrayList<String>();
        List leftList;
        List rightList;

        if (leftChild != null) {
            leftList = leftChild.names();
            returnList.addAll(leftList);
        }

        returnList.add(name);
        if (rightChild != null) {
            rightList = rightChild.names();
            returnList.addAll(rightList);
        }
        return returnList;
    }


}
