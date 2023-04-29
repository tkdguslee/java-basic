package chap_07;

public class BlackBox {
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    // 인스턴스변수 또는 필드라고도 함
    static boolean canAutoReport = false; // 자동 신고 기능
    // 여기서 static을 붙이면 클래스 변수라고함

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
