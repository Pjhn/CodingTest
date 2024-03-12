package codingtst.stackqueue;

import java.util.Stack;

public class PostfixCalculate {

    public static int calculate(String expression) {
        Stack<Integer> stack = new Stack<>();

        //expression.split("\\s") 스페이스, 텝, 줄바꿈 등의 기준으로 나눔
        //또는 문자열 나누고 싶을 때는 StringTokenizer 사용
        for (String token : expression.split("\\s")) {
            if (isOperator(token)) {
                int B = stack.pop();  // 먼저 pop하는 값이 두 번째 피연산자
                int A = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(A + B);
                        break;
                    case "-":
                        stack.push(A - B);
                        break;
                    case "*":
                        stack.push(A * B);
                        break;
                    case "/":
                        stack.push(A / B);
                        break;
                    case "%":
                        stack.push(A % B);
                        break;
                }
            } else {  // 피연산자인 경우
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("%");
    }

    public static void main(String[] args) {
        String postfix = "3 4 + 2 * 7 /";
        System.out.println("Result: " + calculate(postfix));
    }
}
