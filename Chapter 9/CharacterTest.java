
public class CharacterTest
{
    public static void main(String[] args){
    char ch = '5';
    String message = "Current character: " + Character.toString(ch) + "\n";
    if (Character.isLetter(ch)){
        message += "That is a letter.";
    }
    if (Character.isDigit(ch)){
        message += "That is a number.";
    }
System.out.println(message);
    }
}
