package TestScores;

import java.util.ArrayList;
/**
 * This is the main class of TestScores
 * @author Sean McGovern
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) throws InvalidTestScores {

        ArrayList<Double> scores = new ArrayList<Double>();
        scores.add(90.0);
        scores.add(80.0);
        scores.add(70.0);

        TestScores testScores = new TestScores(scores);
        System.out.println(testScores.getAverage());

        scores.add(115.0);

        TestScores testScores1 = new TestScores(scores);

        System.out.println(testScores1.getAverage());

    }
}
