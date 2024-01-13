import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\n                                  ~~~~~Program starts~~~~~");

        System.out.println("");
        
        System.out.print("Enter the word or phrase which you want to check that it is a palindrome or not: ");
        String test = sc.nextLine();

        String check = "";

        for (int i = 0; i < test.length(); i++) {
            
            char c = test.charAt(test.length() -i -1);
            check += String.valueOf(c);
        
        }

        if (check.equals(test)) {
           
            System.out.println("\nGiven word or phrase is a palindrome.");
       
        } else {
            
            System.out.println("\nGiven word or phrase is not a palindrome.");
        
        }

        System.out.println("");

        System.out.println("                           ~~~~~Program completed successfully~~~~~\n");

        sc.close();

    }
}