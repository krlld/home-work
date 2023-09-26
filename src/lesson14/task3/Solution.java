package lesson14.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public boolean isValid(String str) {
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else if (stack.empty()) {
                return false;
            } else if (map.get(stack.pop()) == c) {
                continue;
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}