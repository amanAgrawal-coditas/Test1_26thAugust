package Test1_26thAugust;
import java.util.*;


public class Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements");

            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
        System.out.println("the unsorted elements are");

            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
        java.util.Arrays.sort(arr);
        System.out.println("The sorted elements are");
        for (int i:arr)
        {
            System.out.println(i);
        }
        System.out.println("the 3rd largest element is "+ arr[(arr.length-3)]);
        for(int i=0;i<arr.length;i++)
        {
            if(i%2!=0)
                System.out.println("the element is at " + (i) + "elements are  " + arr[i]);
        }

    }
}
