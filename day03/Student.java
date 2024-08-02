package day03;

public class Student {
	    // 학생의 이름
	    private String name;
	    
	    // 학생의 나이
	    private int age;

	    // 생성자
	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // name 변수의 getter
	    public String getName() {
	        return name;
	    }

	    // name 변수의 setter
	    public void setName(String name) {
	        this.name = name;
	    }

	    // age 변수의 getter
	    public int getAge() {
	        return age;
	    }

	    // age 변수의 setter
	    public void setAge(int age) {
	        if (age < 0) {
	            throw new IllegalArgumentException("Age cannot be negative.");
	        }
	        this.age = age;
	    }

	    // 학생 정보를 문자열로 반환
	    @Override
	    public String toString() {
	        return "Student{name='" + name + "', age=" + age + "}";
	    }
	}
