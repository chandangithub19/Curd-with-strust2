package dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import action.EmployeeAction;
import entity.Employee;
import util.HibernateUtil;
public class EmployeeDao 
{
	public Employee addEmp(Employee emp)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.save(emp);
		t.commit();
		session.close();
		return emp;
	}
	
public List<Employee> getEmp() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Employee> emps = null;
		try {
			
			emps = (List<Employee>)session.createQuery("from Employee").list();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		return emps;
	}

public Employee delete(Employee emp) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
	try
	{
	Employee emp1 = (Employee) session.get(Employee.class,emp.getId());
	if(emp1 != null) {
		System.out.println("gggggggggggggg"+emp.getId());
		session.delete(emp1);
	}
	}
	catch (Exception e) {  
        e.printStackTrace();  
        session.getTransaction().rollback();  
    }  
	session.getTransaction().commit();
	session.close();
	return emp;
}

public Employee beforeUpdate(Employee emp)
{  
    Session session = HibernateUtil.getSessionFactory().openSession();  
    Transaction t=session.beginTransaction();  
    Employee emp1 = (Employee) session.get(Employee.class, emp.getId()); 
    
    try {  
    if(emp1 != null) {
    	emp.setName(emp1.getName());
    	emp.setMobile(emp1.getMobile());
    	emp.setEmail(emp1.getEmail());
    	emp.setDob(emp1.getDob());
        
    }  
    } catch (Exception e) 
    {  
        e.printStackTrace();  
        session.getTransaction().rollback();  
        session.close(); 
    }  
        t.commit();  
        session.close();
       
        return emp;

  }        

public String update(Employee emp)
{  
		Session session = HibernateUtil.getSessionFactory().openSession();  
	    Transaction t= session.beginTransaction();  
	    try {  
	        if(emp != null)
	        {
	        	session.saveOrUpdate(emp); 
	            t.commit();
	        }  
	          
	        } catch (Exception e) {  
	            e.printStackTrace();  
	            session.getTransaction().rollback();  
	           
	        }  
	            //session.getTransaction().commit();       
	            session.close(); 
        return null;

  }        
}


