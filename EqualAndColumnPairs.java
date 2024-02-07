public class EqualAndColumnPairs {

  public static void main(String[] args) {
    int[][] matrix = {
        { 3, 2, 1 },
        { 1, 7, 6 },
        { 2, 7, 7 }
    };
    
    int n = matrix.length;
    int count = 0;

    for (int i = 0; i < n; i++) {
      
      for (int j = 0; j < n; j++) {
        
        boolean flag = false;
        for (int k = 0; k < n; k++) {
          
          if (matrix[i][k] == matrix[k][j]) continue;
          else { 
            flag = !flag;
            break;
          }
        }
        if (flag == false) {
          count++;
        }
        
      }
    }
    System.out.println(count);
  }

}
