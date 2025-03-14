package ro.ulbs.paradigme.lab3.util;


public class StringRandomizer {
    protected char[] randomString;

    protected StringRandomizer(int nr) {
        randomString = new char[nr];
        for (int i = 0; i < nr; i++) {
            int rand = (int) (Math.random() * 52 ); // Generate number between 0 and 51
            if (rand < 26) {
                randomString[i] = (char) (65 + rand); // Uppercase letters (A-Z)
            } else {
                randomString[i] = (char) (97 + (rand - 26)); // Lowercase letters (a-z)
            }
        }
    }
}