package chap_07;

public class _08_Constructor {
    // 생성자
    // 생성자라는 것은 우리 객체가 만들어질때 자동으로 호출되는 메소드라고 생각하면된다.
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);

        System.out.println("---------------------");

        BlackBox b2 = new BlackBox("하양이", "UHD", 300000, "화이트");
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);
    }
}
