package chap_06;

public class _01_Method {
    // 메소드 정의한거다.
    public static void sayHello() {
        System.out.println("안녕하세요? 메소드입니다.");
    }


    public static void main(String[] args) {
        // 메소드를 배워보자
        // 메소드란? 어떤 기능을 하는 묶음이다

        // 메소드를 호출하자.
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
