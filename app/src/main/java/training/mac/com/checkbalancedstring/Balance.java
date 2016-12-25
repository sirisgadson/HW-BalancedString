package training.mac.com.checkbalancedstring;

import java.util.Stack;

/**
 * Created by Siris on 12/23/2016.
 */

public class Balance {

    public boolean isBalancedString(String b) {

        b = "(){}[";

        Stack<Character> stak = new Stack<Character>();

        int length = b.length();

        for (int i = 0; i < length; i++) {
            char c = b.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                stak.push(c);
            }
            else if (c == ']') {
                if(stak.isEmpty()) return false;
                if(stak.pop() != '[') return false;
            }
            else if (c == ')') {
                if(stak.isEmpty()) return false;
                if(stak.pop() != '(') return false;
            }
            else if (c == '}') {
                if(stak.isEmpty()) return false;
                if(stak.pop() != '{') return false;
            }
        }

        return stak.isEmpty();
    }

    public static void main(String[] args) {
        boolean result = new Balance().isBalancedString("()[]{}");
        System.out.println(result);
    }
}
