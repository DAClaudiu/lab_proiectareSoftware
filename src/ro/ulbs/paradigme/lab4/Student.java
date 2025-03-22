package ro.ulbs.paradigme.lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String nume;
    private String grupa;
    private List<Integer> note;

    public Student(String nume, String grupa) {
        this.nume = nume;
        this.grupa = grupa;
        note = new ArrayList();
    }

    public String getNume(){
        return nume;
    }

    public String getGrupa() {
        return grupa;
    }

    public List<Integer> getNote() {
        return note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(nume, student.nume) && Objects.equals(grupa, student.grupa) && Objects.equals(note, student.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, grupa, note);
    }

    public void adaugaNota(int nota) {
        note.add(nota);
    }

    public boolean esteIntegralist() {
       for(Object obj : note) {
           if(((Integer) obj)<5) {
               return false;
           }
       };
       return true;
    }

    public float getMedie() {
    Integer sum=0;
    for(Integer obj : note) {
        sum += obj;
    }
    return (float) sum /note.size();
    }
}
