public class Q6_UnionAndIntersectionOfTwoArrays {
    public static void main(String[] args) {
        // We have to find union of two arrays
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {5,6,7,8,9};
        union(arr1,arr2);
    }

    static void union(int arr1[], int arr2[]){
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length ; j++) {
                if (arr1[i]>arr2[j]){
                    i++;
                    System.out.println(i);
                } else if (arr1[i]<arr2[j]) {
                    j++;
                    System.out.println(j);
                }
                else
                    j++;
            }
        }
    }
}
