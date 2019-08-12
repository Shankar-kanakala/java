//Program to generate prime numbers using Sieve of Eratosthenes algorithm.
import java.util.*;
public class SieveofEratosthenes
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> primelist = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++) {
            primelist.add(i);
        }
        for(int k = 0; k < primelist.size();k++) {
            for(int l = k + 1; l < primelist.size(); l++) {
                if(primelist.get(l) % primelist.get(k) == 0)
                {
                    primelist.remove(l);
                }
                    
            }
        }
        System.out.println(primelist);
    }
    
}
