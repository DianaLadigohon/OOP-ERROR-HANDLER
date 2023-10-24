import java.util.Scanner;

public class aretalla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.print("Enter the class name: ");
        String className = scanner.nextLine();

        try {
        
            Class<?> dynamicClass = Class.forName(className);

            
            System.out.println("Class loaded successfully: " + dynamicClass.getName());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
    }
}
}
