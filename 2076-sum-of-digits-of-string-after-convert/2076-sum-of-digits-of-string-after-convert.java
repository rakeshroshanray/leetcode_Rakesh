class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
            int val = ch - 'a'+ 1;
            str.append(val);
        }
        String digits  = str.toString();
        
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum = 0;

            for(char digit : digits.toCharArray()){
                sum += digit -'0';
            }
            digits = Integer.toString(sum);
        }

        return sum;
    }
}