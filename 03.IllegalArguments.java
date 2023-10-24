import java.util.Scanner;

public class aretalla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
while(true){
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        try {
            if (number < 0) {
                throw new IllegalArgumentException("Number must be positive");
            }
            System.out.println("You entered a valid number: " + number);
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException occurred: " + e.getMessage());
        }
    }
}
}a
