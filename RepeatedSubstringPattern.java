public class RepeatedSubstringPattern {


  public static void main(String[] args) {
    String str = "aba";

    for (int i = 0; i < str.length(); i++) {
      
      for (int j = i + 1; j <= str.length(); j++) {
        
        String sub = str.substring(i, j);

        
        System.out.print(sub + " ");

      }
      System.out.println();
    }
  }
  
}
