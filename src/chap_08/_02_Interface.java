package chap_08;

import chap_08.reporter.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 추상클래스가 미완성된 클래스였다고 하면!!
        // 인터페이스는 뼈대만!! 제공하는 구조다.

        // 상속은 extends! 제약은 단일상속만 가능!
        // 하지만 인터페이스를 쓴다면 단일상속 문제 해결 쌉가능!


        // 인터페이스
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();
    }
}
