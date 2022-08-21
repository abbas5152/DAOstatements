import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class tableinfo {
	
 public static void main(String[] args) {
	 
	 emp e= new empimp();
	 try {
	 
	 List<Employee> list=e.getalldetails();
 
 list.forEach(s ->{
		
		
		System.out.println(s);
		
		
	});
 }
	 catch (EmpException e1) {
			
			System.out.println(e1.getMessage());
			
			
		}
 }
 
}
