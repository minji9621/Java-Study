package day03;

public class Ex01 {
    String str = "hello java"; 
    int year = 2020; 

    public void printStr() {
        System.out.println("str 변수의 값: " + str);
    }
    public void printYear() {
        System.out.println("year 변수의 값: " + year);
    }
    
    // 메인 메서드
    public static void main(String[] args) {
        // Ex01 객체 생성
        Ex01 example = new Ex01();
        
        // 인스턴스 메서드 호출
        example.printStr();
        example.printYear();
    }
}
