public class BinaryRecur {
    public static void main(String args[]) {
        int[] arr = {1, 2, 5, 10, 22, 30};
        int target = 10;
        int start = 0;
        int end = arr.length - 1;
        int ans = search(arr, target, start, end);
        System.out.println(ans);
    }

    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;

        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;

        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }
        if (target > arr[m]) {
            return search(arr, target, m + 1, e);
        }
    return -1;
    }
}