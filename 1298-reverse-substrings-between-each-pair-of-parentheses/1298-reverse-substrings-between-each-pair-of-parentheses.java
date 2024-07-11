class Solution {
    public String reverseParentheses(String s) {

        Stack<Character> stack = new Stack<>();

        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);

            if(ch == ')'){

                StringBuilder str = new StringBuilder ();
                while(stack.peek() != '(' ){
                    str.append(stack.pop());
                }
                stack.pop();
                for(int j = 0; j < str.length(); j++){
                    stack.push(str.charAt(j));
                }
            }
            else{
                stack.push(ch);
            }
            i++;
        }
       // String result = "";
       StringBuilder result = new StringBuilder ();
        while(!stack.isEmpty()){
            result.insert(0,stack.pop());
            // = stack.pop()+result;
        }
        return result.toString();
    }
    
}