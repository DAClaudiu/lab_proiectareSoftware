package ro.ulbs.paradigme.lab4;

import java.util.Comparator;

public class ByGroupComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getGrupa().compareTo(s2.getGrupa());
    }
}
