//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-07 : Recursion
package Assignment_07; // Remove This Line or Make a package

// Implementation of recursive Binary Search
public class Task_01_Recursive {
    // Returns index of x if it is present in arr[l..r], else
    // return -1
    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the middle
            if (arr[mid] == x) {
                return mid;
            }

            // If element is smaller than mid,
            // then it can only be present in left subarray
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            // Else the element can only be present in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // If element is not present in array
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 30};
        int x = 4;
        int result = binarySearch(arr, 0, arr.length - 1, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element " + x + " found at index " + result);
        }
    }
}
