package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP: Object-Oriented Programming)
        // 유지보수 용이
        // 높은 재사용성

        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상

        // 우리가 만든 첫 번째 제품
        String modelName = "까망이;";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        // 새로운 제품을 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        // 또 다른 제품을 개발?

        // 클래스는 서로 다른 자료형이지만 서로 비슷한 것들끼리 모아둔 어떤 하나의 형태라고 보면 된다!
        // 클래스로 만들어지는 것을 "객체"라고 한다!

        BlackBox bbox = new BlackBox();
        // 클래스명 //객체이름 = //new 뒤에 클래스명 ();
        // BlackBox 클래스로부터 bbox 객체 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스라고 한다.

        // 클래스는 설명서, 설계도라고 생각하고 객체는 그 설계도로 부터 만들어진 결과물이라고 생각하면 된다!

        // class(클래스), object(객체)

        BlackBox bbox2 = new BlackBox();
    }
}
