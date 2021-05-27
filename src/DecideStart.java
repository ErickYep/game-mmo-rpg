import java.util.Scanner;

public class DecideStart {
    static boolean go() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to decide who will start");
        scanner.nextLine();
        int myDice = 0;
        int oppDice = 0;
        while (myDice == oppDice) {
            myDice = Dice.getDice();
            System.out.println("---------------------");
            oppDice = Dice.getDice();
        }
        if (myDice > oppDice) {
            System.out.println("You will Start");
            return true;
        } else {
            System.out.println("Your opponent will Start");
            return false;
        }
    }
}
