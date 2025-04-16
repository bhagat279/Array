package Array.mycoding;

import java.util.Scanner;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array_1 {
    public static void main(String[] args) {

//=============================================Code-1========================================================
       /* String a[]={"sooraj","77","101","99","mahato","4"};
        AtomicInteger cn= new AtomicInteger();
        AtomicInteger cs= new AtomicInteger();


        Arrays.stream(a).forEach(str->{
            try {
                Integer.parseInt(str);
                cn.getAndIncrement();
            }
            catch (Exception e)
            {
                cs.getAndIncrement();
            }
        });

        System.out.println(cn+":"+cs);*/
//================================================Code-2========================================================

       /* int[] arr = {5,10,2};

       int sum1 = Arrays.stream(arr).reduce(0,(a,b)->a+b);
       int sum = Arrays.stream(arr).sum();
       long sum2 = Arrays.stream(arr).summaryStatistics().getSum();


       int prod = Arrays.stream(arr).reduce(1, (a, b) -> a * b);


        System.out.println(sum1+":"+sum2+":"+prod);*/

//================================================Code-3========================================================

      /*  int[] arr = {-5,10,-6,4};
        int sumOfPositive = Arrays.stream(arr).filter(i -> i >0).sum();

       // long count = Arrays.stream(arr).filter(i -> i < 0).count();

        System.out.println(sumOfPositive);*/


//================================================Code-3==========================================================

      /*  int[] arr = {5,10,7,4};

        List<Integer> evenNumbers = Arrays.stream(arr).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());

        System.out.println(evenNumbers);*/


//================================================code 4========================================================
       /* int[] arr = {5, 3, 7, 4,0,1};

       // List<Integer> allFacts = Arrays.stream(arr).mapToObj(n -> fact(n)).collect(Collectors.toUnmodifiableList());

        List<Integer> allFacts = Arrays.stream(arr).mapToObj(Array_1::fact).collect(Collectors.toUnmodifiableList());

        System.out.println(allFacts);

    }

    public static int fact(int n)
    {
        if(n==0||n==1) {
            return n;
        }
        else
        {
            int facts = IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
            return facts;
        }
    }*/
//======================================================================================================================

        //java program to find factorial of particular index element in an array?

      /*  int[] arr = {5, 3, 4, 4};

        int ind =2;
        int fact = fact(arr[ind]);
        System.out.println(fact);
    }

    public static int fact(int n)
    {
        int fact = IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
        return fact;
    }*/
//====================================================================================================================
        //java program to check prime numbers in an array?

        //  int[] arr = {3, 5, 7, 9, 6, 7, 2, 1};

        /*  int c=0,s=0;
        for(int i=0;i<arr.length;i++)
        {
            int f=0;
            for(int j=2;j<=arr[i]/2;j++)
            {
                if(arr[i]%j==0
                {
                    f=1;
                }
            }
            if(f==0)
            {
                System.out.println(arr[i]);
                c++;
                s+=arr[i];
            }

        }
        System.out.println(c+":"+s);*/
        //using java 8

       /* List<Integer> collect = Arrays.stream(arr).filter(n -> isPrime(n).get()).boxed().collect(Collectors.toUnmodifiableList());

        System.out.println(collect);

    }

    public static AtomicBoolean isPrime(int n) {
        AtomicBoolean b = new AtomicBoolean(true);

        if (n > 2) {
            IntStream.range(2, n).forEach(i -> {
                if (n % i == 0) {
                    b.set(false);
                }
            });

        } else {
            b.set(true);
        }
        return b;
    }*/
//============================================================================================================================
        //java program to delete prime numbers of an array?

    /*    int[] arr ={5,7,8,6,9,11,1,2};

        List<Integer> nonPrime = Arrays.stream(arr).boxed().filter(num->!isPrimeNum(num)).toList();

        System.out.println(nonPrime);
    }

    public  static AtomicBoolean isPrime(int num)
    {
        final int[] f = {0};

        IntStream.rangeClosed(2,num/2).forEach(i->{
            if(num%i==0)
            {
                f[0]=1;
            }
        });
        return f[0]==0;
    }*/

//====================================================================================================================

        ////java program to add/insert an element at a specific position in an array
      /*  int[] arr={5,6,7,9};
        int p=3;
        int ele=10;

        int[] arr2 = Arrays.copyOf(arr, arr.length + 1);

        for(int i = arr2.length-1;i>p-1;i--)
        {
            arr2[i] = arr2[i-1];
        }
        arr2[p-1] = ele;

        for(int i:arr2)
        {
            System.out.print(i+" ");
        }*/
//------------------------another way
      /*  int[] newArr = new int[arr.length+1];
        int k=0;
        for(int i=0;i<p-1;i++)
        {
            newArr[k] = arr[i];
            k++;
        }
        newArr[k] = ele;
        k++;

        for(int i =p-1;i<arr.length;i++)
        {
            newArr[k] = arr[i];
            k++;
        }

        for(int i:newArr)
        {
            System.out.print(i+" ");
        }*/
//===================================================================================================================
        ////java program to find average value of an array of integers except the largest and smallest elements?
       /* int[] arr={8,5,5,4};

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        double avg = Arrays.stream(arr).filter(n -> n != min && n != max).average().getAsDouble();

        System.out.println(avg);*/


        //===================================================================================================================
        //revrse using swipe


        int[] arr = {1, 2, 3, 4};
        int n = 4;
        IntStream.range(0, n / 2).forEach(i -> {

            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        });
        for (int j : arr) {
            System.out.print(j + " ");
        }
//====================================================================================================================
        //java program to print reverse of each element present in array?

      /* int[] arr ={255,565,8902,20};

        List<String> listRev = Arrays.stream(arr).mapToObj(n -> {
            String s = String.valueOf(n);

            String string = new StringBuilder(s).reverse().toString();

            return string;
        }).collect(Collectors.toList());

        System.out.println(listRev);*/

//=====================================================================================================================
        //  java program to find largest element in an array?

     /*   int[] arr ={100,20,40,10,30,50,5};

       int[] arr2 ={arr[0]};
        Integer max = Arrays.stream(arr).mapToObj(n -> {
            if (n < arr2[0]) {
                arr2[0] = n;
            }
            return arr2[0];
        }).reduce((a1, a2) -> a2).get();


        System.out.println(max);*/

       /* int[] arr ={100,20,40,10,30,50,5};

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);*/

        //====================================================================================================================

        // find 2nd max
      /*  int[] arr ={100,20,40,150,140,50,145};

        int max=arr[0];
        int secMax = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secMax = max;
                max = arr[i];
            }
            else if (arr[i]>secMax && arr[i]<max ) {

                secMax = arr[i];
            }
        }

        System.out.println(max+":"+secMax);*/

        //==================================================flatmap=================================================================

       /* List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("cherry", "date")
        );

        List<String> flatList = listOfLists.stream()
                .flatMap(l->l.stream())  // Flatten the list of lists into a single stream
                .collect(Collectors.toList());


        System.out.println(flatList);*/
        //======================================================avg=========================================================

       /*int[] arr = {5,6,8,9};

        double avg = Arrays.stream(arr).average().getAsDouble();

        System.out.println(avg);*/


        //=======================avg except largest and smallest===========================================================

       /* int[] arr = {55,6,8,9,20,10};

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        double avg = Arrays.stream(arr).filter(num -> num != max && num != min).average().getAsDouble();

        System.out.println(avg);*/


        //============================reverse using swapping================================================================

        /*int[] arr1= {1,2,3,4,5,6};

        int[] arr = reverseSwaping(arr1, arr1.length);

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }

    public  static int[] reverseSwaping(int[] arr, int n)
    {
        IntStream.range(0,n/2).forEach(i->{
            int t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
        });

        return arr;
    }*/

        //============================reverse each element persent in array===================================================

       /*int[] arr= {121,256,33,45,58,610};

        List<String> list = Arrays.stream(arr)
                .mapToObj(num ->{
                    String string = String.valueOf(num);
                    return new StringBuilder(string).reverse().toString();
                }).toList();

        System.out.println(list);*/



//==================================================java program to swap adjacent elements of an array?
//        int[] arr ={1,2,3,4,5,6};
//
//        int n= arr.length;

     /*  for(int i=0;i<n-1;i+=2)
       {
           int t=arr[i];
           arr[i] =arr[i+1];
           arr[i+1] =t;
       }

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }*/


        /*IntStream.range(0, n-1).filter(i -> i % 2 == 0)
                .forEach(i -> {

                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                });

        Arrays.stream(arr).forEach(System.out::println);*/


//==============================java program to sort an array in ascending order?====================================


       /* int[] arr = {5,4,7,2,8};


        List<Integer> list = Arrays.stream(arr).boxed().sorted((n1, n2) -> n1 > n2 ? 1 : n1 < n2 ? -1 : 0).collect(Collectors.toList());

        System.out.println(list);*/

//======================================//java program to sort string array in ascending and descending order?========

      /*  String[] arr ={"ravi","bhagat","akash"};

        List<String> list = Arrays.stream(arr).sorted((s1, s2) ->- s1.compareTo(s2)).toList();
        System.out.println(list);*/

//===================================//java program to find largest and  index of largest element of an array?

       /* int[] arr ={0,10,3,4,15};



        final int[] max = {arr[0]};

        final int[] ind = {0};

        IntStream.range(1,arr.length).forEach(i->{


            if(arr[i]> max[0])
            {
                max[0]= arr[i];
                ind[0] =i;
            }
        });

        System.out.println(max[0]+":"+ind[0]);*/

//=========================================//java program to find second largest element in an array?================

       /* int[] arr ={10,17,3,4,15,50,13,13,18,19};

        final int[] max ={arr[0]};
        final int[] secmax = {arr[1]};


        IntStream.range(1,arr.length).forEach(i->{
            if(arr[i]>max[0])
            {
               secmax[0] =max[0];
               max[0] = arr[i];
            }

            else if(arr[i]<max[0] && arr[i]>secmax[0])
            {
                secmax[0] =arr[i];
            }

        });

        System.out.println(max[0]+":"+secmax[0]);*/

//==============================================java program to find second smallest element in an array?

      /*  int[] arr ={0,17,3,2,15,13,13,18,19};

        final int[] min ={arr[0]};
        final int[] secMin = {arr[1]};

        IntStream.range(1,arr.length).forEach(i->{
            if(arr[i]<min[0])
            {
                secMin[0] =min[0];
                min[0] = arr[i];
            }

            else if(arr[i]>min[0] && arr[i]<secMin[0])
            {
                secMin[0] =arr[i];
            }

        });

        System.out.println(min[0]+":"+secMin[0]);*/

        //===========================java program to find 3rd smallest element in an array?

       /* int[] arr ={0,10,15,50,75,200,150};

        final int[] max ={arr[0]};
        final int[] secmax = {arr[1]};
        final int[] third = {arr[2]};
       // final int[] fourth = {arr[3]};


        IntStream.range(1,arr.length).forEach(i->{
            if(arr[i]>max[0])
            {

                third[0] = secmax[0];
                secmax[0] =max[0];
                max[0] = arr[i];
            }

            else if(arr[i]<max[0] && arr[i]>secmax[0])
            {
                third[0] =secmax[0];
                secmax[0] =arr[i];
            }
            else if(arr[i]>third[0])
            {
               third[0] =arr[i];
            }

        });

        System.out.println(max[0]+":"+secmax[0]+":"+third[0]);*/

//=======================================================kth max-min=====================================================


       /* int[] arr ={0,60,15,50,75,200,200,150};
        int k=1;


        TreeSet<Integer> treeSet = Arrays.stream(arr)
                                  .boxed().collect(Collectors.toCollection(TreeSet::new));


       *//* TreeSet<Integer> revSet = new TreeSet<>(Comparator.reverseOrder());
        revSet.addAll(treeSet);*//*



        ArrayList<Integer> arrayList = new ArrayList<>(treeSet);
        int n= arrayList.size();



        System.out.println(arrayList.get(k-1));
        System.out.println(arrayList.get(n-k));*/


////============================//java program to find frequency of an element in array?===========================================
        /*int[] arr ={10,10,15,50,75,200,200,20};

        Map<Integer, Long> collect = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(k -> k, TreeMap::new,Collectors.counting()));

        TreeMap<Integer, Long> revMap = new TreeMap<>(Comparator.reverseOrder());

        revMap.putAll(collect);

        revMap.forEach((k,v)-> System.out.println(k+":"+v));*/

        //=============================================//java program to find frequency of an element in array?

       /* int[] arr ={10,10,15,50,75,200,200,20};
        int k=10;

        long count = Arrays.stream(arr).filter(n -> n == k).count();
        System.out.println(count);*/
//=======================================//java program to find first most repeated/frequent element from an array?


      /*  int[] arr ={10,10,15,50,75,200,200,20};

        Map<Integer, Long> freq = Arrays.stream(arr).mapToObj(n -> n)
                .collect(Collectors.groupingBy(k -> k, LinkedHashMap::new, Collectors.counting()));


        Long max = freq.values().stream().max((v1, v2) -> v1 > v2 ? 1 : v1 < v2 ? -1 : 0).get();

        Map.Entry<Integer, Long> firstMostOccrs = freq.entrySet().stream().filter(entry -> entry.getValue() == max)
                .findFirst().get();


       System.out.println(firstMostOccrs);
*/

        //==========================java program to find kth most repeated/frequent element in  an array?

      /*  int[] arr ={10,10,15,50,75,200,200,20};



            int kth=3;

        Map<Integer, Long> freq = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(k -> k, Collectors.counting()));

        List<Map.Entry<Integer, Long>> collect = freq.entrySet().stream().sorted((e1, e2) -> -Long.compare(e1.getValue(), e2.getValue()))
                .collect(Collectors.toList());



        System.out.println(collect.get(kth-1));*/


        //Java program to find all Non-repeated/Unique/distinct elements in a array/Wap to find all elements which appears
        // only one time in array?


       /* int[] arr ={10,10,15,50,75,200,200,20};

        Map<Integer, Long> freq = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(k -> k, Collectors.counting()));

        freq.entrySet().stream().filter(e->e.getValue()==1)
                .forEach(System.out::println);*/

        //Java program to find first Non-repeated/Unique element in an array?

       /* int[] arr ={10,10,15,50,75,200,200,20};

        Map<Integer, Long> freq = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(k -> k, LinkedHashMap::new,Collectors.counting()));

        Map.Entry<Integer, Long> integerLongEntry = freq.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get();

        System.out.println(integerLongEntry);*/

//===================Java program to find kth Non-repeated/Unique element in an array? =========================================
       /* int[] arr ={10,10,15,50,75,200,200,20};

        int kth=3;

        Map<Integer, Long> freq = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(k -> k, LinkedHashMap::new,Collectors.counting()));

        List<Map.Entry<Integer, Long>> collect = freq.entrySet().stream().filter(e -> e.getValue() == 1).collect(Collectors.toList());

        System.out.println(collect.get(kth-1));*/


        //================================Java program to find all Repeated/Duplicates elements in an array?======================

       /* int[] arr ={10,10,15,50,75,200,200,20};

        Map<Integer, Long> freq = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(k -> k, Collectors.counting()));

        List<Map.Entry<Integer, Long>> allDuplicates = freq.entrySet().stream().filter(e -> e.getValue() > 1).collect(Collectors.toList());

        System.out.println(allDuplicates);*/


        //============================================================java program to find duplicate string from an array?

        /*String[] arr = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

        Map<String, Long> freq = Arrays.stream(arr).collect(Collectors.groupingBy(ks -> ks, Collectors.counting()));

        List<Map.Entry<String, Long>> allDuplicate = freq.entrySet().stream().filter(e -> e.getValue() > 1).collect(Collectors.toList());

        System.out.println(allDuplicate);*/

        //=========================================java program to find the elements which is exactly two times present in an array?

        /*int[] arr={4,5,8,6,2,8,5};


        LinkedHashMap<Integer, Long> freq = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        freq.entrySet().stream().filter(entry->entry.getValue()==2).forEach(System.out::println);*/

        //==================================java program to find missing element in an array?
       /* int[] a={4,1,2,5,6,9,8,7};

        int n= a.length;

         final int[] s={0};
         int expectedSum = IntStream.range(1, n+2).sum();

        IntStream.range(0,n).forEach(i->{
            s[0]+=a[i];
        });

        System.out.println("missing num is :"+ (expectedSum-s[0]));
*/

        //==============================Java program to find multiple missing numbers in array?




          /*  int[] a = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9,20 };

           int min = Arrays.stream(a).min().getAsInt();
           int max = Arrays.stream(a).max().getAsInt();

            Set<Integer> allElemnt = new HashSet<>();

            IntStream.rangeClosed(min,max).forEach(i->allElemnt.add(i));


            HashSet<Integer> existingNum = new HashSet<>();

            IntStream.range(0,a.length).forEach(i->{
                existingNum.add(a[i]);
            });


           allElemnt.removeAll(existingNum);

           System.out.println(allElemnt);*/


        //==========================================================java program to find missing elements between two ranges?


       /* int a[] = { 1, 3, 5, 4 };
        int low = 1, high = 10;

        Set<Integer> fullSet = new HashSet<>();

        IntStream.range(low,high+1).forEach(i->fullSet.add(i));

        Set<Integer> existingNum = new HashSet<>();

        IntStream.range(0,a.length).forEach(i->existingNum.add(a[i]));

        fullSet.removeAll(existingNum);

        System.out.println(fullSet);*/

//============================================java program to segregate 0 and 1 number ,1 first


        /*int a[] = { 0,1,1,0,1,0,1,0 ,1};

        int[] newArr = new int[a.length];

        final int[] sindex ={0};
        final int[] endindex ={a.length-1};

        IntStream.range(0,a.length).forEach(i->{
            if(a[i]>0)
            {
                newArr[sindex[0]] =a[i];
                sindex[0]++;
            }
            else {
                newArr[endindex[0]] =a[i];
                endindex[0]--;
            }
        });

        for(int i:newArr)
        {
            System.out.println(i);
        }*/

//==============================================java program to Rearrange positive and negative elements in alternative positions?
     /*   int[] arr = {5, 8, -9, 7, -3, -4, 4};

        // Separate the positive and negative numbers using streams
        List<Integer> positiveNumbers = Arrays.stream(arr)
                .filter(n -> n >= 0) // Filter positive numbers
                .boxed() // Convert int to Integer
                .collect(Collectors.toList());

        List<Integer> negativeNumbers = Arrays.stream(arr)
                .filter(n -> n < 0) // Filter negative numbers
                .boxed() // Convert int to Integer
                .collect(Collectors.toList());

        // Re-arranging the array in alternating positive and negative order
        List<Integer> result = new ArrayList<>();
        int i = 0;

       while (i<positiveNumbers.size() || i<negativeNumbers.size())
       {
           if(i<positiveNumbers.size())
           {
               result.add(positiveNumbers.get(i));
           }
           if(i<negativeNumbers.size())
           {
               result.add(negativeNumbers.get(i));
           }
           i++;
       }

        // Print the rearranged list
        System.out.println(result);*/


//=========================java program to segregate odd and even elements , even element should be first followed by odd elements?
        /* int[] arr = {4,3,6,4,7,3,9,1};
        final int start[] = {0};
        final int end[] = {arr.length-1};

        int[] arrNew = new int[arr.length];

        IntStream.range(0,arr.length).forEach(i->{
            if(arr[i]%2==0)
            {
                arrNew[start[0]] = arr[i];
                start[0]++;
            }
            else
            {
                arrNew[end[0]] = arr[i];
                end[0]--;
            }
        });

        for(int i: arrNew)
        {
            System.out.print(i+" ");
        }*/


// ======================================================java program to to find elements from odd and even index position?

        /*int[] arr = {4,3,6,4,7,3,9,1};

        List<Integer> listEven = new ArrayList<>();
        List<Integer> listOdd = new ArrayList<>();

        IntStream.range(0,arr.length).forEach(i->{
            if(i%2==0)
             listEven.add(arr[i]);
            else {
                listOdd.add(arr[i]);
            }
        });

        System.out.println("all even position num is :"+ listEven);
        System.out.println("all odd position num is :"+ listOdd);*/
    }
}


