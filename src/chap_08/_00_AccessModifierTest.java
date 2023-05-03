package chap_08;

import chap_07.*;
// import chap_07.BlackBoxRefurbish; // 07에 패키지에 있는 BlackBoxRefurbish를 쓰겠다라는 뜻이다!
// import chap_07. * // 07 패키지에 있는거 다부른다

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public
        // b1.resolution = "FHD"; // default
        // b1.price = 200000; // private
        // b1.color = "블랙"; // protected

        BlackBox b2;
    }
}
