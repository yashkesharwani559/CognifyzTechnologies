import java.util.Random;
import java.util.Scanner;

// Created a Random password generator using Java where it takes the length of the password as input and asks do you want to include uppercase, lowercase, digits and special characters or not. And after it returns the password according to the user.

class RandomPasswordGenerator {

    static String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String lowercase = "abcdefghijklmnopqrstuvwxyz";
    static String digits = "0123456789";
    static String specialCase = "~`!@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";

    public static void main(String[] args) {

        System.out.println("\n                            ~~~~~Program starts~~~~~");

        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nEnter the length of the password which you want to generate: ");
        int length = sc.nextInt();

        System.out.println("\n\nEnter 1 for yes and 0 for no in the below questions:\n");

        int[] arr = new int[4];

        System.out.print("Do you want uppercase letters in your password: ");
        arr[0] = sc.nextInt();

        System.out.print("Do you want lowercase letters in your password: ");
        arr[1] = sc.nextInt();

        System.out.print("Do you want digits(from 0 to 9) in your password: ");
        arr[2] = sc.nextInt();

        System.out.print("Do you want special characters in your password: ");
        arr[3] = sc.nextInt();

        System.out.println("");

        String password = "";

        String combineChars = "";

        if ((arr[0] == 1 || arr[0] == 0) && (arr[1] == 1 || arr[1] == 0) && (arr[2] == 1 || arr[2] == 0)
                && (arr[3] == 1 || arr[3] == 0)) 
        {
            for (int i = 0; i < length; i++) {

                if (arr[0] == 1) {
                    if (arr[1] == 1) {
                        if (arr[2] == 1) {
                            if (arr[3] == 1) {
                                combineChars = uppercase + lowercase + digits + specialCase;
                            } else {
                                combineChars = uppercase + lowercase + digits;
                            }
                        } else {
                            if (arr[3] == 1) {
                                combineChars = uppercase + lowercase + specialCase;
                            } else {
                                combineChars = uppercase + lowercase;
                            }
                        }
                    } else {
                        if (arr[2] == 1) {
                            if (arr[3] == 1) {
                                combineChars = uppercase + digits + specialCase;
                            } else {
                                combineChars = uppercase + digits;
                            }
                        } else {
                            if (arr[3] == 1) {
                                combineChars = uppercase + specialCase;
                            } else {
                                combineChars = uppercase;
                            }
                        }
                    }
                } else {
                    if (arr[1] == 1) {
                        if (arr[2] == 1) {
                            if (arr[3] == 1) {
                                combineChars = lowercase + digits + specialCase;
                            } else {
                                combineChars = lowercase + digits;
                            }
                        } else {
                            if (arr[3] == 1) {
                                combineChars = lowercase + specialCase;
                            } else {
                                combineChars = lowercase;
                            }
                        }
                    } else {
                        if (arr[2] == 1) {
                            if (arr[3] == 1) {
                                combineChars = digits + specialCase;
                            } else {
                                combineChars = digits;
                            }
                        } else {
                            if (arr[3] == 1) {
                                combineChars = specialCase;
                            } else {
                                combineChars = "";
                            }
                        }
                    }
                }
                if (combineChars.length() != 0) {

                    Random ran = new Random();
                    char ch;
                    ch = combineChars.charAt(ran.nextInt(combineChars.length()));

                    password += String.valueOf(ch);
                }
            }
            if (combineChars.length() != 0) {
            System.out.println("\n\nPassword Generated: " + password + "\n");
        }
        }else {
            System.out.println("Wrong input! Try again.");
        }

        System.out.println("\n              ~~~~~Program successfully completed~~~~~\n");

        sc.close();

    }
}