//Program to convert a base 17 value to its decimal equivalent.
import java.util.*;
class Base17toDec {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    int result = 0;
    for(int index = 0; i < word.length(); index++) {
      int temp = 0;
      switch(word.charAt(index)) {
        case 'A' : temp = 10;
                  break;
        case 'B' : temp = 11;
                  break;
        case 'C' : temp = 12;
                  break;
        case 'D' : temp = 13;
                  break;
        case 'E' : temp = 14;
                  break;
        case 'F' : temp = 15;
                  break;
        case 'G' : temp = 16;
                  break;
        default : temp = Character.getNumericValue(word.charAt(index));
                  break;
      }
      result += (Math.pow(17, (word.length() - 1) - index)) * temp;
      
    }
    System.out.println(result);
    scan.close();
  }
}
