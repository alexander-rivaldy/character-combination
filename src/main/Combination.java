package main;

import java.util.ArrayList;

/**
 * Created by Alexander on 22/07/2018.
 */
public class Combination {

    ArrayList<Character> chars = new ArrayList<Character>();
    int combinationLen;

    /**
     * default constructor, create combination with values from the specs
     */
    public Combination(){
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        combinationLen = 5;
    }

    /**
     * constructor that takes parameters (could be from user input in later iteration)
     *
     * @param chars all characters available
     * @param combinationLen combination length desired
     */
    public Combination(ArrayList<Character> chars, int combinationLen){
        this.chars = chars;
        this.combinationLen = combinationLen;
    }

    /**
     * function to initiate the print recursion
     */
    public void recurringPrintInitial(){
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        recurringPrint(indexes);
    }

    /**
     * recursive function to get all possible combinations
     *
     * @param indexes list of indexes to determine order
     */
    public void recurringPrint(ArrayList<Integer> indexes){
        for(int i=0; i<chars.size(); i++){
            //adding current iteration into the index list to determine order
            indexes.add(i);

            //if indexes stored is the same number as the combination length,
            //print the letters and delete the last index to iterate to the next one
            if(indexes.size() == combinationLen){
                printOne(indexes);
                indexes.remove(indexes.size()-1);
            }
            //if the indexes stored is not yet enough for the combination,
            //call the recurringPrint function again
            else {
                recurringPrint(indexes);
                //removing the last index to iterate to the next one (avoiding unnecessary recursion)
                indexes.remove(indexes.size()-1);
            }
        }
    }

    /**
     * function to print one combination
     *
     * @param indexes list of indexes to determine order
     */
    public void printOne(ArrayList<Integer> indexes){
        for(int i: indexes){
            System.out.print(chars.get(i));
        }
        System.out.println();
    }
}
