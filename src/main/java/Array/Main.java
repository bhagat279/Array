package Array;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
       int[] arr = {1,0,5,7,9,10,12,13};

      List<Integer> listPrime =  Arrays.stream(arr).filter(n->isPrime(n).get()).boxed().toList();

        System.out.println(listPrime);
    }

    public static AtomicBoolean isPrime(int n)
    {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        if(n>2)
        {
            IntStream.range(2,n).forEach(i->{
                if(n%i==0)
                {
                    atomicBoolean.set(false);
                }
            });
        }
        else
        {
            atomicBoolean.set(true);
        }
        return atomicBoolean;
    }
}