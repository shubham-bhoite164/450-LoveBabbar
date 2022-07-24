public class Q1_ReverseArray {
    public static void main(String[] args) {
      
        // Reversing an Array
        int arr[] = {1,2,3,4,5};
        reverse(arr);
      
    }

    static void reverse(int arr[]){
      
        // we are traversing an array in reverse order!!!
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
