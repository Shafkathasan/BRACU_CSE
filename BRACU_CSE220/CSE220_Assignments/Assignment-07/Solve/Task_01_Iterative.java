//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-07 : Recursion
package Assignment_07; // Remove This Line or Make a package

// Implementation of iterative Binary Search
public class Task_01_Iterative {
    // Returns index of x if it is present in arr[]
    // else return -1
    public static int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[mid] == x) {
                return mid;
            }

            // If x greater, ignore left half
            if (arr[mid] < x) {
                l = mid + 1;
            }

            // If x is smaller, ignore right half
            else {
                r = mid - 1;
            }
        }

        // If element was not present
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 10, 20};
        int x = 10;
        int result = binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element " + x + " found at index " + result);
        }
    }
}
