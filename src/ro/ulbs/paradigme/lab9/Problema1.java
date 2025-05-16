package ro.ulbs.paradigme.lab9;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Problema1 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        for(int i=0;i<10;i++) {
            list.add((int) (Math.random()*21 +5));
        }

        System.out.println(list);
        System.out.println("Sum: " + list.stream().mapToInt(n->n).sum());
        System.out.println("Max: " + list.stream().max((a,b)->a.compareTo(b)).get());
        System.out.println("Min: " + list.stream().min((a,b)->a.compareTo(b)).get());
        System.out.println("Numbers between 10 and 20: " +
                list.stream()
                        .filter(n -> n >= 10 && n <= 20)
                        .toList());
        ArrayList<Double> list2 = list.stream().map(n -> n*1.0).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Lista cu Double: " + list2);
        System.out.println(list.stream().anyMatch(n -> n == 12)?"Se  gaseste valoarea 12 in lista":"Nu se gaseste valoarea 12 in lista");
    }
}
