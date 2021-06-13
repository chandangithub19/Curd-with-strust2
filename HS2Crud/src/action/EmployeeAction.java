package action;
import java.util.List;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.EmployeeDao;
import entity.Employee;



public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    private String name;
    private String mobile;
    private String email;
    private String dob;
    private List<Employee> empList;
	private Employee employee=new Employee();
	private EmployeeDao dao=new EmployeeDao();;
	
	public Employee getModel()
	{
		return employee;
	}
	
	public String execute()
	{
		return SUCCESS;
	}
	
	
	public String addEmp()
	{   
		
		dao.addEmp(employee);
		return SUCCESS;
	}
	
	
	 public String getEmp()
	 {
		 this.empList=dao.getEmp();
		 return SUCCESS;
	 }

	 
	 
	 public String delete() {  
         
	       System.out.println("id value="+employee.getId()); 
	        try {  
	              
	             dao.delete(employee);  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }    
	        return SUCCESS;  
	    }      
	   
	 public String beforeUpdate()
		{   
			
			try
			{
				
			dao.beforeUpdate(employee);
			
			}
			catch (Exception e) {  
	            e.printStackTrace();
			}
			return SUCCESS;
		}
		
	public String update()
	{ 
		dao.update(employee);
	return SUCCESS;
	}
	
	
	public int getId() {
		return id;
	}

	public void getId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeDao getDao() {
		return dao;
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	/*@Override
	public void validate() {
	      if (name == null || name.trim().equals("")) {
	         addFieldError("name","The name is required");
	      }
	      
	      if (mobile == null || mobile.trim().equals("")) {
		         addFieldError("mobile","The mobile is required");
		      }
	      if (email == null || email.trim().equals("")) {
		         addFieldError("email","The email is required");
		      }
	      if (dob == null || dob.trim().equals("")) {
		         addFieldError("dob","The dob is required");
		      }
	}*/
}
