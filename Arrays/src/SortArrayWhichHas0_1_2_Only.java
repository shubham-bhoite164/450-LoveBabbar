import java.util.Arrays;

public class SortArrayWhichHas0_1_2_Only {
    public static void main(String[] args) {
        // Sorting an array which has only 0,1,2.
        int arr[] = {0,2,1,0,2,1,0};
//        sort(arr);
        naw(arr);
    }
//    static void sort(int arr[]){
//        int temp = 0;
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 1; j < arr.length ; j++) {
//                if (arr[i]>arr[j]) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                    System.out.println(arr[i]);
//                }
//            }
//        }
//
//    }

    static void naw(int arr[]){
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
