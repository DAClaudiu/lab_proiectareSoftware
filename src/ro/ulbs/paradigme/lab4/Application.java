package ro.ulbs.paradigme.lab4;

import java.util.*;

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


        System.out.println("4.5.2");
        List<Student> lista_studenti = new ArrayList<>();
        lista_studenti.add(new Student("Diana Oprea","223_2"));
        lista_studenti.add(new Student("Ion Popescu","223_1"));
        lista_studenti.add(new Student("Elena Dragomir","223_3"));
        lista_studenti.add(new Student("Maria Popa","223_2"));


        for(Student student:lista_studenti) {
           for(int i=0;i<5;i++) {
               student.adaugaNota(rand.nextInt(7)+4);
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








    }



}


