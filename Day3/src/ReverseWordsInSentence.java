// PROG 7: Reverse Each Word in a Sentence
import java.util.*;

public class ReverseWordsInSentence {

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = reverseString(words[i]);
        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}

/*
Test Cases:
1) Input: "hello world" → Output: "olleh dlrow"
2) Input: "java programming" → Output: "avaj gnimmargorp"
3) Input: "abcd efgh" → Output: "dcba hgfe"
*/
