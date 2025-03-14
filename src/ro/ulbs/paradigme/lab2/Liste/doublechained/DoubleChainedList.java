package ro.ulbs.paradigme.lab2.Liste.doublechained;

import ro.ulbs.paradigme.lab2.Liste.api.MyList;
import ro.ulbs.paradigme.lab2.Liste.api.Node;

public class DoubleChainedList implements MyList {
    private DoubleChainedNode head;

    public DoubleChainedList() {
        this.head = null;
    }

    public void addValue(int value) {
        DoubleChainedNode newNode = new DoubleChainedNode(value);
        if (head == null) {
            head = newNode;
        } else {
            DoubleChainedNode temp = head;
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(newNode);
            newNode.setPrevNode(temp);
        }
    }

    public void removeNodeByValue(int value) {
        if (head == null) return;

        if (head.getValue() == value) {
            head = head.getNextNode();
            if (head != null) head.setPrevNode(null);
            return;
        }

        DoubleChainedNode temp = head;
        while (temp != null && temp.getValue() != value) {
            temp = temp.getNextNode();
        }

        if (temp != null) {
            if (temp.getNextNode() != null) temp.getNextNode().setPrevNode(temp.getPrevNode());
            if (temp.getPrevNode() != null) temp.getPrevNode().setNextNode(temp.getNextNode());
        }
    }

    public void listNodes() {
        DoubleChainedNode temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNextNode();
        }
        System.out.println();
    }

    public boolean isSorted() {
        if (head == null || head.getNextNode() == null) return true;

        DoubleChainedNode temp = head;
        while (temp.getNextNode() != null) {
            if (temp.getValue() > temp.getNextNode().getValue()) {
                return false;
            }
            temp = temp.getNextNode();
        }
        return true;
    }

    public Node getNodeByValue(int value) {
        DoubleChainedNode temp = head;
        while (temp != null) {
            if (temp.getValue() == value) return temp;
            temp = temp.getNextNode();
        }
        return null;
    }
}
