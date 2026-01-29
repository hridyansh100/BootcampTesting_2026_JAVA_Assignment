
import java.util.Scanner;

public class Charaters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Characters: ");
        String character = sc.next();   // or sc.nextLine()
        
        System.out.println("You entered: " + character);
    }
}
