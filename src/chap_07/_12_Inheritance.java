package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;


public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        // 부모클래스에서 모든 것들을 자식들에게 갖다 쓴다!라는 뜻
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        System.out.println("-----------------------------");

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        System.out.println("-----------------------------");

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}


