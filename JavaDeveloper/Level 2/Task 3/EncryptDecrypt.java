import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// Created a program in Java to encrypt and decrypt the contents of the file using simple encryption algorithm.
// Here we first take file path as input and after that we ask for the key to be used in encryption/decryption and after it we ask that the user wants to encrypt or decrypt the file

public class EncryptDecrypt{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n            ~~~~~Program starts~~~~~\n");

        System.out.print("Enter the path of the file: ");
        String fpath = sc.nextLine();

        File file = new File(fpath);

        System.out.print("\nEnter the key value in integer to encrypt or decrypt the file: ");
        int key = sc.nextInt();

        System.out.println("\nRemember the key "+ key + " for fuutre use.");

        System.out.print("\nDo you want to encrypt or decrypt the file:\n \nType 'encrypt' for encryption and 'decrypt' for decryption: ");
        
        sc.nextLine();
        String choice = sc.nextLine();

        if (choice.toLowerCase().equals("encrypt")) {

            fileOperation(file, key);

        } else if (choice.toLowerCase().equals("decrypt")) {

            fileOperation(file, key);

        } else {

            System.out.println("Wrong input. Try again!!!");

        }

        System.out.println("\n              ~~~~~Program ends~~~~~\n");

        sc.close();

    }

    public static void fileOperation(File file, int key) {

        try {

            FileReader fr = new FileReader(file);

            int ch;

            String s = "";

            while ((ch = fr.read()) != -1) {

                char c = (char) (ch ^ key);

                s += String.valueOf(c);
            }

            PrintWriter pw = new PrintWriter(file);

            pw.write(s);

            pw.close();

            System.out.println("\nOperation completed successfully.");

            fr.close();

        } catch (IOException e) {

            System.out.println("\nOperation not completed\n");

            System.out.println(e.getMessage());
        }
    } 
    
}