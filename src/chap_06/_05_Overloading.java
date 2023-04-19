package chap_06;

public class _05_Overloading {

    public static int getPower(int number) { // "4"
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    // 메소드 오버로딩을 쓰려면 전달값의 타입이 다르거나 또는 전달 값이 갯수가 서로 다르면 이렇게 같은 이름의 메소드를 여러번 정의 할 수 있다!
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 이름이 같은 메소드를 여러개 만드는 것이 오버로딩이다!
        // 조건
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나 를 만족하면 메소드 오버로딩이 가능해진다!
        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3,3)); // 3 * 3 * 3 = 27

    }
}
