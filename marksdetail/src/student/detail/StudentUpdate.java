package student.detail;

import java.util.List;

public class StudentUpdate {
	private int id; 
	private String name;
	private String gender;
	private int age;
	private int rollno;
	private List<MarksUpdate> marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public List<MarksUpdate> getMarks() {
		return marks;
	}
	public void setMarks(List<MarksUpdate> marks) {
		this.marks = marks;
	}


}
