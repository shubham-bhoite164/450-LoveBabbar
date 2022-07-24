public class Q2_MinMaxInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.print("Minimum Element is :");
        min(arr);
        System.out.print("Maximum Element is :");
        max(arr);
    }

    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    static void max(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
