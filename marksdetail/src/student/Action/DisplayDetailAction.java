package student.Action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import student.detail.Marks;
import student.detail.Student;
import student.detail.StudentForm;
import student.hibernate.FetchData;
public class DisplayDetailAction extends Action{
	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";
	  public ActionForward execute(ActionMapping mapping, ActionForm form,
	            HttpServletRequest request, HttpServletResponse response)
	            throws Exception {
		 List<StudentForm> studentlist1 = new ArrayList<StudentForm>();
		  List<Student> studentlist=new ArrayList<Student>();
		 //StudentForm studentForm=new StudentForm();
		 FetchData fetchData=new FetchData();
		 studentlist=fetchData.fetchData();
		 Iterator<Student> itr=studentlist.iterator();
	/*	 while(itr.hasNext())
			{
				Student stu=itr.next();
				System.out.println(stu.getName());
				System.out.println(stu.getGender());
				System.out.println(stu.getAge());
				System.out.println(stu.getRollno());
				List<Marks> list2=stu.getMarks();  
			
				   Iterator<Marks> itr2=list2.iterator();  
			        while(itr2.hasNext()){  
			            System.out.println(itr2.next().getSubject());
			            System.out.println(itr2.next().getMarks());
			            System.out.println(itr2.next().getMaxMarks());
			        } 
			}*/
		 while(itr.hasNext())
		 {
			 StudentForm studentForm=new StudentForm();
			 Student stu=itr.next();
			 
			 studentForm.setName(stu.getName());
			 System.out.println("Name :"+stu.getName());
			 studentForm.setGender(stu.getGender());
			 System.out.println("Gender :"+stu.getGender());
			 studentForm.setRollno(stu.getRollno());
			 System.out.println("Roll No:"+stu.getRollno());
			 studentForm.setAge(stu.getAge());
			 System.out.println("Age :"+stu.getAge());
			 Iterator<Marks> itr2=stu.getMarks().iterator();
			 while(itr2.hasNext())
			 {
				 Marks marks=itr2.next();
				 studentForm.setSubject(marks.getSubject());
				 System.out.println("subject :"+marks.getSubject());
				 studentForm.setMarks(marks.getMarks());
				 System.out.println("Marks :"+marks.getMarks());
				 studentForm.setMaxMarks(marks.getMaxMarks());
				 System.out.println("Max Marks :"+marks.getMaxMarks());
			 }
			 studentlist1.add(studentForm);
		 }
		
		  request.setAttribute("studentlist1", studentlist1);
		  return mapping.findForward(SUCCESS);
	  }
}
