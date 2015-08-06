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

import student.detail.Student;
import student.detail.StudentForm;
import student.exception.InvalidFormatException;
import student.hibernate.StoreData;

public class StudentDetailAction extends Action{
	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";
	  public ActionForward execute(ActionMapping mapping, ActionForm form,
	            HttpServletRequest request, HttpServletResponse response)
	            throws InvalidFormatException{
		  try
		  {
			  StudentForm studentform=(StudentForm)form;
			  	// String roll = studentform.getRollno();
			  //  if(roll.matches("[0-9]+"))
			  // new InvalidFormatException("only numerics are allowed");
			  StoreData sd = new StoreData();
			  sd.saveDetail(studentform);
			  
		  }
		  catch(InvalidFormatException e)
		  {
			  System.out.println(e);
		  }
		  return mapping.findForward(SUCCESS);
		  }
}
