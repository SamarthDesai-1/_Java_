public class WinnerOfTicTacToe {

  static char checkRow(char[][] board) {
    char rowWIN = ' ';
    for (int i = 0; i < board.length; i++) {

      int A = 0;
      int B = 0;
      for (int j = 0; j < board.length; j++) {
        if (board[i][j] == 'X')
          A++;
        else if (board[i][j] == 'O')
          B++;
      }

      if (A == 3) {
        rowWIN = 'A';
        break;
      } else if (B == 3) {
        rowWIN = 'B';
        break;
      }
    }
    return rowWIN;
  }

  static char checkCol(char[][] board) {
    char colWIn = ' ';

    for (int i = 0; i < board.length; i++) {

      int A = 0;
      int B = 0;
      for (int j = 0; j < board.length; j++) {
        if (board[j][i] == 'X')
          A++;
        else if (board[j][i] == 'O')
          B++;
      }
      if (A == 3) {
        colWIn = 'A';
        break;
      } else if (B == 3) {
        colWIn = 'B';
        break;
      }
    }
    return colWIn;
  }

  static char checkLeftDiagonal(char[][] board) {
    int i = 0;
    int j = 0;
    int A = 0;
    int B = 0;
    while (i < board.length) {
      if (board[i][j] == 'X')
        A++;
      else if (board[i][j] == 'O')
        B++;
      i++;
      j++;
    }
    if (A == 3)
      return 'A';
    else if (B == 3)
      return 'B';

    return ' ';
  }

  static char checkRightDiagonal(char[][] board) {
    int i = 0;
    int A = 0;
    int B = 0;
    while (i < board.length) {
      if (board[i][board.length - i - 1] == 'X')
        A++;
      else if (board[i][board.length - i - 1] == 'O')
        B++;
      i++;
    }
    if (A == 3)
      return 'A';
    else if (B == 3)
      return 'B';

    return ' ';
  }

  public static void main(String[] args) {
    int[][] grid = {
        { 2, 2 }, { 0, 2 }, { 1, 0 }, { 0, 1 }, { 2, 0 }, {0,0}
    };
    int len = grid.length;
    int start = 1;
    char[][] board = new char[3][3];

    for (int i = 0; i < grid.length; i++) {
      if (start % 2 == 1)
        board[grid[i][0]][grid[i][1]] = 'X';
      else
        board[grid[i][0]][grid[i][1]] = 'O';
      start++;
    }

    char r = checkRow(board);
    char c = checkCol(board);
    char ld = checkLeftDiagonal(board);
    char rd = checkRightDiagonal(board);

    for (char[] arr : board) {
      for (char x : arr) {
        System.out.print(x + " ");
      }
      System.out.println();
    }

    if (r != ' ') {
      System.out.println(r);
      return;
    } else if (c != ' ') {
      System.out.println(c);
      return;
    } else if (ld != ' ') {
      System.out.println(ld);
      return;
    } else if (rd != ' ') {
      System.out.println(rd);
      return;
    }
    else if (len < 9) {
      System.out.println("Pending");
      return;
    }
    System.out.println("Draw");
    return;
  }
}
