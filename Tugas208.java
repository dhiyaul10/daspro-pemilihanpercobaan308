import java.util.Scanner;
public class Tugas208 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        String username = "user111";
        String password = "password111";

        System.out.print("Enter username: ");
        String inputUsername = input08.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = input08.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login Successful. Welcome, " + "inputUsername ");
        }
        else {
          System.out.println("Login Failed. Please check your username and password");
        }
    }
}