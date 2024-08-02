package day03;

public class StudentMain {
    public static void main(String[] args) {
        // Student 객체 생성
        Student student = new Student("minji", 28);

        // 학생 정보 출력
        System.out.println("학생 정보:");
        System.out.println("이름: " + student.getName());
        System.out.println("나이: " + student.getAge());
        
        // toString 메서드를 이용한 출력
        System.out.println("toString() 메서드 출력 : ");
        System.out.println(student.toString());
    }
}