package student.hibernate;
import java.util.ArrayList;  
import java.util.List;

import org.hibernate.*;  
import org.hibernate.cfg.*;

import student.detail.Marks;
import student.detail.Student;
import student.detail.StudentForm;
import student.exception.InvalidFormatException;

public class StoreData {
	public void saveDetail(StudentForm stuobj) throws InvalidFormatException{  
	  
	   
		Session session=new Configuration().configure("hibernate.cfg.xml")  
	                            .buildSessionFactory().openSession();  
	    Transaction t=session.beginTransaction();  
	    List<Marks> list = new ArrayList<Marks>();
	    Student stu = new Student();
	    int vdo=stuobj.getRollno();
	    if(vdo<100){
	    	throw new InvalidFormatException("Roll no should be three digit or more");
	    }
	    Marks mar = new Marks();
	    stu.setName(stuobj.getName());
	    stu.setGender(stuobj.getGender());
	    stu.setRollno(stuobj.getRollno());
	    stu.setAge(stuobj.getAge());
	    mar.setSubject(stuobj.getSubject());
	    mar.setMarks(stuobj.getMarks());
	    mar.setMaxMarks(stuobj.getMaxMarks());
	    list.add(mar);
	    stu.setMarks(list);
	    session.persist(stu);  
	    t.commit();  
	    session.close();  
	    System.out.println("success");
	   
	  }  
}  
