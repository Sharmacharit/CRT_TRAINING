//code4: Evaluate Logical Expression with A=AND, B=OR, C=XOR

public class EvaluateLogicExpression {

    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";
        char[] arr = str.toCharArray();
        int result = Character.getNumericValue(arr[0]);

        for (int i = 1; i < arr.length; i += 2) {
            int num = arr[i + 1] - '0';
            switch (arr[i]) {
                case 'A':
                    result = result & num;
                    break;
                case 'B':
                    result = result | num;
                    break;
                case 'C':
                    result = result ^ num;
                    break;
            }
        }

        System.out.println("Result: " + result);

        // Test Cases:
        // str="1C0C1C1A0B1" => Expected: 1
        // str="1A1B0C1" => Evaluates accordingly
    }
}
