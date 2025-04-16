package Array.mycoding;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args) {

       int n1= 542;
       int n2= 452;

        int[] array1 = String.valueOf(n1).chars().sorted().toArray();
        int[] array2 = String.valueOf(n2).chars().sorted().toArray();

       if(Arrays.equals(array1, array2))
       {
           System.out.println("anagram");
       }


    }
}
