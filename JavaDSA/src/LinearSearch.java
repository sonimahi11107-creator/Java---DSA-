public class LinearSearch {
    // function
    public static int linearSearch( int[] arr, int target){ // array define , target - variable to store the value we search

        //for loop to check
    for (int i = 0; i < arr.length ; i++){

        if (arr[i] == target){

            return i ;

        }

    }

    return -1;

    }

    //main function
    public static void main(String[] args){

        int[] marks = {45,20,78,66,71,25};

        int target = 78;

        int result = linearSearch(marks,target);

        if (result != -1 ){
            System.out.println("Element found at index " +result);
        } else {
            System.out.println("Not Found");
        }
    }
}
