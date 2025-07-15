// PROG 6: Toggle Case of a String
import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                res += Character.toLowerCase(ch);
            } else {
                res += Character.toUpperCase(ch);
            }
        }
        System.out.println(res);
    }
}

/*
Test Cases:
1) Input: "AbCd" → Output: "aBcD"
2) Input: "hello" → Output: "HELLO"
3) Input: "JAVA" → Output: "java"
*/
