package chap_06;

public class _03_Return {

    // public static void(-> 여기는 반환하는 형태?자료형?을 적어줘야한다... 메소드가 동작을 수행하고나서 반화해줄 자료형, 또는 형태를 적어주면된다.)
    // void를 적었다면 "반환 값이 없는 메소드야" 라는 뜻이다.
    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    // 호텔 주소
    public static String getAddress() {
        return "서울시 어딘가";
    }

    // 호텔 엑티비티
    public static String getActivities() {
        //여기서 String은 boolean, int, double 등등 다양한 형태가 가능하다! 나는 String 문자열을 쓰고 싶기때문에 String을 썼다.
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        // 반환 값, Return
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소 : " + address);

        System.out.println("호텔 액티비티 : " + getActivities());
    }
}
