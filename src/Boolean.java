import java.util.Scanner;

public class Boolean {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you above 18? (true/false): ");
        boolean isAdult = sc.nextBoolean();

        if (isAdult) {
            System.out.println("You are allowed to enter.");
        } else {
            System.out.println("You are NOT allowed to enter.");
        }
    }
}