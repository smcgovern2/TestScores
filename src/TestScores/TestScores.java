package TestScores;

import java.util.*;

/**
 * This class holds an arraylist of scores and processes them
 * @author Sean McGovern
 * @version 1.0.0
 */
public class TestScores {

    private static ArrayList<Double> testScores;

    public TestScores(ArrayList<Double> testScores) {
        this.testScores = testScores;
    }

    /**
     * A method to average the test scores in the testScores arraylist
     * @return an average of the scores as a double
     * @throws InvalidTestScores when a test score exceeds 100 or is negative
     */
    public static double getAverage() throws InvalidTestScores {
        checkScores();
        double total = 0;
        for (Double d : testScores) {
            total += d;
        }

        return (total/testScores.size());

    }

    /**
     * A method to check the scores in the arraylist for validity
     * @throws InvalidTestScores when a test score exceeds 100 or is negative
     */
    public static void checkScores() throws InvalidTestScores {
        for (Double d: testScores) {
            if(d<0 || d>100){
                throw new InvalidTestScores("Score " + testScores.indexOf(d) + " is out of bounds");
            }
            
        }
        
    }

}
