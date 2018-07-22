package main;

import java.util.ArrayList;

public class Main {

    /**
     * main function to start the program
     *
     * @param args can be used in later iteration for user input
     */
    public static void main(String[] args) {
        int combinationLen = 5;
        ArrayList<Character> chars = new ArrayList<Character>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');

        Combination combination = new Combination(chars, combinationLen);
        combination.recurringPrintInitial();
    }

}
