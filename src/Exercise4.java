import java.util.Arrays;

public class Exercise4 {

    //Try creating an array to represent the tic-tac-toe board to the right
    //4.1 - how would you access the bottom right square with java code
    static String[][] tictactoe = {new String[]{"o", "x", "x"}, {"x", "o", "o"}, {"x", "o", "o"}};
    static int l = 0;
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(tictactoe[i][j] + " ");
                l++;
                if (l == 3) {
                    System.out.println(" ");
                    l = 0;
                }
            }
        }

        //4.1
        System.out.printf("%n%n%n %s", tictactoe[2][2]);
    }
}
