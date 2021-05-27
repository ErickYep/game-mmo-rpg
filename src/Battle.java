import java.util.Scanner;

public class Battle {
    static void start(Warrior warrior1, Warrior warrior2) {
        Scanner scanner = new Scanner(System.in);
        boolean winner;
        winner = isBattling(warrior1, warrior2, scanner);
        if (winner) {
            System.out.println("K.O. You Win");
        } else {
            System.out.println("You looser");
        }

    }


    private static boolean isBattling(Warrior warrior1, Warrior warrior2, Scanner scanner) {
        boolean winner;
        int temp = 0;
        int temp1 = 0;
        while (true) {
            warrior1.attack(warrior2, warrior1.getDamage());
            warrior2.takeDamage(warrior2, warrior1.getDamage());
            if (temp == 0)
                temp = warrior1.skillActivation();
            System.out.println("Player health - " + warrior1.getHealth());
            System.out.println("villain health - " + warrior2.getHealth());
            if (warrior2.getHealth() <= 0) {
                winner = true;
                break;
            }

            scanner.nextLine();

            warrior2.attack(warrior1, warrior2.getDamage());
            warrior1.takeDamage(warrior1, warrior2.getDamage());
            if (temp1 == 0)
                temp1 = warrior2.skillActivation();
            System.out.println("Player health - " + warrior1.getHealth());
            System.out.println("villain health - " + warrior2.getHealth());
            if (warrior1.getHealth() <= 0) {
                winner = false;
                break;
            }
        }
        scanner.nextLine();
        return winner;
    }
}
