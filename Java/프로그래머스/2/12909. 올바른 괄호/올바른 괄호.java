import java.util.*;
class Solution {
    boolean solution(String s) {
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<c.length; i++) {
            if(c[i] == '(') stack.push(c[i]);
            else {
                if(stack.isEmpty() == true) return false;
                else stack.pop();
            }
        }
        if(stack.size() != 0) return false;
        else return true;
    }
}