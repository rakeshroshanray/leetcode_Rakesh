class Solution {

    private void dfs (int num, int n, int k,List<Integer> res ){
        if(n == 0){
            res.add(num);
            return;
        }
        int lastDigit = num%10;
        if(lastDigit + k <= 9){
            dfs(num*10 + lastDigit + k, n-1, k, res);
        }
        if(k != 0 && lastDigit - k >= 0){
            dfs(num*10 + lastDigit - k, n-1, k, res);   
        }
    }
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> res = new ArrayList<>();

        for(int num = 1; num <= 9; num++){
            dfs(num,n-1,k,res);
        }

        int[]reslist = new int[res.size()];
        for(int i = 0; i<res.size(); i++){
            reslist[i] = res.get(i);
        }
        return reslist;
    }
}