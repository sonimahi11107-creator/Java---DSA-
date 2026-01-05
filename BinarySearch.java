public class BinarySearch {

    // method declaration
    public static int binarySearch(int[] arr , int target){

        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low)/2;

            if (arr[mid] == target){
                return mid;
            }

            if ( target < arr[mid]){

                high = mid - 1;  // go to left

            } else {

                low = mid + 1 ; // go to right

            }
        }
        return -1;
    }

    public static void main(String[] args){


        int[] arr = { 10, 20, 30, 40, 50}; // sorted array

        int target = 20;

        int result = binarySearch(arr, target);

        if (result != -1){
            System.out.println("Found at index " + result);
        } else {
            System.out.println("Element not found ");
        }


    }
}
