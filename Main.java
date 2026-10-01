import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\nWELCOME TO YOUR GAMES!!");
        Scanner scanInput = new Scanner(System.in);
        char choice;
        choice = menu(scanInput);

        while (choice != 'Q') {
            //test for choice type and call appropriate Game
            if (choice == 'L')
                Games.lotteryGame(scanInput);

            if (choice == 'C')
                Games.playCraps(scanInput);

            if (choice == 'R')
                Games.playRockPaperScissors(scanInput);

            if (choice == 'B')
                Games.playBlackjack(scanInput);

            if (choice == 'H')
                Games.playHangman(scanInput);

            choice = menu(scanInput);
        }

        System.out.println("Thanks for playing!");

        scanInput.close();
    }

    public static char menu(Scanner scanInput) {
        char choice = 'Q';
        String inputString;

        //menu loop
        //   print menu
        System.out.println("L - Lottery");
        System.out.println("C - Craps");
        System.out.println("R - Rock, Paper, Scissors");
        System.out.println("B - Blackjack");
        System.out.println("H - Hangman");
        System.out.println("Q - Quit");

        //   prompt user, get response & convert to upper case
        System.out.print("What choice do you prefer: ");
        inputString = scanInput.nextLine();

        while (inputString.length() == 0) {
            System.out.print("Please enter L, C, R, B, H or Q: ");
            inputString = scanInput.nextLine();
        }

        choice = inputString.toUpperCase().charAt(0);

        //   verify that the choice is L, S, R, B, H or Q 
        while (choice != 'L' && choice != 'C' && choice != 'R' && choice != 'B' && choice != 'H' && choice != 'Q') {
            System.out.print("Please enter L, C, R, B, H or Q: ");
            inputString = scanInput.nextLine();

            while (inputString.length() == 0) {
                System.out.print("Please enter L, C, R, B, H or Q: ");
                inputString = scanInput.nextLine();
            }

            choice = inputString.toUpperCase().charAt(0);
        }

        return choice;
    }
}