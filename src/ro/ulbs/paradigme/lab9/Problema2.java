package ro.ulbs.paradigme.lab9;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;


public class Problema2 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        int[] nr= {9,10,3,4,7,3,4};
        for (int j : nr) {
            list.add(j);
        }
        System.out.println(list);
        Set<Integer> set = list.stream().map(n->n*n).collect(Collectors.toSet());
        System.out.println(set);
    }
}
