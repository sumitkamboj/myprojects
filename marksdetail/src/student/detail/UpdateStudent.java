package student.detail;

import org.apache.struts.action.ActionForm;

/**
 * @author rahul.s
 *
 */
public class UpdateStudent extends ActionForm{
	private int rollno;
	private int marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

}
