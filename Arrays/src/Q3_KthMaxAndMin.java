import java.util.*;

public class Q3_KthMaxAndMin {
    public static void main(String[] args) {
        Integer arr[] = {7 ,10 ,4 ,3, 20 ,15};
        int N = 6; // Size of an array
        int K = 3; // Kth element
        kthSmallest(arr,3);
        ktlargest(arr,3);
    }

        static void kthSmallest(Integer arr[],  int k){
            // Sorting a string
            Arrays.sort(arr);
            System.out.println(k +"th Smallest element is: "+arr[k-1]);

        }

        static void ktlargest(Integer arr[], int k){
            // Sorting a string in reverse order
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(k +"th largest  element is: "+arr[k-1]);
        }
    }


