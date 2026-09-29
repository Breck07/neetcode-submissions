class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> matchingBrackets = new HashMap<>();
        matchingBrackets.put(')', '(');
        matchingBrackets.put(']', '[');
        matchingBrackets.put('}', '{');

        char[] array = s.toCharArray();

        for(char c : array){
            if(matchingBrackets.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == matchingBrackets.get(c)){
                    stack.pop();
                } else{
                    return false;
                }
            } else{
                stack.push(c);
            }
        }

        return stack.isEmpty();

    }
}
