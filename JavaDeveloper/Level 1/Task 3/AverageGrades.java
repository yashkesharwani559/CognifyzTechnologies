import java.util.Scanner;

// Program that takes number of Grades and then takes all grades one by one as input. After that, it prints all the grades in a line and in the next line it prints the average of all grades

class AverageGrades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n                    ~~~~~Program starts~~~~~\n");

        System.out.print("Enter the number of Grades you want to enter: ");
        int length = sc.nextInt();

        System.out.println("");

        int[] grades = new int[length];

        for (int i = 0; i < length; i++) {

            System.out.print("Enter the Grades of the subject " + (i + 1) + " : ");
            grades[i] = sc.nextInt();

        }

        System.out.println("");

        System.out.print("Your all grades are:  ");

        double total = 0;

        for (int i = 0; i < length; i++) {

            System.out.print(grades[i] + " ");

            total += grades[i];

        }

        System.out.println("\n\nThe average of all grades is: " + (total / length));

        System.out.println("\n          ~~~~~Program completed successfully~~~~~\n");

        sc.close();
    }
}