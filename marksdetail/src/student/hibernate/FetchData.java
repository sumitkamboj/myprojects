package student.hibernate;
import java.util.*;  

import org.hibernate.*;  
import org.hibernate.cfg.*;  

import student.detail.Marks;
import student.detail.Student;
import student.detail.StudentForm;

public class FetchData {

	public List fetchData()
	{
		//StudentForm studentform = new StudentForm();
		//List<StudentForm> studentlist=new ArrayList<StudentForm>();
		List<Student> stulist=new ArrayList<Student>();
		List<Marks> markslist=new ArrayList<Marks>();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		 Query query=session.createQuery("from Student"); 
		//Transaction tx=session.beginTransaction();
		stulist=query.list();
		//tx.commit();
		Iterator<Student> itr=stulist.iterator();
		while(itr.hasNext())
		{
			Student stu=itr.next();
			System.out.println(stu.getName());
			System.out.println(stu.getGender());
			System.out.println(stu.getAge());
			System.out.println(stu.getRollno());
			List<Marks> list2=stu.getMarks();  
		
			   Iterator<Marks> itr2=list2.iterator();  
		        while(itr2.hasNext()){  
		        	Marks mar=itr2.next();
		            System.out.println(mar.getSubject());
		            System.out.println(mar.getMarks());
		            System.out.println(mar.getMaxMarks());
		        } 
		}
		return stulist;
	}
}
