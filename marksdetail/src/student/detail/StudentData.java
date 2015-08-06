package student.detail;

import org.apache.struts.action.ActionForm;

public class StudentData extends ActionForm{
	
	private String rollno;

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
}
