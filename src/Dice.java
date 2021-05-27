import java.util.Random;

public class Dice {
    public static int getDice() {
        Random random = new Random();
        int diceSide = random.nextInt(6) + 1;
        switch (diceSide) {
            case 1:
                String[][] side1 = {{"| ", "|", " |"}, {"| ", "0", " |"}, {"| ", "|", " |"}};
                printMatrix(side1);
                return 1;
            case 2:
                String[][] side2 = {{"| ", "|", " 0"}, {"| ", "|", " |"}, {"0 ", "|", " |"}};
                printMatrix(side2);
                return 2;
            case 3:
                String[][] side3 = {{"| ", "|", " 0"}, {"| ", "0", " |"}, {"0 ", "|", " |"}};
                printMatrix(side3);
                return 3;
            case 4:
                String[][] side4 = {{"0 ", "|", " 0"}, {"| ", "|", " |"}, {"0 ", "|", " 0"}};
                printMatrix(side4);
                return 4;
            case 5:
                String[][] side5 = {{"0 ", "|", " 0"}, {"| ", "0", " |"}, {"0 ", "|", " 0"}};
                printMatrix(side5);
                return 5;
            default:
                String[][] side6 = {{"0 ", "|", " 0"}, {"0 ", "|", " 0"}, {"0 ", "|", " 0"}};
                printMatrix(side6);
                return 6;
        }
    }

    static void printMatrix(String[][] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.print(strings[i][j]);
            }
            System.out.println();
        }
    }
}
