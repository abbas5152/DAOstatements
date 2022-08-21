import java.util.List;

public interface emp {
	
	public int getEmployeeSalarybyId(int id)throws EmpException;
	
	public List<Employee> getalldetails() throws EmpException;
	
	public String getBonus(int bonus);
//	
	public String InsertEmpDetails(int id,String name,int salary) throws EmpException;
//	
	public List<Employee> getEmployeeDetailsbyId(int id)throws EmpException;
//	
	public List<Employee> getEmployeeDetailsbylesssalary(int salary)throws EmpException;
//	
//	
	
	
	
	

}
