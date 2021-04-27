package ObjectInputStream_ObjectOutputStream;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private int age;
	private float mark;
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, float mark) {
		super();
		this.name = name;
		this.age = age;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mark=" + mark + "]";
	}
	
}
