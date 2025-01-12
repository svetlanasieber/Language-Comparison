import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = ""; 

        for (int position = username.length() - 1; position >= 0; position--) {
            char symbol = username.charAt(position); 
            password += symbol; //password = password + symbol;
        }

        String enteredPassword = scanner.nextLine();
        int countWrongAttempts = 0; 
        while (!enteredPassword.equals(password)) {
            countWrongAttempts++;
            if (countWrongAttempts == 4) {
                System.out.printf("User %s blocked!", username);
                return; 
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", username);
    }
}
