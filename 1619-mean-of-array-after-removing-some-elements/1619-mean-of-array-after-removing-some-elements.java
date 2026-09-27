class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        int sum = 0;

        Arrays.sort(arr);

        int fivePercent = (5 * n) / 100;
        for (int i = fivePercent; i < n - fivePercent; i++) {
            sum += arr[i];
        }
        return (double) sum / (n - 2 * fivePercent);
    }
}