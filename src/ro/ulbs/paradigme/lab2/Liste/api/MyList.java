package ro.ulbs.paradigme.lab2.Liste.api;

public interface MyList {
    boolean isSorted();
    void addValue(int value);
    void listNodes();
    Node getNodeByValue(int value);
    void removeNodeByValue(int value);

}
