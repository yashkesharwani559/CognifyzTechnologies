import java.util.Scanner;

// Created a Password Strength Checker in java.

class PasswordStrengthChecker {

    static String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String lowercase = "abcdefghijklmnopqrstuvwxyz";
    static String digits = "0123456789";
    static String specialCharacters = "~`! @#$%^&*()_-+={[}]|\\:;\"'<,>.?/";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n                      ~~~~~Program starts~~~~~");

        System.out.print("\nEnter the password: ");

        String password = sc.nextLine();

        int up = 0, low = 0, digit = 0, special = 0;

        for (int i = 0; i < password.length(); i++) {

            String ch = String.valueOf(password.charAt(i));

            if (uppercase.contains(ch)) {
                up++;
            } else if (lowercase.contains(ch)) {
                low++;
            } else if (digits.contains(ch)) {
                digit++;
            } else {
                special++;
            }
        }
        int count = 0;
        if (up > 0) {
            count++;
        }
        if (low > 0) {
            count++;
        }
        if (digit > 0) {
            count++;
        }
        if (special > 0) {
            count++;
        }

        System.out.println("");

        if (count == 4) {
            System.out.println(password + " :- this password is very strong.");
        } else if (count == 3) {
            System.out.println(password + " :- This password is strong.");
        } else if (count == 2) {
            System.out.println(password +" :- This password is comparatively weak.");
        } else {
            System.out.println(password + " :- This password is very weak.");
        }

        System.out.println("\n            ~~~~~Program completed successfully~~~~~\n");

        sc.close();
    }
}