package ro.ulbs.paradigme.lab3.util;

public class Application {
    public static void main(String[] args) {
        PasswordMaker passwordMaker = new PasswordMaker("John");
        System.out.println(passwordMaker.getPassword());


    }
}
