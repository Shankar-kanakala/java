/*Q. Read an array elements of size n. 
   if the input array is {6,6,4,7,5,4,4,3}, then modify the array to {4,6,3,5,7}. 
   If frequencies of some elements are the same, print them in Ascending order.
Sol.*/
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //Input
    int ArLen = scan.nextInt(), Arr[];
    Arr = new int[ArLen];
    for(int index = 0; index < ArLen; index++) {
      Arr[index] = scan.nextInt();
    }
    //Solution
    Arrays.sort(Arr);
    List<Integer> FreqCount = new ArrayList<Integer>();
    List<Integer> FreqEle = new ArrayList<Integer>();
    for(int i = 0; i < ArLen; i++) {
      int Freq = 1;
      if(Arr[i] == -1) {
          continue;
      }
      for(int j = i + 1; j < ArLen; j++) {
        if(Arr[i] == Arr[j]) {
          Arr[j] = -1;
          Freq++;
        }  
      }
      FreqEle.add(Arr[i]);
      FreqCount.add(Freq);
    }
    System.out.println(FreqEle);
    System.out.println(FreqCount);
    int size = FreqEle.size();
    for(int k = 0, max, index; k < size; k++) {
      max = Collections.max(FreqCount);
      index = FreqCount.indexOf(max);
      System.out.print(FreqEle.get(index)+" ");
      FreqEle.remove(index);
      FreqCount.remove(index);
    }
    
    System.out.println();
    //System.out.println(FreqEle);
    //System.out.println(FreqCount);

    scan.close();
  }
}
/*
Sample Input:
Number of Elements : 8
6 6 4 7 5 4 4 3

if frequency of elements is same then consider element order(Ascending).

Sample Output:
4 6 3 5 7

*/
