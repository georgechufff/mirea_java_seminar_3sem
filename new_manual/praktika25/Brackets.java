import java.util.*;

public class Brackets {
    private static boolean isCorrectBrackets(String input) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (brackets.containsValue(c))
                stack.push(c);
            else if (brackets.containsKey(c))
                if (stack.isEmpty() || stack.pop() != brackets.get(c))
                    return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String var1 = "(abc*-ab)";
        String var2 = "(({}[()]))";
        String var3 = "(()";
        String var4 = "((]";
        System.out.println(var1 + ": " + isCorrectBrackets(var1));
        System.out.println(var2 + ": " + isCorrectBrackets(var2));
        System.out.println(var3 + ": " + isCorrectBrackets(var3));
        System.out.println(var4 + ": " + isCorrectBrackets(var4));
    }
}