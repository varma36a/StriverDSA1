import java.util.*;

class Solution {
    static int partition(List<Integer> arr, int s, int e) {
        int l = s+1;
        int r = e;

        while (l < =r) {
            if(arr[l]<arr[s])
            l++;
            else if(arr[r]>arr[a])
            r--;
            else{
                swap<int>(ref arr[l],ref arr[r]);
                l++;
                r--;
            }
        }
       
        swap<int>(ref arr[l-1],ref arr[s]);
        return l-1;

    }

    static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }
    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here.
        qs(arr, 0, arr.size() - 1);
        return arr;
    }
}

public class tUf {
    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
        int n = arr.size();
        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr = Solution.quickSort(arr);
        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

} 