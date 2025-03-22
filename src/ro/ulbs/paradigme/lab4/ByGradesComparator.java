package ro.ulbs.paradigme.lab4;

import java.util.Comparator;

public class ByGradesComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getMedie() == o2.getMedie()) {
            return 0;
        }
        return o1.getMedie() < o2.getMedie() ? 1 : -1; //descrescator
    }
}
