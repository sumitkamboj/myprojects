package com.mps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mps.action.TableAction;
import com.mps.model.LibraryCode;
import com.mps.model.TableModel;


public class TableDao {
		private Connection connection;
		DBConnection dbcon = new DBConnection();
		public TableDao(){
			connection=dbcon.getConnection();
		}
		/*public String getInstitutionName(){
			return InstitutionName;
		}*/
		TableAction ta = new TableAction();
		public ArrayList<TableModel> getListTableModel()
		{
			ArrayList<TableModel> list = new ArrayList<TableModel>();
			LibraryCode libCode = new LibraryCode();
			System.out.println("tableDao :"+LibraryCode.libCode1);
			PreparedStatement ps = null;
			try
			{
				ps=connection.prepareStatement("Select institution_name, YTD from accounts where institution_name ='"+LibraryCode.libCode1+"'");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
					{
						TableModel tm = new TableModel();
						tm.setInstitutionName(rs.getString("institution_name"));
						tm.setYTD(rs.getString("YTD"));
						list.add(tm);
					}
				 	
			}
			catch(Exception e)
		 	{
		 		System.out.println(e.getMessage());
		 	}
			return list;
		}
}
