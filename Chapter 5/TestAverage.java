import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args){
    int sum = 0, testGrade,average1;
    char letterGrade;
    Scanner keyboard = new Scanner(System.in);
    for (int i = 1; i <= 5; i++){
        System.out.println("Enter a test grade: ");
        testGrade = keyboard.nextInt();
        sum += testGrade;
    }
    average1 = CalcAverage(sum);
    letterGrade = determineGrade(average1);
    System.out.println("Your average is " + average1 + ".");
    System.out.println("Your grade for the semester is " + letterGrade + ".");
    }
    public static int CalcAverage(int total1){
    int average2 = total1 / 5;
    return average2;
    }
    public static char determineGrade(int totalAverage){
    char letter = ' ';
    if (totalAverage < 60){
        letter = 'F';
    }
    else if (totalAverage >= 60 && totalAverage <= 69){
        letter = 'D';
    }
    else if (totalAverage >= 70 && totalAverage <= 79){
        letter = 'C';
    }
    else if (totalAverage >= 80 && totalAverage <= 89){
        letter = 'B';
    }
    else if (totalAverage >= 90 && totalAverage <= 100){
        letter = 'A';
    }
    return letter;
    }
}
