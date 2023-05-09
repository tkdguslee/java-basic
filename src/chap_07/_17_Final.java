package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final

        // public (final) class ...
        // public (final) void ...
        // public > abstract > static > final > ...

        // 변하지 않는 수인 상수를 자바에서는 final이라는 예약어를 사용하여 선언한다.
        ActionCam actionCam = new ActionCam();
//        actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("-----------------------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makeVideo();
    }
}
