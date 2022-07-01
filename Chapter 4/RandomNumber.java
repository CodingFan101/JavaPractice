import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){
    Random randomNumbers = new Random();
    int number;
    for(int i = 1; i <= 10; i++){
    number = randomNumbers.nextInt(2);
    if (number == 1){
        System.out.println(number);
        System.out.println("Yes");
    }
    else if (number == 0){
        System.out.println(number);
        System.out.println("No");
    }
    }
}
}
