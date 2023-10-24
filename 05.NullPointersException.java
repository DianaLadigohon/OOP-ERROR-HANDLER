import java.util.Scanner;

public class aretalla{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format");
        } catch (NullPointerException e) {
            System.err.println("NullPointerException occurred: " + e.getMessage());
        }
    }
}
}
