import java.util.*;
class PrintLetterA {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.close();
    for(int i = 0; i < n; i++) {
      System.out.print(" ");
    }
    System.out.print("*");
    int width = 3;
    for(int j = 1; j <= n; j++) {
      if(j == 1) {
        System.out.println();
        continue;
      }
      for(int k = n - j; k > -1; k--) {
        System.out.print(" ");
      }
      for(int l = width; l > 0; l--) {
        if(l ==  width || l == 1)
          System.out.print("*");
        else {
          if(j == (n / 2) + 1)
            System.out.print("*");
          else
            System.out.print(" ");
        }
          
      }
      System.out.println();
      width += 2;
    }
  }
}
