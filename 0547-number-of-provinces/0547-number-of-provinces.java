class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                res++;
                Queue<Integer> que = new LinkedList<>();
                que.add(i);
                vis[i] = true;
                while (!que.isEmpty()) {
                    int curr = que.remove();
                    for (int j = 0; j < n; j++) {
                        if (isConnected[curr][j] == 1 && !vis[j]) {
                            vis[j] = true;
                            que.add(j);
                        }
                    }
                }
            }
        }

        return res;
    }

}