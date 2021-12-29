import java.util.Scanner; // Scanner class 

public class stringmuni {
    public static void main(String[] args) {
        System.out.println("Enter q to exit");
        Scanner sc = new Scanner(System.in); // Syntax
        while (true) {
            System.out.print("Enter your name : ");
            String a = sc.nextLine(); // take input
            if (a.equals("q")) {
                System.out.println("Happy coding!");
                sc.close();
                System.exit(0); // Terminate the code
            } else if (a.length() < 3 || a.length() > 10) {
                System.out.println("Invalid Name");
            } else  {
                System.out.println("Your name is " + a);
            }
        }
    }
}
