package ro.ulbs.paradigme.lab3.util;

public class Application {
    public static void main(String[] args) {
        PasswordMaker passwordMaker = PasswordMaker.getInstance("Michael");
        System.out.println(passwordMaker.getPassword());
        PasswordMaker passwordMaker2 = PasswordMaker.getInstance("John");
        System.out.println(passwordMaker2.getPassword());
        System.out.println(PasswordMaker.getInstanceCount);

    }
}
