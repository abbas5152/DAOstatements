import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class LessSalary {
	public static void main(String[] args) throws EmpException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter salary");
		int id=s.nextInt();
		
		 emp e= new empimp();
		 List<Employee> list=e.getEmployeeDetailsbylesssalary(id);
	 
	 list.forEach(so ->{
			
			
			System.out.println(so);
			
			
		});
	 }
	}


