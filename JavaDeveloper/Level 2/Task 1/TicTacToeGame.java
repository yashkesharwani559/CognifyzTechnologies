import java.util.Scanner;

// Created a Tic -Tac -Toe game using java

class TicTacToeGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

        char player = 'X';

        System.out.println("\n                  ~~~~~Game starts~~~~~");

        printBoard(board);

        System.out.println("Player1 has 'X' and Player2 has 'O':\n");

        boolean gameOver = false;

        int row, col;

        while (!gameOver) {

            System.out.print(player + "'s turn. So enter the row and index where you want to place: ");

            row = sc.nextInt();
            col = sc.nextInt();

            if (row < 0 || row > 2 || col > 2 || row < 0) {
                System.out.println("Wrong inputs");
                continue;
            }

            if (board[row][col] == ' ') {
                board[row][col] = player;
            } else {
                System.out.println("Already filled. Try Again!!!");
            }

            gameOver = isWin(board, player);
            
            printBoard(board);
            
            if (gameOver) {
            
                System.out.println("~~~~~~~~~~~~~ " + player + " WINS THE GAME~~~~~~~~~~ ");
            
            } else if (isFilled(board)) {
               
                System.out.println("The game is tied between both players.");
            
                break;
            
            }



            if (player == 'X') {

                player = 'O';
            
            } else {
                player = 'X';
            }

        }

        System.out.println("\n              ~~~~~ Game Ends ~~~~~\n");

        sc.close();

    }

    static void printBoard(char[][] board) {

        System.out.println("\n            --------------:BOARD:--------------\n");

        System.out.println("                       " + "0   1   2\n");

        for (int i = 0; i < board.length; i++) {
            System.out.print("                  " + i + " -> ");

            for (int j = 0; j < board[i].length; j++) {

                System.out.print(board[i][j]);

                if (j != 2) {
                    System.out.print(" | ");
                }
            }

            if (i != 2) {
                System.out.println("\n                     ______________");
            }
        }

        System.out.println("\n");
    }

    static boolean isWin(char[][] board, char player) {

        for (int i = 0; i < board.length; i++) {

                if ((board[i][0] == player && board[i][1] == player && board[i][2] == player)
                        || (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {

                    return true;

                }

                if ((board[0][0] == player && board[1][1] == player && board[2][2] == player)
                        || (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {

                    return true;
                }

        }

        return false;
    }

    static boolean isFilled(char[][] board) {

        boolean flag = true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }

        return flag;
    }

}