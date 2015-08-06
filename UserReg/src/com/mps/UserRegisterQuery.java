package com.mps;  
  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
import com.mps.UserInformationForm;
  
public class UserRegisterQuery {  
public void UserRegistration(UserInformationForm user) {  
      
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory=cfg.buildSessionFactory();  
      
    Session session=factory.openSession();  
      
    Transaction t=session.beginTransaction();  
    session.persist(user); 
      
    t.commit();
    session.close();  
      
    System.out.println("successfully saved");  
      
}  
}  