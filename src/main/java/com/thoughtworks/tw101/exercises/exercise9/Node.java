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

    public void add(String nameOfNewNode) {
        if (nameOfNewNode.compareTo(name) < 0) {
            if (leftChild == null) {
                Node newNode = new Node(nameOfNewNode);
                this.leftChild = newNode;
            }
            else {
                this.leftChild.add(nameOfNewNode);
            }
        }
        else if (nameOfNewNode.compareTo(name) > 0) {
            if (rightChild == null) {
                Node newNode = new Node(nameOfNewNode);
                this.rightChild = newNode;
            }
            else {
                this.rightChild.add(nameOfNewNode);
            }
        }
        else {
            // equal to string so no addition
        }
    }

    public List<String> names() {
        List returnList = new ArrayList<String>();
        List leftList;
        List rightList;

        if (leftChild!=null) {
            leftList = leftChild.names();
            returnList.addAll(leftList);
        }

        returnList.add(name);
        if (rightChild!=null) {
            rightList = rightChild.names();
            returnList.addAll(rightList);
        }
        return returnList;
    }



}
