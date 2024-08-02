package day03;

public class Student {
	    // �л��� �̸�
	    private String name;
	    
	    // �л��� ����
	    private int age;

	    // ������
	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // name ������ getter
	    public String getName() {
	        return name;
	    }

	    // name ������ setter
	    public void setName(String name) {
	        this.name = name;
	    }

	    // age ������ getter
	    public int getAge() {
	        return age;
	    }

	    // age ������ setter
	    public void setAge(int age) {
	        if (age < 0) {
	            throw new IllegalArgumentException("Age cannot be negative.");
	        }
	        this.age = age;
	    }

	    // �л� ������ ���ڿ��� ��ȯ
	    @Override
	    public String toString() {
	        return "Student{name='" + name + "', age=" + age + "}";
	    }
	}
