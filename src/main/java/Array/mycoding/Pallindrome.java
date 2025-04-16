package Array.mycoding;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pallindrome {
    public static void main(String[] args) {

     //   java program to print list of those elements which are palindrome in an array
     int[] arr ={121,25,131,150};

        List<Integer> collect = Arrays.stream(arr).filter(n -> isPallindrome(n)).boxed().collect(Collectors.toList());
        System.out.println(collect);

    }

   /* public static boolean isPallindrome(int n)
    {

        int temp=n;
        int rev=0;
        int ld=0;
      while(temp!=0)
      {
          ld= temp%10;
          rev =rev*10+ld;
          temp =temp/10;
      }
      if(n==rev)
      {
          return true;
      }
      return false;
    }*/

    public static boolean isPallindrome(int n)
    {
        String s= String.valueOf(n);

        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
