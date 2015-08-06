package student.hibernate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;






import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import student.detail.Marks;
import student.detail.MarksUpdate;
import student.detail.Student;
import student.detail.StudentData;
import student.detail.StudentUpdate;
import student.detail.UpdateStudent;

public class UpdateMarks {
	public List updateMarks(UpdateStudent student)
	{
		//StudentForm studentform = new StudentForm();
		//List<StudentForm> studentlist=new ArrayList<StudentForm>();
		List<Student> stulist=new ArrayList<Student>();
		List<Marks> markslist=new ArrayList<Marks>();
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		int rollno=1;//student.getRollno();
		int m=student.getMarks();
		/* String hql="update Student set marks = :marks where rollno = :rollno";
		 Query query=session.createQuery(hql);
		 query.setParameter("marks", m);
		 query.setParameter("rollno", studentRoll);
		 int result=query.executeUpdate();
		 System.out.println("Rows Affected :"+result);*/
		Student updateStudent = (Student) session.load(Student.class, rollno); 
		System.out.println("Name :"+updateStudent.getName());
		System.out.println("Size :"+updateStudent.getMarks().size());
  		System.out.println("objggs: "+updateStudent.getMarks());
		
  		markslist.addAll(updateStudent.getMarks());
  		System.out.println("marklist size: "+markslist.size());
  		Iterator<Marks> iter4=markslist.iterator();
  		Marks marup=new Marks();
  		while(iter4.hasNext())
  		{
  			marup=iter4.next();
  			marup.setMarks(m);
  		}
  		markslist.clear();
  		markslist.add(marup);
  		Student abc=new Student();
  		abc.setName(updateStudent.getName());
  		abc.setGender(updateStudent.getGender());
  		abc.setRollno(updateStudent.getRollno());
  		abc.setAge(updateStudent.getAge());
  		abc.setMarks(markslist);
  		
  		/*for(int i=0;i<markslist.size();i++)
  		{
  			markslist[i];
  		}*/
  		//marksUpdate.setMarks(m);
		//updateStudent.setMarks(marksUpdate);
		
		session.update(abc); 
       // session.persist(abc);
  		tx.commit();
     Transaction tx1=session.beginTransaction();
		 String hql1="from Student where rollno="+student.getRollno();
		 Query query1=session.createQuery(hql1); 
		 stulist=query1.list();
		tx1.commit();
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
