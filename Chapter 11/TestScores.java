/**
 This class works with an array of test scores and analyzes the values of each score.
 */
public class TestScores
{
    protected int[] scores; // To hold the test scores

    /**
     Constructor
     @param numbers The array to be linked with the "scores" array
     */
    public TestScores(int[] numbers)
    {
         scores = numbers;
    }

    /**
     The getAverage method calculates the average of all the test scores entered.
     @exception IllegalArgumentException Thrown when a test score is less than 0
     or greater than 100.
     @return The average of the test scores.
     */
    public double getAverage()
    {
    int total = 0, validScores = 0;
    double average;
        for (int i = 0; i < scores.length; i++){
            try{
            if (scores[i] < 0 || scores[i] > 100){
                // The code inside the "if" statement executes if the score is not within the range 0-100
                throw new IllegalArgumentException(); // Throws an IllegalArgumentException
            }
            else{
                // The code inside the "else" statement executes if the score is within the range 0-100
                System.out.println(scores[i] + " is being processed...");
                total += scores[i];
                validScores++;
            }
            }
            catch(IllegalArgumentException e){
                // The message below displays whenever an invalid score is detected
                System.out.println(scores[i] + " is not valid.");
            }
            finally{
            continue;
            // The loop continues onto the next score inside the array regardless of whether or not an exception was thrown
            }     
        }
    average = total / validScores;
    return average;
    }
}
