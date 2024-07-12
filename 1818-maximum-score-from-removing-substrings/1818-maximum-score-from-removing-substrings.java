class Solution {
    int value = 0;
    
    public int maximumGain(String s, int x, int y) {
        
        
        if(x >= y){
            String str =  helper(s,"ab",x);
            helper(str,"ba",y);
            
        }
        else{
            String str = helper(s,"ba",y);
            helper(str,"ab",x);
        }
        return value;
    }

    public String helper(String s, String target,int val){
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while( i < s.length()){
            if (!stack.isEmpty() && stack.peek() == target.charAt(0) && s.charAt(i) == target.charAt(1)) {

                    stack.pop();
                    value += val;
            }
            else{
                    stack.push(s.charAt(i));
            }
            i++;

        }

        StringBuilder remaning = new StringBuilder();

        while(!stack.isEmpty()){
            remaning.insert(0,stack.pop());
            // System.out.println(remaning);
        }

        return remaning.toString();

    }
}