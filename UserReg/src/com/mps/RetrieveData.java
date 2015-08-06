package com.mps;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetrieveData {
	List list = new ArrayList<>();
  
  public List getData() {

    Session sess = null;
    Transaction tran = null;
    try{
      SessionFactory sessFact = new Configuration().configure().buildSessionFactory();
      sess = sessFact.openSession();
      tran = sess.beginTransaction();
      list = sess.createQuery("from UserInformationForm").list();
   /*   Iterator itr = list.iterator();
      while(itr.hasNext()){
    	  UserInformationForm userinfo = (UserInformationForm) itr.next();
        System.out.print("First Name: "+ userinfo.getFirstName());
        System.out.print("Last Name: "+ userinfo.getLastName());
        System.out.print("Gender: "+ userinfo.getGender());
        System.out.print("Age "+ userinfo.getAge());
        System.out.print("Address: "+ userinfo.getAddress());
        System.out.println();
      }*/
      tran.commit();
    }
    catch(Exception ex){
      ex.printStackTrace();
    }
    finally{
      sess.close();
    }
	return list;
  }

}