package com.mps;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.mps.UserRegistration;
public class UserRegistrationAction extends Action{
	  private final static String SUCCESS = "success";
		private final static String FAILURE = "failure";
	  public ActionForward execute(ActionMapping mapping, ActionForm form,
	            HttpServletRequest request, HttpServletResponse response)
	            throws Exception {
		  UserRegisterQuery userre= new UserRegisterQuery();
		   // UserRegistration userreg = new UserRegistration();
	        UserInformationForm userinfo =(UserInformationForm) form;
	       // userreg.newuserregistration(userinfo.getFirstName(),userinfo.getLastName(),userinfo.getGender(),userinfo.getAge(),userinfo.getAddress());
	        userre.UserRegistration(userinfo);
	        return mapping.findForward(SUCCESS);
	  }
}
