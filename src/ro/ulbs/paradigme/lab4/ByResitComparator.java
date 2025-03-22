package ro.ulbs.paradigme.lab4;

import java.util.Comparator;

public class ByResitComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int nr1=0,nr2=0;
        for(Integer nota:s1.getNote()) {
            if(nota<5) {
                nr1++;
            }
        }
        for(Integer nota:s2.getNote()) {
            if(nota<5) {
                nr2++;
            }
        }
        return nr1-nr2;
    }
}
