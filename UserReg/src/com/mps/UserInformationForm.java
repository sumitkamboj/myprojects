package com.mps;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class UserInformationForm extends ActionForm{

		private String firstName;
		private String lastName;
	    private String gender;
	    private int age;
	    private String address;
	    public String getFirstName() {
	    	return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
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
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
	// TODO Auto-generated method stub
	super.reset(mapping, request);
	}
}
