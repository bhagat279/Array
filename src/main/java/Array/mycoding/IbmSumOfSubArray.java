package Array.mycoding;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IbmSumOfSubArray {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();

        arrList.add(4);
        arrList.add(5);
        arrList.add(6);

        //System.out.println(arrList);


       // System.out.println( subSubArrays(arrList));

        System.out.println( arrList.size()-1);
    }

    /*public  static long subSubArrays(List<Integer> list)
    {
        int totalSum = 0;

        int n= list.size();

        for(int i=0;i<n;i++)
        {
            int sumSubarray=0;
            for(int j=i;j<n;j++)
            {
                sumSubarray+= list.get(j);
                totalSum+= sumSubarray;

            }
        }
        return totalSum;

    }*/


   /*public  static long subSubArrays(List<Integer> list)
   {
       int totalSum=0;
       for (int i = 0; i < list.size(); i++) {
           // The number of subarrays in which arr[i] contributes
           int contributionCount = (i+1)* list.size()-1;

           // The total contribution of arr[i] is its value multiplied by the number of subarrays it appears in
           totalSum += list.get(i) * contributionCount;
       }
       return totalSum;

   }*/

  //==========================================use java-8==============================================

    /* public  static long subSubArrays(List<Integer> list)
   {
       int sum = IntStream.range(0, list.size())
               .mapToObj(i -> list.get(i) *(i + 1) * (list.size() - i))
               .mapToInt(obj -> obj)
               .sum();

       return sum;
   }*/






}

// 4+5=9
//  5+6=11
// 4+5+6 = 15
// 4=4
//5=5
// 6=6