package day01;
/* 
객체 생성
  자식 객체가 생성되는 것처럼 보이지만
  부모 객체가 생성된 후 자식 객체가 생성(사람과 같다) 
 
super();
  생략하면 컴파일러가 자동으로 추가함
  기본생성자 없고, 매개변수가 있는 생성자만 있다면
  반드시 매개변수가 있는 생성자를 호출해야 함 
  
this.와 this()와 super()
  문법적으로 반드시 생성자 내부에 첫 줄에 위치해야 함
*/

public class Student extends People {
	int studentNo;
	
	//생성자
	Student(String name, String peopleNo, int studentNo){
		super(name,peopleNo); //조상의 기본 생성자가 없음 -> 조상의 생성자를 반드시 호출해야 함
		this.studentNo = studentNo;
	}
}
