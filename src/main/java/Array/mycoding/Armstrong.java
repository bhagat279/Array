package Array.mycoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Armstrong {
    public static void main(String[] args) {

        int[] arr = {153,255,371,588};

        List<Integer> collect = Arrays.stream(arr).filter(n -> isArmstrong(n)).boxed().collect(Collectors.toList());
        System.out.println(collect);


    }

    /*public static boolean isArmstrong(int n)
    {
         int length = String.valueOf(n).length();

         int temp =n,sum=0,ld=0;

         while(temp!=0)
         {
             ld= temp%10;
             sum+= Math.pow(ld,length);
             temp =temp/10;
         }

        return n==sum?true:false;
    }*/

    public static boolean isArmstrong(int num) {
        int len = String.valueOf(num).length();
        String str = String.valueOf(num);
        int [] sum ={0};
        IntStream.range(0,len).forEach(i->{
            Integer digit = Integer.valueOf(str.substring(i, i + 1));
            sum[0]+=Math.pow(digit,len);
        });

        return sum[0]==num;

    }

}
