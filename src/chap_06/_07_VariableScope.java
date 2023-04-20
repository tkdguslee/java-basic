package chap_06;

public class _07_VariableScope {

    public static void methodA() {
//        System.out.println(number);
//        System.out.println(result);
    }

    public static void methodB() {
        int result = 1; // 지역 변수? 변수가 선언된 그 영역 내에서만 사용할 수 있는 변수이다. { } 중괄호 속에서만 쓸 수가 있다. 벗어나면 에러가 난다.
    }
    public static void main(String[] args) {
        // 변수 범위

        int number = 3;

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        {
            int j = 0;
            System.out.println(j);
            System.out.println(number);
        }
        //System.out.println(j);

//        System.out.println(result);
    }
}
