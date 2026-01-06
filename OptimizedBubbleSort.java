public class OptimizedBubbleSort {

    //Time Complexity = O(n^2)
    /* worst case = O(n^2)
    best case = O(n)
    Space complexity = O(1)

     */

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        boolean swapped = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;


                }
            }

            //when array is sorted

            if ( !swapped ) {
                break;
            }
        }
    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 8};

        bubbleSort(arr);

        System.out.println("SORTED ARRAY");

        for (int num : arr){
            System.out.println(num + " ");
        }
    }

}