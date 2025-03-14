package ro.ulbs.paradigme.lab2.Liste;


import ro.ulbs.paradigme.lab2.Liste.simplechained.SimpleChainedList;
import ro.ulbs.paradigme.lab2.Liste.doublechained.DoubleChainedList;


public class Application  {
    public static void main(String[] args) {
        SimpleChainedList simpleList = new SimpleChainedList();
        for(int i=1;i<=10;i++) {
            simpleList.addValue(i);
        }
        System.out.println("Lista simplu înlănțuită este sortată? " + simpleList.isSorted());
        simpleList.removeNodeByValue(4);
        simpleList.removeNodeByValue(6);
        simpleList.removeNodeByValue(8);
        simpleList.removeNodeByValue(10);
        simpleList.listNodes();
        System.out.println("Lista simplu înlănțuită este sortată după eliminare? " + simpleList.isSorted());

        DoubleChainedList doubleList = new DoubleChainedList();
        for(int i=1;i<=10;i++) {
            doubleList.addValue(i);
        }
        System.out.println("Lista dublu înlănțuită este sortată? " + doubleList.isSorted());
        doubleList.removeNodeByValue(1);
        doubleList.removeNodeByValue(2);
        doubleList.removeNodeByValue(3);
        doubleList.listNodes();
        System.out.println("Lista dublu înlănțuită este sortată? " + doubleList.isSorted());
    }
}
