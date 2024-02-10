public class WordSearch {

  static boolean search(char[][] board, String word, int row, int col, int count) {
    if (count == word.length())
      return true;

    if (row == board.length || row < 0 || col == board[0].length || col < 0 || board[row][col] == '*' || board[row][col] != word.charAt(count)) {
      return false;
    }
    char ch = board[row][col];

    board[row][col] = '*';
    boolean top = search(board, word, row - 1, col, count + 1);
    boolean right = search(board, word, row, col + 1, count + 1);
    boolean bottom = search(board, word, row + 1, col, count + 1);
    boolean left = search(board, word, row, col - 1, count + 1);
    board[row][col] = ch;

    return top || right || bottom || left;
  }

  public static void main(String[] args) {
    char[][] board = {
        { 'A', 'B', 'C', 'E' },
        { 'S', 'F', 'C', 'S' },
        { 'A', 'D', 'E', 'E' }
    };
    String str = "ABCCED";
    String[] words = { "ASA" ,"SFCSE" ,"ASADEE" };

    for (int i = 0; i < board.length; i++) {
      
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == str.charAt(0) && search(board, str, i, j, 0)) {
          System.out.println(true);
          return;
        }
      }
    }
    System.out.println(false);
    return;    
  }
}

