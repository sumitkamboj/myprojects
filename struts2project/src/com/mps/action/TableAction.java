package com.mps.action;

import java.util.ArrayList;

import com.mps.dao.TableDao;
import com.mps.model.LibraryCode;
import com.mps.model.TableModel;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TableAction extends ActionSupport implements ModelDriven<LibraryCode> {
	 ArrayList<TableModel> list = new ArrayList<TableModel>();
	 LibraryCode libCodeobj = new LibraryCode();
	 private String libCode;
	public ArrayList<TableModel> getList() {
		return list;
	}
	public void setList(ArrayList<TableModel> list) {
		this.list = list;
	}
	private TableModel tm = new TableModel();
	/*private String institutionName;

	public String getInstitutionName() {
		System.out.println("get model :"+institutionName);
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		System.out.println("model : "+institutionName);
		this.institutionName = institutionName;
	} 
	
	public TableModel getTm() {
		return tm;
	}
	public void setTm(TableModel tm) {
		this.tm = tm;
	}*/
	public String execute()
	{
		TableDao td = new TableDao();
		list=td.getListTableModel();
		System.out.println("list "+list);
		return SUCCESS;
	}
	public LibraryCode getModel()
	{
		return libCodeobj;
	}
	
}
