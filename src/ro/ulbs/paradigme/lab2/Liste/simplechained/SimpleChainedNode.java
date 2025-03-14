package ro.ulbs.paradigme.lab2.Liste.simplechained;

import ro.ulbs.paradigme.lab2.Liste.api.Node;

public class SimpleChainedNode implements Node{
    private int value;
    private SimpleChainedNode next;
    public SimpleChainedNode(int value) {
        this.value = value;
        this.next = null;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNextNode(SimpleChainedNode n){
        next = n;
    }

    public SimpleChainedNode getNextNode() {
        return next;
    }
}
