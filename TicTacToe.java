package ARRAYS;

import java.util.Scanner;
import java.util.Stack;

class Grid {
    public static char[][] array = { { 'c', 'c', 'c' }, { 'c', 'c', 'c' }, { 'c', 'c', 'c' } };
    // public static char[][] array = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ',
    // ' ', ' ' } };

    public void display() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setMark(int n, int x, int y) {
        if (n % 2 == 0) {
            array[x][y] = 'X';
            return;
        } else if (n % 2 == 1) {
            array[x][y] = 'O';
            return;
        }
    }

    public int leftDiagonal() {
        int x = 0;
        int o = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    if (array[i][j] == 'X') {
                        x++;
                    } else if (array[i][j] == 'O') {
                        o++;
                    }
                }
            }
        }
        int __result__ = -1;
        if (__result__ == 1 || __result__ == 0) {
            return __result__;
        }
        if (x == array.length - 1) {
            __result__ = 1;
        } else if (o == array.length - 1) {
            __result__ = 0;
        }

        return -1;
    }

    public int rightDiagonal() {
        int x = 0;
        int o = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) == array.length - 1) {
                    if (array[i][j] == 'X') {
                        x++;
                    } else if (array[i][j] == 'O') {
                        o++;
                    }
                }
            }
        }
        int __result__ = -1;
        if (__result__ == 1 || __result__ == 0) {
            return __result__;
        }
        if (x == array.length) {
            __result__ = 1;
        } else if (o == array.length) {
            __result__ = 0;
        }
        return -1;
    }

    public int downSide() {
        int x = 0;
        int o = 0;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[j].length; i++) {
                if (array[j][i] == 'X') {
                    x++;
                } else if (array[j][i] == 'O') {
                    o++;
                }
            }
            if (j == array.length) {
                break;
            }
            x = 0;
            o = 0;
        }
        int __result__ = -1;
        if (__result__ == 1 || __result__ == 0) {
            return __result__;
        }
        if (x == array.length) {
            __result__ = 1;
        } else if (o == array.length) {
            __result__ = 0;
        }
        return -1;
    }

    public int straightSide() {
        int x = 0;
        int o = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 'X') {
                    x++;
                } else if (array[i][j] == 'O') {
                    o++;
                }
            }
            if (i == array.length) {
                break;
            }
            x = 0;
            o = 0;
        }
        int __result__ = -1;
        if (__result__ == 1 || __result__ == 0) {
            return __result__;
        }
        if (x == array.length) {
            __result__ = 1;
        } else if (o == array.length) {
            __result__ = 0;
        }
        return -1;
    }

    public static Stack<Integer> st = new Stack<>();

    public void resStack() {
        int LD = leftDiagonal();
        int RD = rightDiagonal();
        int DS = downSide();
        int SS = straightSide();

        if (LD == 0 || LD == 1) {
            st.push(LD);
        } else if (RD == 0 || RD == 1) {
            st.push(RD);
        } else if (DS == 0 || DS == 1) {
            st.push(DS);
        } else if (SS == 0 || SS == 1) {
            st.push(SS);
        }
    }

    public String getWinner() {
        if (st.size() == 0) {
            return "No Winner";
        } else {
            while (st.size() > 1) {
                int x = st.pop();
            }
        }
        if (st.peek() == 1) {
            return "Player 1 Wins the match";
        } else {
            return "Player 2 Wins the match";
        }
    }

}

public class TicTacToe {

    public static void main(String[] args) {
        int n = 0;
        int tracker = 0;
        Scanner input = new Scanner(System.in);
        Grid g = new Grid();
        int btn = -1;
        while (btn != 0) {
            if (n % 2 == 0) {
                System.out.println("Player 1 Turn");
                System.out.print("Enter X : ");
                int x = input.nextInt();
                System.out.print("Enter Y : ");
                int y = input.nextInt();
                g.setMark(n, x, y);
                if (n != 9) {
                    n++;
                }
            } else if (n % 2 == 1) {
                System.out.println("Player 2 Turn");
                System.out.print("Enter X : ");
                int x = input.nextInt();
                System.out.print("Enter Y : ");
                int y = input.nextInt();
                g.setMark(n, x, y);
                if (n != 9) {
                    n++;
                }
            }

            System.out.println();
            System.out.println();
            System.out.print("Press 0 for exit or press any button to continue : ");
            tracker++;
            btn = input.nextInt();
        }

        g.display();
        g.resStack();
        System.out.println(Grid.st);

        if (tracker == 9) {
            System.out.println(g.getWinner());
        }

    }
}
