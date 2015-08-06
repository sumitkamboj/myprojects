package student.hibernate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import student.detail.Marks;
import student.detail.Student;
import student.detail.StudentData;

public class StudentGetData {
	public List getStudentData(StudentData student)
	{
		//StudentForm studentform = new StudentForm();
		//List<StudentForm> studentlist=new ArrayList<StudentForm>();
		List<Student> stulist=new ArrayList<Student>();
		List<Marks> markslist=new ArrayList<Marks>();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		String hql="from Student where rollno="+student.getRollno();
		System.out.println("hql :"+hql);
		 Query query=session.createQuery(hql); 
		stulist=query.list();
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
