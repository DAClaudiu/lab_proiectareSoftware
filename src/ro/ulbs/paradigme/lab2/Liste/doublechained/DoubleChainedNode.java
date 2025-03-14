package ro.ulbs.paradigme.lab2.Liste.doublechained;

import ro.ulbs.paradigme.lab2.Liste.api.Node;

public class DoubleChainedNode implements Node{
    private int value;
    private DoubleChainedNode next;
    private DoubleChainedNode prev;

    public DoubleChainedNode(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }


    public int getValue() {
        return value;
    }


    public void setValue(int value) {
        this.value = value;
    }

    public DoubleChainedNode getNextNode() {
        return next;
    }

    public void setNextNode(DoubleChainedNode next) {
        this.next = next;
    }

    public DoubleChainedNode getPrevNode() {
        return prev;
    }

    public void setPrevNode(DoubleChainedNode prev) {
        this.prev = prev;
    }
}
