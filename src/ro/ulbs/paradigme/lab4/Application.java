package ro.ulbs.paradigme.lab4;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {

        // 4.5.1
        System.out.println("4.5.1");
        System.out.println();
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList();
        java.util.Random rand = new java.util.Random();

        for (int i =0 ; i < 5; i++) {
        x.add(rand.nextInt(11));
        }
        for (int i =0 ; i < 7; i++) {
            y.add(rand.nextInt(11));
        }
        System.out.print("x: ");
        for(Object object:x) {
            System.out.print(object+ " ");
        }
        System.out.println();
        System.out.print("y: ");
        for(Object object:y) {
            System.out.print(object+ " ");
        }
        System.out.println();

        Collections.sort(x);
        Collections.sort(y);

        System.out.print("sorted x: ");
        for(Object object:x) {
            System.out.print(object+ " ");
        }
        System.out.println();
        System.out.print("sorted y: ");
        for(Object object:y) {
            System.out.print(object+ " ");
        }
        System.out.println();

        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.print("sorted xPlusY: ");
        for(Object object:xPlusY) {
            System.out.print(object+ " ");
        }
        System.out.println();

        zSet.addAll(x);
        zSet.addAll(y);
        System.out.print("xSet: ");
        for(Object object:zSet) {
            System.out.print(object+ " ");
        }
        System.out.println();

        for(Integer object:x) {
            if(!y.contains(object)) {
                xMinusY.add(object);
            }
        }
        System.out.print("xMinusY: ");
        for(Object object:xMinusY) {
            System.out.print(object+ " ");
        }
        System.out.println();

        xPlusYLimitedByP.addAll(x);
        xPlusYLimitedByP.addAll(y);
        xPlusYLimitedByP.removeIf(object -> object > p);
        System.out.print("xPlusYLimitedByP: ");
        for(Object object:xPlusYLimitedByP) {
            System.out.print(object+ " ");
        }
        System.out.println();
        System.out.println();


        System.out.println("4.5.2 + 4.5.3");
        List<Student> lista_studenti = new ArrayList<>();
        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String name = myReader.next() + " " + myReader.next();
              String group = myReader.next();
              Student student = new Student(name, group);
              for(int i=0;i<4;i++) {
                  student.adaugaNota(Integer.parseInt(myReader.next()));
              }

              lista_studenti.add(student);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Map<Student, Integer> student_map = new HashMap<>();
        for(Student student:lista_studenti) {

            if(student_map.containsKey(student)) {
            student_map.replace(student, student_map.get(student) + 1);
            }
            else{
                student_map.put(student, 1);
            }
        }



        for(Object student:lista_studenti) {
            System.out.println(((Student) student).getNume() + " " + ((Student) student).getGrupa() );
        }
        System.out.println();

        lista_studenti.sort(new ByGroupComparator());
        System.out.println("Studenti dupa grupa: ");
        for(Student student:lista_studenti) {
            System.out.println(student.getNume() + " " + student.getGrupa() );

        }
        System.out.println();

        List<Student> lista_integralisti =new ArrayList<>();
        List<Student> lista_restantieri =new ArrayList<>();
        for(Student object:lista_studenti) {
            if(object.esteIntegralist()) {
                lista_integralisti.add(object);
            }
            else{
                lista_restantieri.add(object);
            }
        }

        lista_integralisti.sort(new ByGradesComparator());
        System.out.println("Studenti integralisti dupa media notelor: ");
        for(Student student:lista_integralisti) {
            System.out.println(student.getNume() + " " + student.getGrupa()  );

        }
        System.out.println();

        lista_restantieri.sort(new ByResitComparator());
        System.out.println("Studenti restantieri dupa nr de restante: ");
        for(Student student:lista_restantieri) {
            System.out.println(student.getNume() + " " + student.getGrupa()  );
        }
        System.out.println();
        System.out.println();

        System.out.println("Studentii cu nr de aparitii: ");
        for(Student student:student_map.keySet()) {
            System.out.println(student.getNume() + " " + student_map.get(student));

        }












    }



}


