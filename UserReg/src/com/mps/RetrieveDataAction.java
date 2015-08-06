package com.mps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RetrieveDataAction extends Action{
	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";
	  public ActionForward execute(ActionMapping mapping, ActionForm form,
	            HttpServletRequest request, HttpServletResponse response)
	            throws Exception {
		  List userList = new ArrayList<>();
		  List list = new ArrayList<>(); 
		  RetrieveData rd = new RetrieveData();
		  list=rd.getData();
		  Iterator itr = list.iterator();
	      while(itr.hasNext()){
	    	UserInformationForm userinfo = (UserInformationForm) itr.next();
	    	userList.add(userinfo);
	    	System.out.print("First Name: "+ userinfo.getFirstName());
	        System.out.print("Last Name: "+ userinfo.getLastName());
	        System.out.print("Gender: "+ userinfo.getGender());
	        System.out.print("Age "+ userinfo.getAge());
	        System.out.print("Address: "+ userinfo.getAddress());
	        System.out.println();
	      }
	      request.setAttribute("userList", userList);
		  return mapping.findForward(SUCCESS);
	  }

}
