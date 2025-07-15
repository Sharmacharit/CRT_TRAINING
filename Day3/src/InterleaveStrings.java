// PROG 2: Interleave Characters of Two Strings
import java.util.*;

public class InterleaveStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = "abc";
        String str2 = "xyz123";

        int lenstr1 = str1.length();
        int lenstr2 = str2.length();
        int max = Math.max(lenstr1, lenstr2);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < max; i++) {
            if (i < lenstr1) {
                result.append(str1.charAt(i));
            }
            if (i < lenstr2) {
                result.append(str2.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
}

/*
Test Cases:
1) str1="abc", str2="xyz123" → Output: "axbycz123"
2) str1="ab", str2="xyz" → Output: "axbyz"
3) str1="pqrs", str2="12" → Output: "p1q2rs"
*/
