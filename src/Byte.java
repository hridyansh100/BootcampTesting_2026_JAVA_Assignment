import java.util.Scanner;

public class Byte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a byte value: ");
        byte value = sc.nextByte();

        System.out.println("You entered byte: " + value);
    }
}