package chap_07;

public class BlackBox {
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    // 인스턴스변수 또는 필드라고도 함
    int serialNumber; // 시리얼 번호
    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (처음엔 0이었다가 ++ 연산을 통해서 값을 증가) 1, 2, ...
    static boolean canAutoReport = false; // 자동 신고 기능
    // 여기서 static을 붙이면 클래스 변수라고함

    // 생성자는 보통 변수들 밑에 적어준다.
    // 생성자를 만드는 방법은 클래스 명과 똑같이 만들어주면 된다.
    // 생성자는 반환형이 따로 없다.
    // 객체가 생성될때 자동으로 그냥 호출되는 메소드로 이해하면 된다.
    BlackBox() {
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
        this(); // 기본 생성자 호출

        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        }
        else if (type == 2) { // 이벤트 영상
            return 1;
        }
        return 10;
    }

    // showDateTime : 날씨정보 표시여부
    // showSpeed : 속도정보 표시여부
    // min : 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }
    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
        // this.라고 적어주면 이 클래스의 인스턴스 변수에 직접 바로 접근할 수 있다.

        // 다시 복습!
        // 메소드 내에서 사용하려는 인스턴스 변수와 파라미터 변수의 이름이 똑같다라고 하면 this.을 붙여가지고
        // 이건 인스턴스 변수야라고 명확히 알 수 있다. 물론 뒤에 이름이 다르다면 this.을 안적어줘두된다!
    }
}
