/**
 This class demonstrates the TestScores class.
 */
public class TestScoresDemo
{
   public static void main(String[] args){
    int[] testResults = {100, 90, -10, 102, 70, 89}; // Array of scores to be analyzed
    TestScores t1 = new TestScores(testResults); // Creates TestScores object t1, containing the testResults array
    
    System.out.println("Test Scores: ");
    for (int val : testResults){
        System.out.println(val); // Displays the values inside the testResults array
    }
    
    System.out.println();
    double average = t1.getAverage(); 
    /* 
     The above line calls on the TestScores class's getAverage method, linking the result with the "average" variable
    */
    System.out.println();
    System.out.println("The average is: " + average); // Displays the average of the scores inside the testResults array
}    
}
