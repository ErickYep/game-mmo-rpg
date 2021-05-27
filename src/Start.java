import java.util.Random;
import java.util.Scanner;

public class Start {
    void startGame() {
        Warrior mySoldier = null;
        Warrior opponent = null;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        opponent = villainChoose();
        mySoldier = playerChoose();
        if (DecideStart.go()) {
            System.out.println("To Start press Enter");
            scanner.hasNextLine();
            Battle.start(mySoldier, opponent);
        } else {
            System.out.println("To Start press Enter");
            scanner.hasNextLine();
            Battle.start(opponent, mySoldier);
        }
    }

    private Warrior playerChoose() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        Warrior player = null;
        while (choice > 3 || choice < 1) {
            System.out.println("Which character do you want` 1.Mage, 2.Archer or 3.Swordsman");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    player = new Mage();
                    break;
                case 2:
                    player = new Archer();
                    break;
                case 3:
                    player = new Swordsman();
                    break;
                default:
                    System.out.println("Wrong number. Enter again");
            }
        }
        return player;
    }

    private Warrior villainChoose() {
        Random random = new Random();
        Warrior villain = null;
        switch (random.nextInt(3) + 1) {
            case 1:
                villain = new Mage();
                break;
            case 2:
                villain = new Archer();
                break;
            case 3:
                villain = new Swordsman();
                break;
        }
        return villain;
    }
}
