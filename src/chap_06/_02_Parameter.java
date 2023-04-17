package chap_06;

public class _02_Parameter {
    // 전달값이 있는 메소드이다.
    public static void power(int number) { // 이때 number는 Parameter(=매개변수)라고 한다. 쉽게 전달값이라고 생각해라!
        // 메소드의 전달값은 하나말고! 2개이상 여러개를 정의 할 수 있다.
        int result = number * number;
        System.out.println(number + " 의 2 승은 " + result);

    }

    // 여러개의 전달값을 받는 메소드이다.
    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result);
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        // Argument, 인수라고 한다 이 밑에 있는 것을!
        power(2); // 2 * 2 = 4
        power(3); // 3 * 3 = 9

        powerByExp(2, 3); // 2 * 2 * 2 = 8
        powerByExp(3, 3); // 3 * 3 * 3 = 27
        powerByExp(10, 0); // 1
    }

}
