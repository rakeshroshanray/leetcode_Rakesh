class Solution {
    public boolean judgeSquareSum(int c) {
        long i = 0;
        long j = (int) Math.sqrt(c)+1;
        long num = c;
        while (i <= j) {
            long sum = (i * i) + (j * j);
            // System.out.print(sum+ " ");
            // System.out.print(i+ " ");
            // System.out.println(j+ " ");
            if (sum == num) {
                return true;
            } else if (sum > num) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}
