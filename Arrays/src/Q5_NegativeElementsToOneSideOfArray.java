import java.util.Arrays;

public class Q5_NegativeElementsToOneSideOfArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,-2,34,-23,34,-23,-1,-234};
        sort(arr);
    }

    static void sort(int arr[]){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
